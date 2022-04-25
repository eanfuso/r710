package com.tvp.pomi_02;

import com.tvp.pomi_02.Ingesta;
import com.tvp.pomi_02.*;
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
       private String link = "";
       private String link1= "";
       private String link2 = "";
       
    public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

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
        link1= request.getParameter("link1");
        link2= request.getParameter("link2");
//        
//        this.link = request.getParameter("link1")+ " " + "-ar"+ " " +"44100"+" "+ "-f" +" "+ "flv" +" "+request.getParameter("link2");//+ " " + "-ar"+ "44100"+ "-f" +" "+ "flv" +" " +request.getParameter("link3");
//        out.println("Tu emisión tiene los destinos: " + (request.getParameter("link1")+ " " + "-ar"+ "44100"+ "-f" +" "+ "flv" +" "+request.getParameter("link2")+ " " + "-ar"+ "44100"+ "-f" +" "+ "flv" +" " +request.getParameter("link3")));
//        out.println("Tu orden es: " + request.getParameter("cont"));
//        if (null != request.getParameter("link1")) {
//        	String link1 = request.getParameter("link1");
//        }
//        if (null != request.getParameter("link2")) {
//        	String link2 = request.getParameter("link2");
//        }
//        if (null != request.getParameter("link3")) {
//        	String link3 = request.getParameter("link3");
//        }
        
       // Ingesta ing = new Ingesta(link);
       
        if ("pres".equals(request.getParameter("cont"))) {
        	
        	
        	Terminar t = new Terminar();
        	t.TerminarProceso();
        	out.println("Devuelto por MATAR!: "+t.getVuelta());
    
           	try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           	
           	
       
//        	String[] mat = {"taskkill", "/f", "/IM", "ffmpeg.exe"};
//        	Process process = Runtime.getRuntime().exec(mat);
  
           	
           	
//           	Ingesta ingv = new Ingesta(link);
//        
//        	try {
//				ingv.correr();
				
           	//Presentacion ingv = new Presentacion(request.getParameter("link1")+ " " + "-ar"+ "44100"+ "-f" +" "+ "flv" +" " + request.getParameter("link2")+  " " + "-ar"+ "44100" + "-f" +" "+ "flv" +" " +request.getParameter("link3"));
        if ("".equals(link2)) {
       		link2 = "/dev/null";
       	}
        
        Presentacion ingv = new Presentacion (link1, link2);
           	Thread ing_pres = new Thread(ingv);
            
        	ing_pres.start();
       	out.println("devuelto del proceso 1: " + ingv.getOut());

//        	
//        	 Scanner s = new Scanner(ingv.getOut());//.useDelimiter("\\A");
//             String result = s.hasNext() ? s.next() : "";
//             out.print("Respueste de la app: "+result);
//        	
        }
        if ("placa1".equals(request.getParameter("cont")))
        {
//        	String[] mat = {"taskkill", "/f", "/IM", "ffmpeg.exe"};
//        	Process process = Runtime.getRuntime().exec(mat);
        	 if ("".equals(link2)) {
            		link2 = "/dev/null";
            	}	
//        
        //	String [] mal = {"sudo","pkill", "ffmpeg"};
//        	ProcessBuilder pb = new ProcessBuilder().command(mal).redirectErrorStream(true);
//        	Process pidb = pb.start();
//        	
        	
        //	new ProcessBuilder(mal).start();
        	Terminar t = new Terminar();
        	t.TerminarProceso();
//        	//System.gc(); //basura
//        	out.println(toString().toString());
       	
       	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       	Placa ingp = new Placa(link1, link2);
         Thread ing_placa = new Thread(ingp);
         ing_placa.start();
//         out.println("devuelto del proceso 1: " + ingp.getOut());
//         Scanner s = new Scanner(ingp.getOut()).useDelimiter("\\A");
//         String result = s.hasNext() ? s.next() : "";
//         out.print("Respueste de la app: "+result);
         
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
        
      response.sendRedirect("index.jsp");
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

