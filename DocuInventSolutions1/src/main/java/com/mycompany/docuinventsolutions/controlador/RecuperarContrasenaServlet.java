/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docuinventsolutions.controlador;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RecuperarContrasenaServlet")
public class RecuperarContrasenaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correo = request.getParameter("correo");

        // Aquí podrías consultar la base de datos para ver si existe ese correo
        // y enviar un correo de recuperación o mostrar un mensaje simulado

        if (correo != null && correo.contains("@")) {
            // Simulación de éxito
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<script>alert('Se ha enviado un enlace a tu correo para recuperar la contraseña.'); window.location='login.jsp';</script>");
        } else {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<script>alert('Correo no válido.'); window.location='recuperar.jsp';</script>");
        }
    }
}

