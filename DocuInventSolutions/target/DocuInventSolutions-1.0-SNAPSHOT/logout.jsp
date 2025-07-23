<%-- 
    Document   : logout
    Created on : 22/07/2025, 8:02:23 p. m.
    Author     : julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    session.invalidate();
    response.sendRedirect("login.jsp");
%>

