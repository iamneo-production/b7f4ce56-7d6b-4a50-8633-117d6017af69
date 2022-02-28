<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@
        page import ="java.util.* , model.*"
    %>
<!DOCTYPE html>
<html>
	<head>
  <style>
     
    </style>
		<meta charset="ISO-8859-1">
		<title>Find Medicines</title>
		<link href="./assets/css/display.css" rel="stylesheet" type="text/css">
	</head>
	<body>
       
          <%
            Medicine medicine = (Medicine)request.getAttribute("medicine");         
        %>
        <p>Medicine Details:</p>
        <div class="card" style="width:400px">
          <img class="card-img-top" src="./assets/<%=medicine.getMedicineQuality()%>" alt="Card image" style="width:100%">
          <div class="card-body">
            <h4 class="card-title">Name:<%=medicine.getMedicineName() %></h4>
            <p class="card-text">Number:<%=medicine.getMedicineId() %></p>
            <p class="card-text">Number:<%=medicine.getMedicinePrice() %></p>    
          </div>
        </div>
	</body>
</html>