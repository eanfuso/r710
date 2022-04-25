package com.tvp.pomi_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Presentacion implements Runnable {
	private String ing;
	private String ing2;
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

	public Presentacion(String ing, String ing2) {

		this.ing = ing;
		this.ing2 = ing2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// "FFREPORT=file=/home/pomi/ffreport1.log:level=32:format=log",
//String [] cmd = {"FFREPORT=file=/usr/share/tomcat9/ffreport1.log:level=32", "ffmpeg", "-re",  "-y", "-vsync", "1", "-hwaccel", "cuda", "-hwaccel_output_format", "cuda", "-thread_queue_size", "4096", "-f", "decklink", "-i", "71:3a66612b:00000000", "-c:v", "h264_nvenc", "-preset", "p6", "-tune", "hq", "-b:v", "6M", "-bufsize", "6M", "-maxrate",  "7M", "-vf", "yadif", "-s", "hd1080", "-r", "25", "-g", "50", "-c:a", "aac", "-ar", "44100", "-threads", "8", "-f", "flv", ing};
		// FUNCIONA String [] cmd = {"ffmpeg", "-vstats_file",
		// "/home/pomi/ffreport1.log", "-re", "-y", "-vsync", "1", "-hwaccel", "cuda",
		// "-hwaccel_output_format", "cuda", "-thread_queue_size", "4096", "-f",
		// "decklink", "-i", "71:3a66612b:00000000", "-c:v", "h264_nvenc", "-preset",
		// "p6", "-tune", "hq", "-b:v", "6M", "-bufsize", "6M", "-maxrate", "7M", "-vf",
		// "yadif", "-s", "hd1080", "-r", "25", "-g", "50", "-c:a", "aac", "-ar",
		// "44100", "-threads", "8", "-f", "flv", ing};
		// , ing, "2>", "/usr/share/tomcat9/ffreport1.log"
//		String[] cmd = { "ffmpeg", "-report",  "-y", "-vsync", "1", "-hwaccel", "cuda", "-hwaccel_output_format",
//				"cuda", "-thread_queue_size", "4096", "-f", "decklink", "-i", "71:3a66612b:00000000", "-c:v",
//				"h264_nvenc", "-preset", "p6",  "-b:v", "6M", "-bufsize", "6M", "-maxrate", "7M", "-vf",
//				"yadif", "-s", "hd1080", "-r", "25000/1000", "-g", "50", "-spatial-aq", "1", "-aq-strength", "15",  "-rc-lookahead", "20",  "-c:a", "aac", "-ar", "44100", "-threads", "8", "-f",
//				"flv", ing, "-c:v",
//				"h264_nvenc", "-vf",
//				"yadif", "-preset", "p6", "-g", "90", "-r", "30000/1000", "-b:v", "6M", "-bufsize", "6M", "-maxrate", "7M", 
//				"-spatial-aq", "1", "-aq-strength", "15",  "-rc-lookahead", "20", "-c:a", "aac", "-ar", "44100", "-f", "flv", ing2 };

		String[] cmd = { "ffmpeg", "-report",  "-y", "-vsync", "1", "-hwaccel", "cuda", "-hwaccel_output_format",
				"cuda", "-thread_queue_size", "4096", "-f", "decklink", "-i", "71:3a66612b:00000000", "-c:v",
				"h264_nvenc", "-preset", "p6",  "-b:v", "6M", "-bufsize", "6M", "-maxrate", "7M", "-vf",
				"yadif", "-s", "hd1080", "-r", "25000/1000", "-g", "50", "-spatial-aq", "1", "-aq-strength", "15",  "-rc-lookahead", "20",  "-c:a", "aac", "-ar", "44100", "-threads", "8", "-f",
				"flv", ing, "-c:v",
				"h264_nvenc", "-preset", "p6", "-vsync", "1",   "-b:v", "6M", "-bufsize", "6M", "-maxrate", "7M", "-vf",
				"yadif", "-s", "hd1080", "-r", "25000/1000", "-g", "50", "-spatial-aq", "1", "-aq-strength", "15",  "-rc-lookahead", "20",  "-c:a", "aac", "-ar", "44100", "-threads", "8", "-f",
				"flv", ing2 };

		
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
