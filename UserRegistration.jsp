<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<script src="showpasswordUser.js"></script>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title> User Registration </title>

<style>

Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink; 
  background-image: url("libimage.jpg"); 
} 
button {   
       background-color: #4CAF50;   
       width: 100%;  
        color: black;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         }   
         form {   
        border: 3px solid #f1f1f1;   
    }   
    input[type=number],input[type=password],input[type = email], input[type = text], input[type = text] , input[type = text] , input[type = number] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid green;   
        box-sizing: border-box;   
    }
    button:hover {   
        opacity: 0.7;   
    }    
     
 .container {   
        padding: 25px;   
        background-color: lightblue;  
    }      
</style>
</head>
<body>		

 			<center> <h1 style="color:white"> Shopping Cart For Book Store</h1> </center> 
 			<center> <h1 style="color:white"> User Registration</h1> </center>  
    		<form action = "UserServlet">  
        	<div class="container">   
            <label>Username/Number : </label>   
            <input type="text" placeholder="Enter Username/Number" name="number" pattern = "[789][0-9]{9}" title = "Please enter a 10 digit number with Indian country code only"  required>  
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="password" pattern = "(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title = "Must contain at least one  number and one uppercase and lowercase letter, and at least 6 or more characters" required>
             <label>Email : </label>   
            <input type="email" placeholder="Enter Email" name="emailaddress" required>
            <label>Address Line 1 : </label>   
            <input type="text" placeholder="Enter Address Line 1" name="addressline1" required>
             <label>Address Line 2 : </label>   
            <input type="text" placeholder="Enter Address Line 2" name="addressline2" required>
            <label>City : </label>   
            <input type="text" placeholder="Enter City" name="city" required> 
            <label>Pincode : </label>   
            <input type="number" placeholder="Enter Pincode" name="pincode" pattern="[0-9]{6}" maxlength="6" title = "Pincode is not correct" required>  
            <button type="submit">Register</button>  
            
      		
      		</div>
            </form>
            </body>
            </html>  
            

	