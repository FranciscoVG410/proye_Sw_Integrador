/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reporteBO;

import interfaces.IRepoVentasDAO;
import persistencia.RepoVentasDAO;
import dtos.RepoVentasDTO;
import excepciones.PersistenciaException;

import java.util.List;

/**
 *
 * @author OMEN
 */
public class RepoVentasBO {
    private final IRepoVentasDAO repoVentasDAO;

    public RepoVentasBO() {
        this.repoVentasDAO = (IRepoVentasDAO) new RepoVentasDAO();
    }

    /**
     * Obtiene el reporte de ventas del día (nombre del producto, cantidad vendida, total ganancias).
     * 
     * @return lista de ReporteVentaDTO
     * @throws PersistenciaException si ocurre un error al obtener los datos
     */
    public List<RepoVentasDTO> obtenerReporteDelDia() throws PersistenciaException {
        return repoVentasDAO.obtenerReporteVentasDelDia();
    }
}
