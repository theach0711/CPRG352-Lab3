<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2021, 5:51:38 PM
    Author     : 847240
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First: </label>
            <input type ="text" name="first_number" value="${firstNumber}">
            <br><br>
            <label>Second: </label>
            <input type ="text" name ="second_number" value="${secondNumber}"> 
            <br><br>
            <input type="submit" name ="operator"  value ="+">
            <input type="submit" name ="operator" value ="-">
            <input type="submit" name ="operator" value ="*">
            <input type="submit" name ="operator" value ="%">
                    <P>Result: ${answer} ${no} </p>
                    
                     <a href ="age"> Age Calculator </a>
                    
                    </form>
        <p>${message}</p>
    </body>
        
 </html>
