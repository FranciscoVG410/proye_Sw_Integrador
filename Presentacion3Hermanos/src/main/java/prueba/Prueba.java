package prueba;

import net.sf.jasperreports.engine.JasperCompileManager;

public class Prueba {

    public static void main(String[] args) {
        try {
            // Ruta relativa desde la raíz del proyecto (ajusta según tu estructura)
            String jrxmlPath = "src/main/java/reportes/reporteVentas.jrxml";
            String jasperPath = "src/main/java/reportes/reporteVentas.jasper";

            JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);
            System.out.println("Reporte compilado exitosamente a: " + jasperPath);
        } catch (Exception e) {
            System.err.println("Error al compilar el reporte:");
            e.printStackTrace();
        }
    }
}
