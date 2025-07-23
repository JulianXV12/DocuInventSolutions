<%-- 
    Document   : panelPrincipal
    Created on : 22/07/2025, 6:16:41 p. m.
    Author     : julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.mycompany.docuinventsolutions.modelo.Usuario" %>
<%@ page session="true" %>
<%
    Usuario usuario = (Usuario) session.getAttribute("usuario");
    if (usuario == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Panel Principal - DocuInvent</title>
    <link rel="stylesheet" href="estilos/panel.css">
 
</head>
<body>
    
        <!-- Encabezado -->
 <header class="top-bar">
<div class="header-content">
    <img src="img/logo.jpg" alt="Logo DocuInvent Solutions" class="logo">
    <div class="iconos">
        <button class="icono">❓</button>
        <button class="icono">👤</button>
      </div>
    </div>
    <nav class="nav-buttons">
        <button>Servicios</button>
        <button>Precios</button>
        <button>Blog</button>
        <button>Contacto</button>
        <form action="logout.jsp" method="post" style="display:inline;">
           <button>Cerrar Sesión</button>
        </form>
    </nav>
 </header>
<!-- Contenido Principal -->
<div class="main-content">
        <img src="img/archivos.jpg" alt="Archivos Digitales">
        <br>
        <button class="btn-demo">Solicitar una Demo</button>

        <div class="benefits">
            <div class="card">
                <video width="100%" controls>
                    <img src="img/video-DocuInvent.jpg" type="video/mp4">
                    Tu navegador no soporta el video.
                </video>
                <p><strong>Testimonios:</strong><br>DocuInvent Solutions ha transformado nuestra gestión</p>
            </div>

            <div class="card right-card">
                <h3>Beneficios</h3>
                <ul>
                    <li>✅ Mejora la organización</li>
                    <li>✅ Acceso rápido a documentos</li>
                    <li>✅ Optimiza el almacenamiento</li>
                </ul>
            </div>
        </div>
    </div>
        <div class="footer">
            <p><img src="img/email-icon.jpg" width="16"> DocuInventSolutions@gmail.com</p>
        </div>
</body>
</html>