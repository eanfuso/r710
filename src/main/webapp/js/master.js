/**
 * 
 */

console.log(document.querySelector("title").innerText)

var key1 = localStorage.getItem('key1');
var mon1 = document.getElementById('if1');
mon1.setAttribute("src", key1);
//
var key2 = localStorage.getItem('key2');
var mon2 = document.getElementById('if2');
mon2.setAttribute("src", key2);

var key3 = localStorage.getItem('key3');
var mon3 = document.getElementById('if3');
mon3.setAttribute("src", key3);

var key4 = localStorage.getItem('key4');
var mon4 = document.getElementById('if4');
mon4.setAttribute("src", key4);

//
//var recupero = window.ke4ii;

//var mon = document.getElementById('if4');
//	let ifSalida= "https://www.youtube.com/embed/" + key +"?autoplay=1&mute=1&loop=1"
//
//	mon.setAttribute("src", ifSalida);

//function prevent(){
////var form = document.getElementById("key");
//function handleForm(event) { event.preventDefault(); } 
//form.addEventListener('onclick', handleForm);
//}
//function preventDef(event) {
//  event.preventDefault();
//}
//{ }
//function sk()
$("#btn1").on("click", function(event){
	event.preventDefault();
	console.log("entro en la funcion...1")
	var keya = document.getElementById('key1').value;
	var mon = document.getElementById('if1');
	var ifSalida= "https://www.youtube.com/embed/" + keya +"?autoplay=1&mute=1&loop=1"
	localStorage.setItem('key1', ifSalida);

	mon.setAttribute("src", ifSalida);
	
	console.log("El valor del key1 ingresado es: "+ keya);
	console.log("estamos monitoreando el link1" + ifSalida);
	
 });

$("#btn2").on("click", function(event){
	event.preventDefault();
	console.log("entro en la funcion...2")
	var keyb = document.getElementById('key2').value;
	var mon = document.getElementById('if2');
	var ifSalida= "https://www.youtube.com/embed/" + keyb +"?autoplay=1&mute=1&loop=1"
	localStorage.setItem('key2', ifSalida);

	mon.setAttribute("src", ifSalida);
	
	console.log("El valor del key2 ingresado es: "+ keyb);
	console.log("estamos monitoreando el link2" + ifSalida);
	
 });

$("#btn3").on("click", function(event){
	event.preventDefault();
	console.log("entro en la funcion...3")
	var keyc = document.getElementById('key3').value;
	var mon = document.getElementById('if3');
	var ifSalida= "https://www.youtube.com/embed/" + keyc +"?autoplay=1&mute=1&loop=1"
	localStorage.setItem('key3', ifSalida);

	mon.setAttribute("src", ifSalida);
	
	console.log("El valor del key3 ingresado es: "+ keyc);
	console.log("estamos monitoreando el link3" + ifSalida);
	
 });



$("#btn4").on("click", function(event){
	event.preventDefault();
	console.log("entro en la funcion...4")
	var keyd = document.getElementById('key4').value;
	var mon = document.getElementById('if4');
	var ifSalida= "https://www.youtube.com/embed/" + keyd +"?autoplay=1&mute=1&loop=1"
	localStorage.setItem('key4', ifSalida);

	mon.setAttribute("src", ifSalida);
	
	console.log("El valor del key4 ingresado es: "+ keyd);
	console.log("estamos monitoreando el link4" + ifSalida);
	
 });



$("#btn4ii").on("click", function(event){
	event.preventDefault();
	console.log("entro en la funcion...4ii")
	var keydii = document.getElementById('key4ii').value;
	var mon = document.getElementById('if4');
	var ifSalida= "https://www.youtube.com/embed/" + keydii +"?autoplay=1&mute=1&loop=1"
	localStorage.setItem('key4ii', ifSalida);

	mon.setAttribute("src", ifSalida);
	
	console.log("El valor del key4 ingresado es: "+ keyd);
	console.log("estamos monitoreando el link4" + ifSalida);
	
 });






//
//function sk(){
//	console.log("entro en la funcion...")
//	var key = document.getElementById('key').value;
//	var mon = document.getElementById('if4');
//	var ifSalida=window.opener.getElementById('if4').innerHTML;
//	 ifSalida= "https://www.youtube.com/embed/" + key +"?autoplay=1&mute=1&loop=1"
//	
//	
//	console.log("El valor del key ingresado es: "+ key);
//	console.log("estamos monitoreando el link" + ifSalida);
//	
// }