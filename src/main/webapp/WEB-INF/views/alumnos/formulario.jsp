<%-- 
    Document   : formulario
    Created on : 20/05/2018, 05:11:59 PM
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
        <h1>Hello World!</h1>
        <form name="dto" action="${pageContext.request.contextPath}/alumno/guardar" method="post">
            <label for="apePat">Apellido Paterno:</label>  <input id="apePat" type="text" name="apePat"><br/>
            <label for="apeMat">Apellido Materno:</label>  <input id="apeMat" type="text" name="apeMat"><br/>
            <label for="nombre">Nombre:</label>  <input id="nombre" type="text" name="nombre"><br/>
            <label for="fehaIngreso">Fecha:</label>  <input id="fehaIngreso" type="date" name="fehaIngreso"><br/>
            <label for="email">Email:</label>  <input id="email" type="email" name="email"><br/>
            <label for="idGenero">Genero: </label><br/>
                Masculino<input id="genero" type="radio" name="idGenero" value="0"><br/>
                Femenino<input id="genero" type="radio" name="idGenero" value="1"><br/>
            <label for="idNivel">Nivel: </label><br/>
                <select id="idNivel" name="idNivel">
                    <option value="1">Primaria</option>
                    <option value="2">Secundaria</option>
                    <option value="3">Universidad</option>
                </select>
            <p>Cursos:</p>
            <input type="checkbox" name="cursos[0].id" value="1">Lenguaje</input>
            <input type="checkbox" name="cursos[1].id" value="2">Matematicas</input>
            <input type="checkbox" name="cursos[2].id" value="3">Astronomia</input>
            <br>
            <label for="usuario">Usuario:</label>  <input id="usuario" type="text" name="usuario.usuario"><br/>
            <br>
            <label for="password">Contraseña:</label>  <input id="password" type="password" name="usuario.contrasena"><br/>
            <br/><input type="submit" value="Guardar">
        </form>
        <p>${fullname}</p>
    </body>
</html>
