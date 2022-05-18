console.log(document.querySelector("title").innerText)

//$("#btn4").on("click", function(event){
//	event.preventDefault();
	console.log("entro en la funcion...4")
//	var keyd = document.getElementById('key4').value;
   var r4 = localStorage.getItem("key4ii");//window.ke4ii;
console.log("traido del otro js: " + r4);
	var mon4 = document.getElementById('if4');
	//var ifSalida= "https://www.youtube.com/embed/" + recupero +"?autoplay=1&mute=1&loop=1"
	//localStorage.setItem('key4', ifSalida);

	mon4.setAttribute("src", r4);
	
	//console.log("El valor del key4 ingresado es: "+ keyd);
	//console.log("estamos monitoreando el link4" + ifSalida);
	
// });

   var r1 = localStorage.getItem("key1ii");//window.ke4ii;
console.log("traido del otro js: " + r1);
	var mon1 = document.getElementById('if1');
	mon1.setAttribute("src", r1);

 var r2 = localStorage.getItem("key2ii");//window.ke4ii;
console.log("traido del otro js: " + r2);
	var mon2 = document.getElementById('if2');
	mon2.setAttribute("src", r2);

 var r3 = localStorage.getItem("key3ii");//window.ke4ii;
console.log("traido del otro js: " + r3);
	var mon3 = document.getElementById('if3');
	mon3.setAttribute("src", r3);


// }