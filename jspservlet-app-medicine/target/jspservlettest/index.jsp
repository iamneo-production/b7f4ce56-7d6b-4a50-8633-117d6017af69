<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Document</title>
		<link href="./assets/css/medicine.css" rel="stylesheet" type="text/css">
	</head>
	<frameset rows="15%,*">
		<frameset>
			<frame src="head.html" name="search"></frame>
		</frameset>
		<frameset cols= "60%,40%">
			<frame src="/medicines/findAll" name="view"></frame>
			<frame src="search.html"> </frame>
		</frameset>	
	 </frameset>
	<body>
		
		  </div>
		  <form action ="findMedicine" method="POST">
			<input type ="text" name= "mid" placeholder="Enter Medicine Id"></input><br>
			<input type ="submit" value= "Search"></input>

		  </form>
		  <form action ="findMedicine" method="POST">
			<input type ="text" name= "mid" placeholder="Enter Medicine Id"></input><br>
			<input type ="submit" value= "Search"></input>

		  </form>
		  <form action ="AddMedicine" method="POST">
			  <input type ="text" name= "mname" placeholder="Enter Medicine Name"></input><br>
			  <input type ="text" name= "mprice" placeholder="Enter Medicine Price"></input><br>
			  <input type ="text" name= "mquality" placeholder="quality"></input><br>
			  <input type ="submit" value= "Add"></input>
		  </form>

		  <form action ="updateMedicine" method="POST">
            <input type ="text" name= "mid" placeholder="Enter Medicine Id"></input><br>
            <input type ="text" name= "mname" placeholder="Enter Medicine Name"></input><br>
            <input type ="text" name= "mprice" placeholder="Enter Medicine Price"></input><br>
            <input type ="text" name= "mquality" placeholder="quality"></input><br>
            <input type ="submit" value= "Update"></input>
        </form>
		<form action ="deleteMedicine" method="POST">
			<input type ="text" name= "mid" placeholder="enter id to delete"></input><br>
            <input type ="submit" value= "Delete"></input>
        </form>
		</form>

	</body>
</html>