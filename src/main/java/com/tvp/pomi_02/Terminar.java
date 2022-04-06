package com.tvp.pomi_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminar {
	private String vuelta ="";

	
	
	
	
	
	public String getVuelta() {
		return vuelta;
	}

	public void setVuelta(String vuelta) {
		this.vuelta = vuelta;
	}

	public Terminar() {
		super();
	}
	
	public void TerminarProceso () throws IOException {
	String[] mat = {"taskkill", "/f", "/IM", "ffmpeg.exe"};
	String[] pid = {"tasklist"};
	String [] mal = {"pkill", "ffmpeg"};
	String [] kill = {"ps", "-e", "|", "grep", "ffmpeg", "|", "awk", "\'{print", "$", "1}\'", "|",  "xargs", "sudo", "kill", "-9"};
	String  d = "/home/pomi/detener.sh";
	String [] kill2 = {"pgrep", "ffmpeg", "|",  "xargs", "sudo", "kill", "-9"};
	ProcessBuilder pb = new ProcessBuilder().command(mal).redirectErrorStream(true);
	Process pidb = pb.start();
	
	
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(pidb.getInputStream()));
    //wait(500);
    String line = "";
    String outputJson = "";
    while ((line = reader.readLine()) != null) {
        outputJson = outputJson + line;
        
	
	
	
	vuelta  = outputJson;
    }
	
	//Process matar = new ProcessBuilder(mal).redirectErrorStream(true).start();
//	System.out.println("Devuelto del matar: "+matar);
	
	
//	Runtime runtime =Runtime.getRuntime();
//	Process process = runtime.exec(mat);
	
	
	 
//  InputStreamReader in = new InputStreamReader(pidb);
//	Stream<String> sos = new BufferedReader(in).lines();
//	String soso = sos.collect(Collectors.joining());         taskkill f /IM ffmpeg.exe
	
	
	}
	
	
}
