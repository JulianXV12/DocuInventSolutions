/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.usuario;
import conexion.conexion_bd;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class usuariodao {

    public void insertar(usuario nuevo) {
        String sql = "INSERT INTO usuarios(nombre, correo) VALUES (?, ?)";
        try {
            Connection cn = conexion_bd.getConexion();
            if (cn == null) return;
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nuevo.getNombre());
            pst.setString(2, nuevo.getCorreo());
            pst.executeUpdate();
            System.out.println("✅ Usuario insertado correctamente.");
        } catch (SQLException ex) {
            System.out.println("❌ Error al insertar usuario: " + ex.getMessage());
        }
    }

    public List<usuario> listar() {
        List<usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try {
            Connection cn = conexion_bd.getConexion();
            if (cn == null) return lista;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String correo = rs.getString("correo");
                usuario u = new usuario(id, nombre, correo);
                lista.add(u);
            }
        } catch (SQLException ex) {
            System.out.println("❌ Error al listar usuarios: " + ex.getMessage());
        }
        return lista;
    }

    public void actualizar(usuario u) {
        String sql = "UPDATE usuarios SET nombre = ?, correo = ? WHERE id = ?";
        try {
            Connection cn = conexion_bd.getConexion();
            if (cn == null) return;
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, u.getNombre());
            pst.setString(2, u.getCorreo());
            pst.setInt(3, u.getId());
            pst.executeUpdate();
            System.out.println("✅ Usuario actualizado correctamente.");
        } catch (SQLException ex) {
            System.out.println("❌ Error al actualizar usuario: " + ex.getMessage());
        }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try {
            Connection cn = conexion_bd.getConexion();
            if (cn == null) return;
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("✅ Usuario eliminado correctamente.");
        } catch (SQLException ex) {
            System.out.println("❌ Error al eliminar usuario: " + ex.getMessage());
        }
    }
}
  