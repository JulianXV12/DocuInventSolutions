/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docuinventsolutions.dao;

import com.mycompany.docuinventsolutions.modelo.Usuario;
import com.mycompany.docuinventsolutions.util.ConexionBD;
import java.sql.*;

public class UsuarioDAO {
<<<<<<< HEAD

    public Usuario validar(String correo, String contrasena) {
        String sql = "SELECT * FROM Usuarios WHERE correo = ? AND contrasena = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, correo);
            ps.setString(2, contrasena);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Usuario u = new Usuario();
                u.setCorreo(rs.getString("correo"));
                u.setNombre(rs.getString("nombre"));
                return u;
            }

=======
    public Usuario validar(String correo, String contrasena) {
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?";
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
             
            ps.setString(1, correo);
            ps.setString(2, contrasena);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Usuario u = new Usuario();
                u.setNombre(rs.getString("nombre"));
                u.setCorreo(correo);
                return u;
            }
>>>>>>> 14ab748675274c7aec6141fc054c5691b329bfc8
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
<<<<<<< HEAD






=======
>>>>>>> 14ab748675274c7aec6141fc054c5691b329bfc8
