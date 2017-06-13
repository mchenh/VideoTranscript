package videotranscript.main;

import java.io.File;

import videotranscript.data.VideoToAudio;

public class Run {

	public static void main(String args[]) {
		File Video = new File("C:\\Users\\Jim\\Desktop\\sample.mp4");
		VideoToAudio.ConvertToAudio(Video);
	}
}
