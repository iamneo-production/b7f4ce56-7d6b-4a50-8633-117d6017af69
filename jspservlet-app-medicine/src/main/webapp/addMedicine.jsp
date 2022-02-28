<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>       
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script>
            function onAdd() {
                  alert("Medicine Added Sucessfully");
                  window.location.reload();
                }
          </script>
    </head>
    <body>
        <form class="form-group" action ="AddMedicine" method="POST" style="align-content: center;">
            <div class="form-control">
                <input type ="text" name= "mname" placeholder="Enter Medicine Name" id="enterMedicineName" required></input>
            </div>
            
            <div class="form-control">
                <input type ="text" name= "mprice" placeholder="Enter Medicine Price" id="enterMedicinePrice" required></input>
            </div>
            
            <div class="form-control">
                <input type ="text" name= "mquality" placeholder="Enter Medicine Quality" id="quality" required></input><br>
            </div>
            
            <input type ="submit" value= "Add" class="btn btn-primary" id="addMedicine" onclick="onAdd()"></input>
        </form>

    </body>