/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import conexionEM.Conexion;
import dtos.RepoVentasDTO;
import excepciones.PersistenciaException;
import interfaces.IRepoVentasDAO;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OMEN
 */
public class RepoVentasDAO implements IRepoVentasDAO{
    private final Conexion conexion = new Conexion();

    public List<RepoVentasDTO> obtenerReporteVentasDelDia() throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Object[]> query = em.createQuery(
                    "SELECT p.nombre, SUM(pt.cantidad), SUM(pt.cantidad * pt.precio) "
                    + "FROM ProductoTransaccion pt "
                    + "JOIN pt.transaccion t "
                    + "JOIN pt.producto p "
                    + "WHERE TYPE(t) = Venta "
                    + // Usamos TYPE(t) para filtrar solo instancias de Venta
                    "AND pt.fechaHora >= :inicio "
                    + "AND pt.fechaHora <= :fin "
                    + "GROUP BY p.nombre", Object[].class
            );

            // Establecemos los parámetros para la fecha de hoy
            LocalDateTime inicio = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
            LocalDateTime fin = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);

            query.setParameter("inicio", inicio);
            query.setParameter("fin", fin);

            List<Object[]> resultados = query.getResultList();
            List<RepoVentasDTO> reportes = new ArrayList<>();

            for (Object[] fila : resultados) {
                String nombreProducto = (String) fila[0];
                Long cantidadVendida = (Long) fila[1];
                Double totalGanancias = (Double) fila[2];

                RepoVentasDTO dto = new RepoVentasDTO(nombreProducto, cantidadVendida, totalGanancias);
                reportes.add(dto);
            }

            return reportes;

        } catch (Exception e) {
            throw new PersistenciaException("Error al generar el reporte de ventas del día", e);
        } finally {
            em.close();
        }
    }

}
