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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
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

 <article>

	<h6>Llave de monitoreo</h6>
 
<!--  <form action="#" onsubmit="return sk();"> -->
<label>Monitoreo 1</label>
    <input type="text" id="key1ii" />
<!--     <input type="submit" onclick="sk();" value="sk"/> otra cosa:  onkeyup=handleInput(this) src viejo "https://www.youtube.com/embed/siTSve2AMgk?autoplay=1&mute=1&loop=1"-->
    <input type="submit" id="btn1ii" ></button>    
    
    <label>Monitoreo 2</label>
    <input type="text" id="key2ii" />
<!--     <input type="submit" onclick="sk();" value="sk"/> otra cosa:  onkeyup=handleInput(this) src viejo "https://www.youtube.com/embed/siTSve2AMgk?autoplay=1&mute=1&loop=1"-->
    <input type="submit" id="btn2ii" ></button>   
    
    <label>Monitoreo 3</label>
    <input type="text" id="key3ii" />
<!--     <input type="submit" onclick="sk();" value="sk"/> otra cosa:  onkeyup=handleInput(this) src viejo "https://www.youtube.com/embed/siTSve2AMgk?autoplay=1&mute=1&loop=1"-->
    <input type="submit" id="btn3ii" ></button>   
    
    
    <label>Monitoreo 4</label>
    <input type="text" id="key4ii" />
<!--     <input type="submit" onclick="sk();" value="sk"/> otra cosa:  onkeyup=handleInput(this) src viejo "https://www.youtube.com/embed/siTSve2AMgk?autoplay=1&mute=1&loop=1"-->
    <input type="submit" id="btn4ii" ></button>    
    
    </article>
    <article>
    <h3>Eventos programados</h3>
    <br>
    <input type="date">
    <input type="time">
    
    </article>
    
    </main>


<script src="js/masterSet.js"></script>
</body>
</html>