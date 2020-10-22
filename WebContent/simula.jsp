<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Simulador de Aplicação</h2>
	<form action="Simulador">
		Tipo de aplicação: <select style="width: 160px" name="aplicacao">
			<option>POUPANCA</option>
			<option>RENDA-FIXA</option>
		</select> <br>Valor: <input name="valor"> <br>Meses: <input
			name="meses"><br> <input type="submit" value="Calcular">
	</form>
</body>
</html>