<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
</head>

<body>
	<h1>
		Simulci&oacute;n de Raspberry Pi  
	</h1>
	
	<form action="#" id="entra">
		Datos de veh&iacute;culo capturardos por el parking.<br>
		ParkingID: <input type="text" nombre="barrera" id="parkingId" value="1">
		Matricula: <input type="text" nombre="vehiculo" id="matricula" value="111AAA">
		<input type="submit" value="Enviar">
	</form>
	
	<script type="text/javascript">
		$('#entra').submit(function(evento){
			var urlRest = 'http://localhost:8081/p3/saveMatricula';
			$.ajax({
				url: urlRest,
				type: 'POST',
				contentType: "application/json",
				data: JSON.stringify({parkingId:$('#parkingId').val(),
									  matricula:$('#matricula').val()}),
				success: function(resultado){
					alert('ok');
					//alert('Vehiculo con matricula'+resultado.matricula+' dentro del servio');
				},
				error: function(resultado){
					alert('no ok');
					alert(resultado);
				}
			});
			evento.preventDefault(); //Evita que se ejecute la peticion Get del formulario.
		})
	</script>

</body>
</html>