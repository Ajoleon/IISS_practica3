
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Pago de Parking</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Payment Form Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />

<link href='//fonts.googleapis.com/css?family=Fugaz+One' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Alegreya+Sans:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,800,800italic,900,900italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery.min.js"></script>
<style type="text/css">
		  			<%@include file="css/style.css" %>
			</style>
	
</head>
<body>
	<div class="main">
		<h1>Recarga de credito de Parking</h1>
		<div class="content">
			
			<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
					<script type="text/javascript">
						$(document).ready(function () {
							$('#horizontalTab').easyResponsiveTabs({
								type: 'default', //Types: default, vertical, accordion           
								width: 'auto', //auto or any width like 600px
								fit: true   // 100% fit in a container
							});
						});
						
					</script>
				
									
										<div class="payment-info">
											
											<div class="login-tab">
												<div class="user-login">
										
<form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post" target="_top">														
														Matricula: <input type="text" name ="matricula" required="">
														
															<div class="user-grids">
																<div class="user-left">
																	<div class="single-bottom">
																			<ul>
																				
																			</ul>
																	</div>
																</div>
																</div>

<input type="hidden" name="cmd" value="_xclick">
<input type="hidden" name="business" value="EB6W65Q6ZBKPW">
<input type="hidden" name="lc" value="ES">
<input type="hidden" name="item_name" value="Recarga saldo Parking">
<input type="hidden" name="button_subtype" value="services">
<input type="hidden" name="no_note" value="1">
<input type="hidden" name="no_shipping" value="1">
<input type="hidden" name="currency_code" value="EUR">
<input type="hidden" name="bn" value="PP-BuyNowBF:btn_buynow_LG.gif:NonHosted">
<table>
<tr><td><input type="hidden" name="on0" value="Opciones de Pago">Opciones de Pago</td></tr><tr><td><select name="os0">
	<option value="Opcion 1">Opcion 1 5,00 EUR</option>
	<option value="Opcion 2">Opcion 2 10,00 EUR</option>
	<option value="Opcion 3">Opcion 3 15,00 EUR</option>
</select> </td></tr>
</table>
<input type="hidden" name="currency_code" value="EUR">
<input type="hidden" name="option_select0" value="Opcion 1">
<input type="hidden" name="option_amount0" value="5.00">
<input type="hidden" name="option_select1" value="Opcion 2">
<input type="hidden" name="option_amount1" value="10.00">
<input type="hidden" name="option_select2" value="Opcion 3">
<input type="hidden" name="option_amount2" value="15.00">
<input type="hidden" name="option_index" value="0">
<input type="image" src="https://www.sandbox.paypal.com/es_ES/ES/i/btn/btn_buynow_LG.gif" border="0" name="submit" alt="PayPal, la forma r�pida y segura de pagar en Internet.">
<img alt="" border="0" src="https://www.sandbox.paypal.com/es_ES/i/scr/pixel.gif" width="1" height="1">
</form>

</form>


</form>



																	
																	
																<div class="clear"></div>
															</div>
													
											
									

		</div>
		<p class="footer">Practica 2 Ingenieria de Servicios de Telecomunicaci�n. Grado en Ingenieria Telematica. Universidad de Ja�n. </p>
	</div>
</body>
</html>