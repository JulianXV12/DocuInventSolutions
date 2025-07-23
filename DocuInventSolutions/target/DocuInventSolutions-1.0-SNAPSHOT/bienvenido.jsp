<%-- 
    Document   : bienvenido
    Created on : 21/07/2025, 3:12:10?p. m.
    Author     : julia
--%>

<%@ page import="com.mycompany.docuinventsolutions.modelo.Usuario" %>
<%@ page session="true" %>
<%
    Usuario usuario = (Usuario) session.getAttribute("usuario");
    if (usuario == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<h1>¡Bienvenido, <%= usuario.getNombre() %>!</h1>
<a href="logout">Cerrar sesión</a>
