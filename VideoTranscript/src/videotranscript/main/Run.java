package videotranscript.main;

import java.io.File;
import java.util.Scanner;

import videotranscript.data.VideoToAudio;

public class Run {

	public static void main(String args[]) {
		
		//Ask for video file location
		Scanner kb = new Scanner(System.in);
		System.out.print("Video File Location: ");
		//"C:\\Users\\Jim\\Desktop\\sample.mp4"
		String vf = kb.nextLine();
		
		//Ask for audio file target location
		System.out.print("Audio File Target Location: ");
		//"C:\\Users\\Jim\\Desktop\\Audio.wav"
		String af = kb.nextLine();
		
		File Video = new File(vf);
		VideoToAudio.ConvertToAudio(Video, af);
	}
}
