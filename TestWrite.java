import javax.sound.sampled.spi.AudioFileWriter;
import javax.sound.sampled.AudioFileFormat;
import java.io.File;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import java.io.ByteArrayInputStream;




public  class TestWrite {
	//setting up filepath and basic variables to write
	static File path = new File("test.wav"); // File path for the export file
	static AudioFileWriter wr;
	static AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 22000, 16, 1, 16, 22000, false);
	final static double c = 261.63; //middle C 
    final static double cs = 277.18; 
    final static double d = 293.66; 
    final static double ds = 311.13; 
    final static double e = 329.63; 
    final static double f = 349.23; 
    final static double fs = 369.99; 
    final static double g = 392; 
    final static double gs = 415.3; 
    final static double a = 440; 
    final static double as = 466.16; 
    final static double b = 493.88; 
    final static double r = 0; 


	public static void main(String[] args) {

		double bpm = 120;
		double bps = bpm/60;
		double spb = (1/bps);
		double inc = 1/8000;


		byte[] quarter = new byte[(int)(spb-1/8000)*8000];
        byte[] eighth = new byte[(int)((spb/2)-1/8000)*8000];
        byte[] sixteenth = new byte[(int)((spb/4)-1/8000)*8000];
        byte[] half = new byte[(int)((spb*2)-1/8000)*8000];
        byte[] whole = new byte[(int)((spb*4)-1/8000)*8000];
        byte[] quarterdot = new byte[(int)((spb*1.5)-1/8000)*8000];
        byte[] halfdot = new byte[(int)((spb*3)-1/8000)*8000];
        byte[] eighthdot = new byte[(int)((spb*3/4)-1/8000)*8000];
		
		byte[] in = new byte[half.length];
		for(int i = 0; i<in.length; i++) {
			in[i] *= c;
		}
		InputStream buf = new ByteArrayInputStream(in);


		AudioInputStream inputStream = new AudioInputStream(buf, format, in.length);
		wr.write(inputStream, AudioFileFormat.Type.WAVE, path);
		



	}

}
