<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="css/miestilo.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="javascript/miscript.js"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="row">
	<div class="col-sm-4"></div>
	<div class="col-sm-8">
		<img alt="Galp" src="http://www.astac.info/wp-content/uploads/2015/07/galp-1.jpg" style="left: 320px;">
	</div>
</div>
<p>Ha pagado con <%=request.getAttribute("variable") %> </p>
<h1 align="center">Seleccione su combustible</h1>
<div class="row">
<div class="col-sm-2"></div>
<div class="col-sm-4">
	<input id="gasoleo" name="gasoleo" type="button" value="Gasóleo" ><br><br>
	<form class="gasoleo" action="Combustible" method="get">
		<input name="gasoleo A" type="radio" value="Gasóleo A">Gasóleo A<br><br>
		<input name="gasoleo B" type="radio" value="Gasóleo B">Gasóleo B<br><br>
		<input name="gasoleo C" type="radio" value="Gasóleo C">Gasóleo C<br><br>
		<input name="importe" type="text" value="Importe" >
		<input name="pagar" type="submit" value="Pagar">
	</form>	
</div>
<div class="col-sm-2"></div>
<div class="col-sm-4">
	<input id="gasolina" name="gasolina" type="button" value="Gasóleo" ><br><br>
	<form class="gasolina" action="Combustible" method="get">
		<input name="gasolina 95" type="radio" value="Gasolina A">Gasolina 95<br><br>
		<input name="gasolina 98" type="radio" value="Gasolina B">Gasolina 98<br><br>
		<input name="importe" type="text" value="Importe" >
		<input name="pagar" type="submit" value="Pagar">
	</form>
</div>

</div>
</body>
</html>