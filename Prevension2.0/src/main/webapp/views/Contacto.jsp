<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="mimenu.jsp" %> <!-- Incluye el menú -->
<title>Formulario de Contacto</title>
</head>
<body>

    <h1>Formulario de Contacto</h1>
    <form method="post" action="ContactoServlet">
        Nombre: <input type="text" name="nombre"><br>
        Email: <input type="email" name="email"><br>
        Mensaje: <textarea name="mensaje"></textarea><br>
        <input type="submit" value="Enviar">
    </form>
   
</body>
</html>
