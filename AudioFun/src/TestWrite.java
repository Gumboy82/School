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
		
		Note oct = new Note();
		NoteLength set = new NoteLength(spb, 16000);
		
		
        byte[] in = new byte[set.half.length];
        double[] n1 = new double[set.half.length];
        double[] n2 = new double[set.half.length];
        double[] n3 = new double[set.half.length];
        
        

		for(int i = 0; i<in.length; i++) {
            n1[i] = (120*Math.sin(2*Math.PI*oct.c/in.length*i));
            n2[i] = (120*Math.sin(2*Math.PI*oct.e/in.length*i));
            n3[i] = (120*Math.sin(2*Math.PI*oct.g/in.length*i));
        }
        for(int i = 0; i<in.length; i++) {
			in[i] = (byte) (n1[i] + n2[i] + n3[i]);
        }

        
		InputStream buf = new ByteArrayInputStream(in);


		AudioInputStream inputStream = new AudioInputStream(buf, new AudioFormat(16000, 16, 1, true, false), in.length);
		
		AudioSystem.write(inputStream, AudioFileFormat.Type.WAVE, path);
		
		



	}

}
