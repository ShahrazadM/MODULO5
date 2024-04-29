<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="basedatitos.Capacitacion"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Capacitaciones</title>
</head>
<body>
    <h2>Listado de Capacitaciones</h2>
    <table border="1">
        <tr>
            <th>Identificador</th>
            <th>RUT Cliente</th>
            <th>Día</th>
            <th>Hora</th>
            <th>Lugar</th>
            <th>Duración</th>
            <th>Cantidad de Asistentes</th>
        </tr>
        <c:forEach var="capacitacion" items="${capacitaciones}">
            <tr>
                <td>${capacitacion.identificador}</td>
                <td>${capacitacion.rutCliente}</td>
                <td>${capacitacion.dia}</td>
                <td>${capacitacion.hora}</td>
                <td>${capacitacion.lugar}</td>
                <td>${capacitacion.duracion}</td>
                <td>${capacitacion.cantidadAsistentes}</td>
            </tr>
        </c:forEach>
    </table>
    
</body>
</html>