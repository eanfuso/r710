package com.tvp.pomi_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminar {

	
	
	
	
	
	public Terminar() {
		super();
	}
	
	public void TerminarProceso () throws IOException {
	String[] mat = {"taskkill", "/f", "/IM", "ffmpeg.exe"};
	String[] pid = {"tasklist"};
	String [] mal = {"sudo","pkill", "ffmpeg"};
	ProcessBuilder pb = new ProcessBuilder().command(mal).redirectErrorStream(true);
	Process pidb = pb.start();
	
	
//	Runtime runtime =Runtime.getRuntime();
//	Process process = runtime.exec(mat);
	
	
	 
//  InputStreamReader in = new InputStreamReader(pidb);
//	Stream<String> sos = new BufferedReader(in).lines();
//	String soso = sos.collect(Collectors.joining());         taskkill f /IM ffmpeg.exe
	
	
	}
	
	
}
