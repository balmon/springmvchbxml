<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
            <h1>Contact List</h1>
            <table border="1">
                <th>No</th>
                <th>Nombre</th>
                <th>Edad</th>
                <th>Sexo</th>
                 
                <c:forEach var="alumno" items="${alumnosList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${alumno.nombre}</td>
                    <td>${alumno.edad}</td>
                    <td>${alumno.sexo}</td>   
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>
