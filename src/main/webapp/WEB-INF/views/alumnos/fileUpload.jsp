<%-- 
    Document   : fileUpload
    Created on : 20/05/2018, 08:55:07 PM
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
        <h1>Sube tu foto</h1>
        <form name="alumno" action="${pageContext.request.contextPath}/file/subirFoto" method="post" enctype="multipart/form-data">
            <label for="nombre">Nombre:</label>  <input id="nombre" type="text" name="nombre"><br/>
            <label for="desFot">Foto:</label>  <input id="desFot" type="file" name="desFot"><br/>
            <br/><input type="submit" value="Guardar">
        </form>
        <p>${alumno}</p>
    </body>
</html>
