package videotranscript.data;

import java.io.File;
import it.sauronsoftware.jave.*;

public class VideoToAudio {
	public static void ConvertToAudio(File video, String target) {
		//"C:\\Users\\Jim\\Desktop\\Audio.wav"
		
		//Display conversion
		System.out.println("Start Converting ...");
		File Audio = new File(target);
		
		// Audio details
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("pcm_s16le");
		//audio.setBitRate(new Integer(128000));
		//audio.setChannels(new Integer(2));
		//audio.setSamplingRate(new Integer(44100));
		
		//Encoding details
		EncodingAttributes attr = new EncodingAttributes();
		attr.setFormat("wav");
		attr.setAudioAttributes(audio);
		
		
		//Actual conversion
		Encoder encode = new Encoder();
		try {
			encode.encode(video, Audio,attr);
			System.out.println("Convert Finished");
		} catch(Exception e) {
			System.err.println(e.toString());
		}
	}
}
