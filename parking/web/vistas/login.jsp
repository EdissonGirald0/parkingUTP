<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="contenedor"class="page-header">
      <span class="h4">LOGIN</span>
    </div>
    <form
      action="ClientesController?accion=insertCliente"
      method="POST"
      style="width: 35%; margin: 0 auto"
    >
      <fieldset>
        <legend class="text-center">Datos</legend>
        <div class="form-group">
          <label for="nom">Nombre:</label>
          <input type="text class="form-group">
        </div>
        <div class="form-group">
          <label for="pass">Password:</label>
          <input type="text class="form-group">
        </div>
        <div class="form-group">
            <button type="submit button" id="registro" class="btn btn-primary">Ingresar</button>
          <button type="button" class="btn btn-secondary">Cancelar</button>

      </fieldset>
    </form>
    </body>
</html>
