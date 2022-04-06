package com.tvp.pomi_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Presentacion implements Runnable {
	private String ing;
	private String out;
	
	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}
	public Presentacion(String ing) {
		
		this.ing = ing;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
String [] cmd = {"ffmpeg",  "-y", "-vsync", "1", "-hwaccel", "cuda", "-hwaccel_output_format", "cuda", "-thread_queue_size", "4096", "-f", "decklink", "-i", "71:3a66612b:00000000", "-c:a", "copy", "-c:v", "h264_nvenc", "-preset", "p6", "-tune", "hq", "-b:v", "6M", "-bufsize", "6M", "-maxrate",  "7M", "-vf", "yadif", "-s", "hd1080", "-r", "25", "-g", "50", "-c:a", "aac", "-ar", "44100", "-threads", "8", "-f", "flv", ing};
 
      
		
		try {
			
		
		Process process = new ProcessBuilder(cmd).redirectErrorStream(true).start();
	            

	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	   
	    String line = "";
	    String outputJson = "";
	    while ((line = reader.readLine()) != null) {
	        outputJson = outputJson + line;
	        out = outputJson;
	        
//	        
//	        
	    }
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

	}

}
