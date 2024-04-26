<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesión</title>
</head>
<body>
    <h2>Iniciar Sesión</h2>
    <form action="LoginServlet" method="post">
        <label for="rut">RUT:</label>
        <input type="text" id="rut" name="rut" required><br><br>
        <label for="clave">Clave:</label>
        <input type="password" id="clave" name="clave" required><br><br>
        <input type="submit" value="Iniciar Sesión">
    </form>
</body>
</html>