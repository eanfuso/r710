package com.tvp.pomi_02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Controlador
 */
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: Acà de nuevo!!! ").append(request.getContextPath());
	
		//response.getWriter().append(request.getAttribute("link"));
		//PrintWriter print = new PrintWriter((Writer) request.getAttribute("link"));
		response.setContentType("text/html");
		
        PrintWriter out = response.getWriter();
        out.println("Tu pedido fue: " + (request.getParameter("link")));
        String link = request.getParameter("link");
       // Ingesta ing = new Ingesta(link);
       
        if ("pres".equals(request.getParameter("cont"))) {
        	
        	
        	Terminar t = new Terminar();
        	t.TerminarProceso();
    
           	try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
//        	String[] mat = {"taskkill", "/f", "/IM", "ffmpeg.exe"};
//        	Process process = Runtime.getRuntime().exec(mat);
        	
        	Ingesta ingv = new Ingesta(link);
        	try {
				ingv.correr();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       	out.println("devuelto del proceso 1: " + ingv.getOut());

//        	
//        	 Scanner s = new Scanner(ingv.getOut());//.useDelimiter("\\A");
//             String result = s.hasNext() ? s.next() : "";
//             out.print("Respueste de la app: "+result);
//        	
        }
        if ("placa".equals(request.getParameter("cont")))
        {
//        	String[] mat = {"taskkill", "/f", "/IM", "ffmpeg.exe"};
//        	Process process = Runtime.getRuntime().exec(mat);
        	
//        	
        	Terminar t = new Terminar();
        	t.TerminarProceso();
        	//System.gc(); //basura
        	out.println(toString().toString());
       	
       	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       	Ingesta ingp = new Ingesta(link);
         ingp.correrPlaca();
         out.println("devuelto del proceso 1: " + ingp.getOut());
         Scanner s = new Scanner(ingp.getOut()).useDelimiter("\\A");
         String result = s.hasNext() ? s.next() : "";
         out.print("Respueste de la app: "+result);
         
         }
        out.println(request.getParameter("cont"));


        
        
        //FIN Detención forzada
        
        
        
        
        
        
        
        
        //        Thread p1 = new Thread(ing);
//        p1.start();
//        
//        if ((request.getParameter("placa")) = "placa") {
//        	Process process = Runtime.getRuntime().exec("taskkill /f /IM ffmpeg.exe");
//        }
//        
        
//        try {
//			ing.wait();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        //Para imprimir el el stream que devuelve el proceso:
//        Scanner s = new Scanner(ingb.getOut()).useDelimiter("\\A");
//        String result = s.hasNext() ? s.next() : "";
//
//        out.println("El destino es: " + ing.getOut());
//        out.print("Respueste de la app: "+result);
        
//        InputStreamReader in = new InputStreamReader(ing.getOut());
//		Stream<String> sos = new BufferedReader(in).lines();
//		String soso = sos.collect(Collectors.joining());
//		
//		out.println(soso);
        
        
        
        
//		
        
//        out.println("<h1>Hora Actual: ");
//        out.println(System.currentTimeMillis());
//        out.println("</h1>");
        
       // response.sendRedirect("index.jsp");
        response.setStatus(200);

	}
  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

