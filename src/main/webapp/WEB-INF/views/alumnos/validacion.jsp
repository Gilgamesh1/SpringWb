<%-- 
    Document   : validacion
    Created on : 20/05/2018, 09:37:44 PM
    Author     : Raúl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Validacion</h1>
        <form action="${pageContext.request.contextPath}/validacion/guardar" method="post">
            <table>
                <tr>
                    <td><label for="nombre">Nombre:</label></td>
                    <td>
                        <input id="nombre" type="text" name="nombre" value="${dto.nombre}">
                        <span style="color: red;">${result.getFieldError("nombre").defaultMessage}</span>
                    </td>
                </tr>
                <tr>
                    <td><label for="apePat">Apellido Paterno:</label></td>
                    <td>
                        <input id="apePat" type="text" name="apePat" value="${dto.apePat}">
                        <span style="color: red;">${result.getFieldError("apePat").defaultMessage}</span>
                    </td>
                </tr>
                <tr>
                    <td><label for="apeMat">Apellido Materno:</label></td>
                    <td>
                        <input id="apeMat" type="text" name="apeMat" value="${dto.apeMat}">
                        <span style="color: red;">${result.getFieldError("apeMat").defaultMessage}</span>
                    </td>
                </tr>
                <tr>
                    <td><label for="email">Email:</label></td>
                    <td>
                        <input id="email" type="text" name="email" value="${dto.email}">
                        <span style="color: red;">${result.getFieldError("email").defaultMessage}</span>
                    </td>
                </tr>
                <tr>
                    <td><label for="edad">Edad:</label></td>
                    <td>
                        <input id="edad" type="text" name="edad" value="${dto.edad}">
                        <span style="color: red;">${result.getFieldError("edad").defaultMessage}</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Guardar"></td>
                </tr>
            </table>
        </form>
        <p>${fullname}</p>
    </body>
</html>
