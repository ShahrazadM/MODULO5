<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    
    <title>Crear Nueva Capacitación</title>
</head>
<body>
    <%@ include file="mimenu.jsp" %> <!-- Incluye el menú -->
    <h2>Crear Nueva Capacitación</h2>
    <form action="CrearCapacitacionServlet" method="post">
        <label for="identificador">Identificador:</label><br>
        <input type="text" id="identificador" name="identificador"><br>
        <label for="rutCliente">Rut Cliente:</label><br>
        <input type="text" id="rutCliente" name="rutCliente"><br>
        <label for="dia">Día:</label><br>
        <input type="text" id="dia" name="dia"><br>
        <label for="hora">Hora:</label><br>
        <input type="text" id="hora" name="hora"><br>
        <label for="lugar">Lugar:</label><br>
        <input type="text" id="lugar" name="lugar"><br>
        <label for="duracion">Duración:</label><br>
        <input type="text" id="duracion" name="duracion"><br>
        <label for="cantidadAsistentes">Cantidad de Asistentes:</label><br>
        <input type="text" id="cantidadAsistentes" name="cantidadAsistentes"><br><br>
        <input type="submit" value="Crear Capacitación">
    </form>
</body>
</html>