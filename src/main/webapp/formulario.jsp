<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulário</title>
</head>
<body>
	<form action="controlador" method="post">
		<label for="tif"> TIF</label> <input type="text" id="tif" name="tif" />
		<label for="token"> TOKEN</label> <input type="text" id="token"
			name="token" /> <input type="submit" value="enviar" />
	</form>
</body>
</html>