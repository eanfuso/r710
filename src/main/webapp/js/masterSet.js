console.log(document.querySelector("title").innerText)


$("#btn4ii").on("click", function(event){
	event.preventDefault();
	console.log("entro en la funcion...4ii")
	var keydii = document.getElementById('key4ii').value;
	var ifSalida= "https://www.youtube.com/embed/" + keydii +"?autoplay=1&mute=1&loop=1"
	localStorage.setItem('key4ii', ifSalida);
	console.log("estamos monitoreando el link4" + ifSalida);
	 });

$("#btn1ii").on("click", function(event){
	event.preventDefault();
	console.log("entro en la funcion...1ii")
	var keyaii = document.getElementById('key1ii').value;
	var ifSalida= "https://www.youtube.com/embed/" + keyaii +"?autoplay=1&mute=1&loop=1"
	localStorage.setItem('key1ii', ifSalida);
	console.log("estamos monitoreando el link1" + ifSalida);
	 });

$("#btn2ii").on("click", function(event){
	event.preventDefault();
	console.log("entro en la funcion...2ii")
	var keybii = document.getElementById('key2ii').value;
	var ifSalida= "https://www.youtube.com/embed/" + keybii +"?autoplay=1&mute=1&loop=1"
	localStorage.setItem('key2ii', ifSalida);
	console.log("estamos monitoreando el link2" + ifSalida);
	 });

$("#btn3ii").on("click", function(event){
	event.preventDefault();
	console.log("entro en la funcion...3ii")
	var keycii = document.getElementById('key3ii').value;
	var ifSalida= "https://www.youtube.com/embed/" + keycii +"?autoplay=1&mute=1&loop=1"
	localStorage.setItem('key3ii', ifSalida);
	console.log("estamos monitoreando el link3" + ifSalida);
	 });