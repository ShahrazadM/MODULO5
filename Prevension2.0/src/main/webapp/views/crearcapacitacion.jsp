<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@ include file="mimenu.jsp" %> <!-- Incluye el menú -->
    <title>Crear Capacitación</title>
</head>
<body>
    <h1>Crear Capacitación</h1>
    <form method="post" action="CrearCapacitacion">
        Título: <input type="text" name="titulo"><br>
        Descripción: <textarea name="descripcion"></textarea><br>
        Fecha: <input type="date" name="fecha"><br>
        <!-- Otros campos relevantes para la capacitación -->
        <input type="submit" value="Crear">
    </form>
    
</body>
</html>
