package videotranscript.main;

import java.io.File;
import java.util.Scanner;

import videotranscript.data.VideoToAudio;

public class Run {

	public static void main(String args[]) {
		
		//Ask for video file location
		Scanner kb = new Scanner(System.in);
		System.out.println("Video File Location: ");
		String vf = kb.nextLine();
		//"C:\\Users\\Jim\\Desktop\\sample.mp4"
		File Video = new File(vf);
		VideoToAudio.ConvertToAudio(Video);
	}
}
