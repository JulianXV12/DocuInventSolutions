/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import dao.usuariodao;
import modelo.usuario;
import java.util.List;

public class mainapp {
    public static void main(String[] args) {
        usuariodao dao = new usuariodao();

        // Insertar usuario nuevo
        usuario nuevo = new usuario(0, "Julian Moscoso", "julianmoscoso58@email.com");
        dao.insertar(nuevo);

        // Listar usuarios
        List<usuario> lista = dao.listar();
        for (usuario u : lista) {
            System.out.println(u);
        }

        // Actualizar usuario con ID 1
        usuario editar = new usuario(1, "Julian M.", "julian.actualizado@email.com");
        dao.actualizar(editar);

        // Eliminar usuario con ID 1
        dao.eliminar(1);
    }
}

