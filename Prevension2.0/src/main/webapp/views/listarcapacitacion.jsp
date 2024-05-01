<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Model.Capacitacion" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Capacitaciones</title>
</head>
<body>
    <%@ include file="mimenu.jsp" %> <!-- Incluye el menú -->
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
                <td>${capacitacion.getIdentificador()}</td>
                <td>${capacitacion.getRutCliente()}</td>
                <td>${capacitacion.getDia()}</td>
                <td>${capacitacion.getHora()}</td>
                <td>${capacitacion.getLugar()}</td>
                <td>${capacitacion.getDuracion()}</td>
                <td>${capacitacion.getCantidadAsistentes()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>