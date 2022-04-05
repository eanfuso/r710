package com.tvp.pomi_02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;



import java.lang.*;
import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;



//import com.tvpublica.controllers.Process;

public class Ingesta  {
	private String ing;
	private String out;
	
	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}

	public Ingesta(String ing) {
		super();
		this.ing = ing;
	}

//	public Ingesta(String[] ing) {
//		// TODO Auto-generated constructor stub
//	}

	public String getIng() {
		return ing;
	}
//modifica
	public void setIng(String ing) {
		this.ing = ing;
	}

	String [] ld = { "export", "LD_LIBRARY_PATH=~/ffmpeg_build/lib:$LD_LIBRARY_PATH"};
	String [] env = { "env", "|", "grep", "LD"};
	public void correr() throws InterruptedException {
		String path = "/home/rn/logos/app.log";
		
		//String [] cmd = {"ffmpeg", "-hide_banner", "-loglevel", "warning", "-stream_loop", "-1", "-i", "/home/rn/imagenes/twitch.mp4", "-f", "flv", ing};

		//String content = "ffmpeg"+" "+ "-f"+" "+    "decklink"+" "+  "-i"+" "+  "'DeckLink"+" "+  "SDI"+" "+  "4K'"+" "+  "-vf"+" "+  "yadif"+" "+  "-c:v"+" "+  "libx264"+" "+  "-pix_fmt"+" "+  "yuv422p"+" "+   "-r"+" "+  "25"+" "+  "-g"+" "+  "50"+" "+  "-s"+" "+  "1920x1080"+" "+   "-c:a"+" "+  "aac"+" "+  "-f"+" "+  "flv" +" ";
		//String comillas = "\"";
		//String [] cmd = {"ffmpeg", "-hide_banner", "-loglevel", "warning", "-i", "http://rt-esp.rttv.com/live/rtesp/playlist.m3u8", "-f", "flv", ing};
		//String [] cmd = {"ffmpeg",  "-f",   "decklink", "-i",'\u0022'+ "DeckLink", "SDI", "4K"+ '\u0022',  "-vf", "yadif", "-c:v", "libx264", "-pix_fmt", "yuv422p",  "-r", "25", "-g", "50", "-s", "1920x1080",  "-c:a", "aac", "-f", "flv", ing};
 // SOURCES NOMBRE String [] cmd = {"ffmpeg",  "-hide_banner", "-f",   "decklink", "-i","\'DeckLink  SDI 4K\'",  "-vf", "yadif", "-c:v", "libx264", "-pix_fmt", "yuv422p",  "-r", "25", "-g", "50", "-s", "1920x1080",  "-c:a", "aac", "-f", "flv", ing};
		//String [] cmd = {"whoami"};
		//String [] cmd = {"ffmpeg"};
		//String [] cmd = {"FFREPORT=file=pomi.log:level=32:format=log", "ffmpeg",  "-hide_banner", "-f",   "decklink", "-i","71:3a66612b:00000000",  "-vf", "yadif", "-pix_fmt", "yuv422p",  "-crf", "30", "-r", "25", "-g", "50", "-s", "1920x1080",  "-c:a", "aac", "-f", "flv", ing};
 //String cmd = "ffmpeg71:24464621:00000000"+" "+   "-f"+" "+    "decklink"+" "+  "-i"+" "+ '\u0022'+ "DeckLink"+" "+  "SDI"+" "+  "4K"+ '\u0022'+" "+   "-vf"+" "+ "yadif"+" "+  "-c:v"+" "+  "libx264"+" "+  "-pix_fmt"+" "+  "yuv422p"+" "+   "-r"+" "+  "25"+" "+  "-g"+" "+  "50"+" "+  "-s"+" "+  "1920x1080"+" "+  "-c:a"+" "+  "aac"+" "+ "-f"+" "+  "flv"+" "+  "rtmp://localhost:1935/canal";
	
// for (int i=0; i < cmd.length; i++){
//	 String x = "";
//	 x = x +i;
//	 this.out=x;
  
// }
 
		//COMANDO COMPLETO "FFREPORT=file=ffreport1.log:level=32:format=log",  "-loglevel", "warning", 
//		FFREPORT=file=ffreport1.log:level=32:format=log ffmpeg -hide_banner -loglevel warning -y -vsync 1 -hwaccel cuda -hwaccel_output_format cuda -thread_queue_size 4094  -f decklink -i 71:3a66612b:00000000 -c:a copy  -c:v h264_nvenc -preset p6   -tune hq -b:v 7M -bufsize 7M -maxrate 10M -qmin 0 -g  50 -bf 3 -b_ref_mode middle -temporal-aq 1 -rc-lookahead 20 -i_qfactor 0.75 -b_qfactor 1.1  -vf "yadif, format=uyvy422"  -s hd1080 -r 25 -c:a aac -ar 44100 -threads 8  -f flv rtmp://a.rtmp.youtube.com/live2/bvf5-2auh-xudd-kzga-9as6  > /dev/null 2>&1 &
		String [] cmd = {"ffmpeg",  "-y", "-vsync", "1", "-hwaccel", "cuda", "-hwaccel_output_format", "cuda", "-thread_queue_size", "4096", "-f", "decklink", "-i", "71:3a66612b:00000000", "-c:a", "copy", "-c:v", "h264_nvenc", "-preset", "p6", "-tune", "hq", "-b:v", "6M", "-bufsize", "6M", "-maxrate",  "7M", "-vf", "yadif", "-s", "hd1080", "-r", "25", "-c:a", "aac", "-ar", "44100", "-threads", "8", "-f", "flv", ing};
 
      
		
		try {
	//	new	ProcessBuilder(ld);
		//Process	process = Runtime.getRuntime().exec(cmd);
		
		
		Process process = new ProcessBuilder(cmd).redirectErrorStream(true).start();
	            

	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    wait(500);
	    String line = "";
	    String outputJson = "";
	    while ((line = reader.readLine()) != null) {
	        outputJson = outputJson + line;
	        out = outputJson;
	        
//	        
//	        for (int i=0; i < cmd.length; i++){
//	       	 String x = "";
//	       	 x = x.concat(cmd[5]);
//	       	 
//	       	 this.out= Arrays.toString(cmd);
//	       	 
//	        }
	        
	        //this.out= Arrays.toString(cmd);
	        
	      //  process.waitFor();
	    }
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	}
//ME CUELGA
			
		
//	InputStreamReader in = new InputStreamReader(ing.getOut());
//	Stream<String> sos = new BufferedReader(in).lines();
//	String soso = sos.collect(Collectors.joining());
//	
//	out.println(soso);
			
			
			
			//System.out.println(inputStream);
			//BufferedInputStream buffer = new BufferedInputStream(inputStream);
//			InputStreamReader in = new InputStreamReader(stdOut);
//			Stream<String> sos = new BufferedReader(in).lines();
//			String soso = sos.collect(Collectors.joining());
//			System.out.println(soso);
//			
			
			
//			new Thread(new Runnable(){
//			    public void run(){
//			        byte[] buffer = new byte[8192];
//			        int len = -1;
//			        while((len = stdOut.read(buffer)) > 0){
//			            System.out.write(buffer, 0, len);
//			        }
//			    }
//			}).start();
			
			
			
			
			
			
			
			
			
			
	
		
		public void correrPlaca() {
			try {
				
			//	new	ProcessBuilder(ld);
				String [] cmdPlaca = {"ffmpeg", "-hide_banner", "-loglevel", "warning", "-stream_loop", "-1","-hwaccel", "cuda", "-thread_queue_size", "4096", "-i", "/home/pomi/separador.mp4", "-c:v", "h264_nvenc", "-b:v", "6M", "-bufsize", "6M", "-maxrate",  "7M", "-s", "hd1080", "-r", "25", "-c:a", "aac", "-ar", "44100", "-threads", "4", "-f", "flv", ing};
				
				
				Process process = new ProcessBuilder(cmdPlaca).redirectErrorStream(true).start();
	            

			    
			    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			    String line = "";
			    String outputJson = "";
			    while ((line = reader.readLine()) != null) {
			        outputJson = outputJson + line;
			        out = outputJson;
			    }
				
				//PROCESO VIEJO FUNCIONANDO
//				ProcessBuilder pb = new ProcessBuilder().command(cmdPlaca).redirectErrorStream(true);
//				Process p = pb.start();
//				InputStream stdOut = p.getInputStream();
//				
//				//out = stdOut;
//				String path = "/home/rn/logos/app.log";
//				InputStreamReader in = new InputStreamReader(p.getInputStream());
//				Stream<String> sos = new BufferedReader(in).lines();
//				String soso = sos.collect(Collectors.joining());
//				Files.writeString(Paths.get(path), soso);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}

// ffmpeg "-i", "http://rt-esp.rttv.com/live/rtesp/playlist.m3u8", "-f", "flv",  "2>", "C:\\convertidos\\log.log"