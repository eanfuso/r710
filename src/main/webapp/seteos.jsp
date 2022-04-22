<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seteos</title>
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
<header></header>
<nav>
<h2><strong>POMI 24/7</strong></h2>

<!--         <a href="detener.jsp"><img src="imagenes/logo.png" alt=""></a> -->
        <a href="index.jsp">Emisión</a>
        <a href="seteos.jsp">Seteos</a>
        
    </nav>
    <main> 
<!--     <h2>ingrese key</h2> -->
<!--     <input type="text" id="key"name="key"> -->
<!--     <input type="submit" onclick="sk();" value="sk"/> -->
    
     <form action="#" onsubmit="return sk();">
    <input type="text" id="key"name="key" />
<!--     <input type="submit" onclick="sk();" value="sk"/> otra cosa:  onkeyup=handleInput(this) src viejo "https://www.youtube.com/embed/siTSve2AMgk?autoplay=1&mute=1&loop=1"-->
   <input type="submit" id="btn" >Submit</button>
  
<!--     <button onclick=sk()>Submit</button> -->
    </form>
    
    
    
    </main>


<script src="js/master.js"></script>
</body>
</html>