<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<link rel="stylesheet" href="./registro.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
  </head>
  <body>
    <div id="contenedor"class="page-header">
      <span class="h4">REGISTRAR CLIENTE</span>
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
          <label for="cel">Celular:</label>
          <input type="text class="form-group">
        </div>
        <div class="form-group">
          <label for="pass">Password:</label>
          <input type="text class="form-group">
        </div>
        <div class="form-group">
          <button type="button" id="registro" class="btn btn-primary">Registrar</button>
          <button type="button" class="btn btn-secondary">Cancelar</button>

      </fieldset>
    </form>
  </body>
</html>
