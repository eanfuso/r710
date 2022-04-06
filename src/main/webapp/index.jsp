<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>POMI_24/7</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
    
    <header>
   
    </header>
    <nav>
<h2><strong>POMI 24/7</strong></h2>

<!--         <a href="detener.jsp"><img src="imagenes/logo.png" alt=""></a> -->
        <a href="index.html">Emisión</a>
        <a href="monitor.html">Monitor</a>
        
    </nav>
    <main>   
<!--     <h1>Scrip! Y PATH</h1> -->
        <article class="caja">
            <img src="imagenes/youtube-logo-png-3563.png" alt="">
            
            <h3>Emisión a Youtube</h3>
            <p>Ingesta RTMP número 1</p>
            <form action="Controlador" method="get">
                <label>Ingrese server y llave</label>
                <input type="text" name="link">
<!--                 <button type= "submit">emitir</button> -->
				
				 <select name="cont">
				  <option value="pres">pres</option>
				  <option value="placa">placa</option>
				 </select>
				 <input type="submit" value="emitir">
<!--                 <input type="submit" value="placa" name="placa">	 -->
<!--                 </form> -->
<!--                 <form action="Matar" method="get"> -->
<!--                 <input type="hidden" value="1" name="detener"  > -->
<!--                 <button type= "submit">detener></button> -->
                
                </form><br> <br>
                

                <iframe width="280" height="158" src="https://www.youtube.com/embed/6B06p7rMmdE?autoplay=1&mute=1&loop=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>


        </article>

        <article class="caja">
            <img src="imagenes/twitter-logo-11.png" alt="">
            <h3>Emisión a Tweeter</h3>
            <p>Ingesta RTMP número 2</p>
            <form action="Controlador" method="get">
                <label>Ingrese server y llave</label>
                <input type="text" name="link">
               
                <button type= "submit">emitir</button>
                
<!--                 <input type="button" value="detener" name="detener" action="Controlador" method="get"> -->
                </form><br> <br>
                <iframe width="280" height="158" src="https://www.youtube.com/embed/7_oQ0OJ2F0M?autoplay=1&mute=1&loop=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            
        </article>

        <article class="caja">
            <img src="imagenes/Telegram_Logo.png" alt="">
            <h3>Emisión a Télegram</h3>
            <p>Ingesta RTMP número 3</p>
            <form action="Controlador" method="get">
                <label>Ingrese server y llave</label>
                <input type="text" name="link">
                <button type= "submit">emitir</button>
                
                <input type="button" value="detener" name="detener" action="Controlador" method="get">
                </form>
                <br> <br>
                <iframe width="280" height="158" src="https://www.youtube.com/embed/7_oQ0OJ2F0M?autoplay=1&mute=1&loop=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        </article>

<!-- borrar entre 85-93 
<form action="Controlador" method="get">
                <label>matar</label>
               
               
                <button type= "submit">matar</button>
                
<!--                 <input type="button" value="detener" name="detener" action="Controlador" method="get"> -->
                </form>
-->




    </main>
    <footer>
         <div id="logotvp" class="logotvp">
    <img src="imagenes/TVP.png" >
    </div></footer>

</body>
</html>