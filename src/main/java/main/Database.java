/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author OMEN
 */
public class Database {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "63690Val";
        String dbName = "MiBaseDeDatos";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            
            // Crear base de datos si no existe
            String sql = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt.executeUpdate(sql);
            System.out.println("Base de datos creada exitosamente o ya existente: " + dbName);
        } catch (SQLException e) {
            System.out.println("Error al crear la base de datos: " + e.getMessage());
        }
        
        String fullUrl = "jdbc:mysql://localhost:3306/" + dbName;

        try (Connection connection = DriverManager.getConnection(fullUrl, user, password);
             Statement stmt = connection.createStatement()) {

            String createTableSQL = "CREATE TABLE Persona (" + "id INT AUTO_INCREMENT PRIMARY KEY, " + "nombre VARCHAR(100) NOT NULL, " + "edad INT NOT NULL)";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Tabla 'Persona' creada.");
            
            Persona persona = new Persona("Gilberto BorreGod", 19);
            insertarPersona(connection, persona);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void insertarPersona(Connection conn, Persona persona) {
        String insertSQL = "INSERT INTO Persona (nombre, edad) VALUES (,)";

        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, persona.getNombre());
            pstmt.setInt(2, persona.getEdad());
            pstmt.executeUpdate();
            System.out.println("Persona insertada: " + persona.getNombre());
        } catch (SQLException e) {
            System.out.println("Error al insertar persona: " + e.getMessage());
        }
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}
