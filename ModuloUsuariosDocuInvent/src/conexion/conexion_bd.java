/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion_bd {
    public static Connection getConexion() {
        String url = "jdbc:mysql://localhost:3306/pruebaJdbc"; // Cambia si tu DB tiene otro nombre
        String usuario = "root";
        String contraseña = "Julianjulian0julian"; // Tu contraseña real

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("✅ Conexión exitosa.");
            return cn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("❌ Error en la conexión: " + ex.getMessage());
            return null;
        }
    }
}



