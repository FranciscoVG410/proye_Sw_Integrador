/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author OMEN
 */
public class Database {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/"; // URL sin especificar la BD
        String user = "root"; // Usuario de MySQL
        String password = "63690Val"; // Contraseña de MySQL
        String dbName = "MiBaseDeDatos"; // Nombre de la base de datos a crear
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            
            // Crear base de datos si no existe
            String sql = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt.executeUpdate(sql);
            System.out.println("Base de datos creada exitosamente o ya existente: " + dbName);
        } catch (SQLException e) {
            System.out.println("Error al crear la base de datos: " + e.getMessage());
        }
    }
}
