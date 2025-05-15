/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.RepoVentasDTO;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author OMEN
 */
public interface IRepoVentasDAO {
    List<RepoVentasDTO> obtenerReporteVentasDelDia() throws PersistenciaException;
}
