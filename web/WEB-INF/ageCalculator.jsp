<%-- 
    Document   : ageCalcultor
    Created on : Sep 23, 2021, 4:25:41 AM
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
        <h1>Age Calculator</h1>
        <form method="POST" action ="age">
            <label>Enter your age: </label>
            <input type ="text" name="age" value= "${Age}">
            <br><br>
            <input type ="Submit" value ="Age Next Birthday">
         </form>
        
        <P>${message}</P>
        <p>${error}</p>
        <p>${ageAfter}</p>
        
        <a href ="arithmetic"> Arithmetic Calculator </a>
    </body>
</html>          
                   
                   
                   
                   
                   
         