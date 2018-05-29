
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <script src="../../../resources/angular/angular.js" type="text/javascript"></script>
    </head>
    <body>
        Hola ${Nombre} ${Apellido}
        <a href="${pageContext.request.contextPath}/alumno/cargar">formulario</a></br>
        <a href="${pageContext.request.contextPath}/file/cargar">FileUpload</a></br>
        <a href="${pageContext.request.contextPath}/validacion/cargar">Validacion</a></br>
        <a href="${pageContext.request.contextPath}/validacion/cargarValidation">Validacion Personalizada</a></br>
        <a href="${pageContext.request.contextPath}/sesion/cargar">Sesion</a></br>
        <a href="${pageContext.request.contextPath}/jpa/cargar">JpaSchool</a></br>
    </body>
</html>