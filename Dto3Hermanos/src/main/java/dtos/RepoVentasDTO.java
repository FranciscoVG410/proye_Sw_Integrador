/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author OMEN
 */
public class RepoVentasDTO {
    private String nombreProducto;
    private Long cantidadVendida;
    private Double totalGanancias;

    public RepoVentasDTO(String nombreProducto, Long cantidadVendida, Double totalGanancias) {
        this.nombreProducto = nombreProducto;
        this.cantidadVendida = cantidadVendida;
        this.totalGanancias = totalGanancias;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Long getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Long cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Double getTotalGanancias() {
        return totalGanancias;
    }

    public void setTotalGanancias(Double totalGanancias) {
        this.totalGanancias = totalGanancias;
    }
    
    
}
