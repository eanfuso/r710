<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>POMI_24/7</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
    
    <header>
   
    </header>
    <nav>
<h2><strong>POMI 24/7</strong></h2>

<!--         <a href="detener.jsp"><img src="imagenes/logo.png" alt=""></a> -->
        <a href="index.jsp">Emisión</a>
        <a href="seteos.jsp">Seteos</a>
        
    </nav>
    <main>   
<!--     <h1>Scrip! Y PATH</h1> -->
        <article class="caja">
            <img class="plataforma"src="imagenes/youtube-logo-png-3563.png" alt="">
            <br> <br><br> <br> <br> 
            <h3>Youtube</h3>
            <p>Ingesta RTMP número 1</p>
            <form action="Controlador" method="get">
                <label>Ingrese server y llave</label>
                <input type="text" name="link1">
<!--                 <button type= "submit">emitir</button> -->
				
				
<!--                 <input type="submit" value="placa" name="placa">	 -->
<!--                 </form> -->
<!--                 <form action="Matar" method="get"> -->
<!--                 <input type="hidden" value="1" name="detener"  > -->
<!--                 <button type= "submit">detener></button> -->
                
                <br> <br>
                
				<p align="left">
                <iframe width="220" height="124"  src="https://www.youtube.com/embed/6B06p7rMmdE?autoplay=1&mute=1&loop=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
				</p>

        </article>

        <article class="caja">
            <img class="plataforma"src="imagenes/twitter-logo-11.png" alt="">
            <br> <br><br> <br> <br> 
            <h3>Tweeter</h3>
            <p>Ingesta RTMP número 2</p>
<!--             <form action="Controlador" method="get"> -->
                <label>Ingrese server y llave</label>
                <input type="text" name="link2">
               
<!--                 <button type= "submit">emitir</button> -->
                
<!--                 <input type="button" value="detener" name="detener" action="Controlador" method="get"> -->
                <br> <br>
                <iframe width="220" height="124" src="https://player.twitch.tv/?channel=valeriomaximo&parent=www.example.com?autoplay=1&mute=1&loop=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            
        </article>

        <article class="caja">
            <img class="plataforma" src="imagenes/Telegram_Logo.png" alt="">
            <br> <br><br> <br> <br> 
            <h3>Télegram</h3>
            <p>Ingesta RTMP número 3</p>
<!--             <form action="Controlador" method="get"> -->
                <label>Ingrese server y llave</label>
                <input type="text" name="link3">
<!--                 <button type= "submit">emitir</button> -->
                
<!--                 <input type="button" value="detener" name="detener" action="Controlador" method="get"> -->
             
                <br> <br>
                <iframe width="220" height="124" src="https://www.youtube.com/embed/7_oQ0OJ2F0M?autoplay=1&mute=1&loop=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        </article>


<article class="caja">
            <img src="imagenes/TVP.png" alt="">
            <h3>Selección de contenido</h3>
            <p>Presentación/Placa</p>
<!--             <form action="Controlador" method="get"> -->
             
<!--                 	<p align="left"> -->
<!--                 	<select name="cont"> -->
<!-- 				  <option value="pres">pres</option> -->
<!-- 				  <option value="placa">placa</option> -->
<!-- 				 </select> -->
<!-- 				 </p> -->
<!-- 				 <p align="right"> -->
<!-- 				<input type="submit" value="emitir"> -->
<!-- 				 </p>               -->
<!--                 </form> -->

<!-- 				            <form action="Controlador" method="get"> -->
				            
				            <div class="input-group">
  <select class="custom-select" id="inputGroupSelect04" aria-label="Example select with button addon" name="cont">
<!--     <option selected>Choose...</option> -->
    <option value="pres">pres</option>
    <option value="placa1">placa1</option>
    <option value="placa2">placa2</option>
  </select>
  <div class="input-group-append">
    <button class="btn btn-outline-secondary" type="submit">Emitir</button>
  </div>
</div>
             
<!--                 	<div> -->
<!--                 	<select class="selector" name="cont"> -->
<!-- 				  <option value="pres">pres</option> -->
<!-- 				  <option value="placa">placa</option> -->
<!-- 				 </select> -->
<!-- 				</div>  -->
				
<!-- 				 <div id="emitir"> -->
<!-- 				<input  class="selector" type="submit" value="emitir"> -->
<!-- 				       </div>      -->
                </form>
             
                <br> <br>
                <iframe width="220" height="124" src="https://www.youtube.com/embed/7_oQ0OJ2F0M?autoplay=1&mute=1&loop=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        </article>



<!-- borrar entre 85-93 
<form action="Controlador" method="get">
                <label>matar</label>
               
               
                <button type= "submit">matar</button>
                
<!--                 <input type="button" value="detener" name="detener" action="Controlador" method="get"> -->
                </form>


 				


    </main>
    <footer>
         <div id="logotvp" class="logotvp">
    <img src="imagenes/TVP.png" >
    </div></footer>

</body>
</html>