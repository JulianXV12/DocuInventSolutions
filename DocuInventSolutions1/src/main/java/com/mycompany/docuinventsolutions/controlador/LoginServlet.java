/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docuinventsolutions.controlador;

import com.mycompany.docuinventsolutions.dao.UsuarioDAO;
import com.mycompany.docuinventsolutions.modelo.Usuario;
<<<<<<< HEAD
=======

>>>>>>> 14ab748675274c7aec6141fc054c5691b329bfc8
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

<<<<<<< HEAD
        String correo = request.getParameter("correo").trim();
        String contrasena = request.getParameter("contrasena").trim();

        System.out.println("Usuario desde formulario: " + correo + " | Clave: " + contrasena);
=======
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");
>>>>>>> 14ab748675274c7aec6141fc054c5691b329bfc8

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = dao.validar(correo, contrasena);

        if (usuario != null) {
            request.getSession().setAttribute("usuario", usuario);
<<<<<<< HEAD
            response.sendRedirect("panelPrincipal.jsp");
        } else {
            System.out.println("Error: usuario no encontrado.");
=======
            response.sendRedirect("bienvenido.jsp");
        } else {
>>>>>>> 14ab748675274c7aec6141fc054c5691b329bfc8
            response.sendRedirect("error.jsp");
        }
    }
}
<<<<<<< HEAD


=======
>>>>>>> 14ab748675274c7aec6141fc054c5691b329bfc8
