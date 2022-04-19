package com.tvp.pomi_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Placa implements Runnable {
	private String ing;
	private String ing2;
	private String out;
	public Placa(String ing) {
		super();
		this.ing = ing;
	}
	public Placa(String ing, String ing2) {
		super();
		this.ing = ing;
		this.ing2 = ing2;
	}
	public String getIng() {
		return ing;
	}
	public void setIng(String ing) {
		this.ing = ing;
	}
	public String getOut() {
		return out;
	}
	public void setOut(String out) {
		this.out = out;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			//	new	ProcessBuilder(ld);
				//String [] cmdPlaca = {"ffmpeg", "-report", "-hide_banner", "-loglevel", "warning", "-re", "-y", "-vsync", "1", "-stream_loop", "-1","-hwaccel", "cuda", "-thread_queue_size", "4096", "-i", "/home/pomi/separador.mp4", "-c:v", "h264_nvenc", "-b:v", "6M", "-maxrate",  "7M", "-s", "hd1080", "-r", "25", "-g", "50", "-c:a", "aac", "-ar", "44100", "-threads", "4", "-f", "flv", ing};
				
			String[] cmdPlaca = { "ffmpeg", "-report", "-re", "-vsync", "1", "-hwaccel", "cuda", "-stream_loop", "-1",   "-copyts",  "-i", "/home/pomi/placa.ts", "-c:v",
					"h264_nvenc", "-preset", "p6",  "-flags", "ildct",
					 "-g", "12", "-r", "25000/1000",  "-c:a", "aac", "-ar", "44100", "-f",
					"flv", ing, "-c:v",	"h264_nvenc", "-preset", "p6", "-flags", "ildct",
					 "-g", "12", "-r", "25000/1000", "-c:a", "aac", "-ar", "44100", "-f", "flv", ing2 };
			
			
				
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
