<%-- 
    Document   : sesion
    Created on : 23/05/2018, 09:18:34 PM
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
        <form name="dto" action="${pageContext.request.contextPath}/sesion/guardar" method="post">
            <label for="id">ID: </label>  <input id="id" type="text" name="id"><br/>
            <label for="descripcion">Curso:</label>  <input id="descripcion" type="text" name="descripcion"><br/>
            <br/><input type="submit" value="Guardar">
        </form>
        <p>${fullname}</p>
    </body>
</html>
