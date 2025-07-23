<%-- 
    Document   : login
    Created on : 21/07/2025, 3:11:59 p. m.
    Author     : julia
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Iniciar Sesión - DocuInvent</title>
    <link rel="stylesheet" href="estilos/estilo.css">
</head>
<body>
  <div class="login-container">
    <img src="img/logo.jpg" alt="Logo DocuInvent Solutions" class="logo">
    <h1>Iniciar Sesión</h1>

    <form method="post" action="LoginServlet">
      <div class="input-group">
        <label for="correo">Correo electrónico:</label>
        <input type="text" id="correo" name="correo" required>
      </div>
      <div class="input-group">
        <label for="contrasena">Contraseña:</label>
        <input type="password" id="contrasena" name="contrasena" required>
      </div>
      <div class="options">
        <button type="submit">Ingresar</button>
      </div>
      <div class="options">
        <a href="#">¿Olvidó su contraseña?</a>
        <a href="#">Registrarse</a>
      </div>
    </form>
  </div>
</body>
</html>

