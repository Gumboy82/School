import javax.sound.sampled.AudioFileFormat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat;
import java.io.ByteArrayInputStream;




public  class TestWrite {
	//setting up file path and basic variables to write
	static File path = new File("test.wav"); // File path for the export file
	


	public static void main(String[] args) throws IOException {

		double bpm = 120;
		double bps = bpm/60;
		double spb = (1/bps);
		double inc = 1/8000;
		
		Note oct = new Note();
		NoteLength set = new NoteLength(spb);
		
		
		byte[] in = new byte[set.half.length];
		System.out.println(set.half.length);
		for(int i = 0; i<in.length; i++) {
			in[i] = (byte) (120*Math.sin(2*Math.PI*oct.c/in.length*i));
		}
		InputStream buf = new ByteArrayInputStream(in);


		AudioInputStream inputStream = new AudioInputStream(buf, new AudioFormat(16000, 16, 1, true, false), in.length);
		
		AudioSystem.write(inputStream, AudioFileFormat.Type.WAVE, path);
		
		



	}

}
