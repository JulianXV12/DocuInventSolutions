<%-- 
    Document   : recuperar
    Created on : 22/07/2025, 1:47:10 a. m.
    Author     : julia
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Recuperar Contraseña - DocuInvent</title>
    <link rel="stylesheet" href="estilos/estilo.css">
</head>
<body>
    <div class="login-container">
        <img src="img/logo.jpg" alt="Logo DocuInvent" class="logo">
        <h1>Recuperar Contraseña</h1>
        <form action="RecuperarServlet" method="post">
            <label for="correo">Correo electrónico:</label><br>
            <input type="email" id="correo" name="correo" class="input-field" required><br><br>
            <button type="submit" class="button">Recuperar</button>
        </form>
        <div class="options">
            <a href="login.jsp" class="link-volver">Iniciar Sesión</a>
        </div>
    </div>
</body>
</html>

