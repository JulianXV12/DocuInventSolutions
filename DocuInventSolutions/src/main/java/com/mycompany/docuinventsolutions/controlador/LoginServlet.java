/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docuinventsolutions.controlador;

import com.mycompany.docuinventsolutions.dao.UsuarioDAO;
import com.mycompany.docuinventsolutions.modelo.Usuario;
<<<<<<< HEAD
=======

>>>>>>> 280b4005c119b5db1f9a6a6f01a7f9590ac88c4f
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
>>>>>>> 280b4005c119b5db1f9a6a6f01a7f9590ac88c4f

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
>>>>>>> 280b4005c119b5db1f9a6a6f01a7f9590ac88c4f
            response.sendRedirect("error.jsp");
        }
    }
}
<<<<<<< HEAD


=======
>>>>>>> 280b4005c119b5db1f9a6a6f01a7f9590ac88c4f
