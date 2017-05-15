<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Parking</title>
        <!-- for-mobile-apps -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
            <meta name="keywords" content="Payment Form Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
            Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
            <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
                function hideURLbar(){ window.scrollTo(0,1); } </script>
            <!-- //for-mobile-apps -->
            
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
            <h1>Parking</h1>
            <div class="content">
              
              
              <body>
                 
                  <div class="user-login">
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
                  
                    </div>
                    </div>
                    <p class="footer">Practica 2 Ingenieria de Servicios de Telecomunicación. Grado en Ingenieria Telematica. Universidad de Jaén. </p>
                </div>
    </body>
</html>