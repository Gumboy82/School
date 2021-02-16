import javax.sound.sampled.*;
import javax.sound.sampled.AudioSystem;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;


public class AMinor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//bpm = 120;
		//bps = 2;
		//spb = 0.5
		
		
		
		File path = new File("C:\\Users\\fburden6736\\eclipse-workspace\\AudioFun\\src\\test.wav");
	    byte[] b = new byte[16000];
	    //lets make a 440hz tone for 4s at 32kbps, and 523.25hz.
	    for(int i = 0; i<b.length; i++){
	        b[i]  = (byte)(100*Math.sin(4*Math.PI*523.25/b.length*i));
	    }
	    

	    AudioInputStream stream = new AudioInputStream(
	        new ByteArrayInputStream(b), 
	        new AudioFormat(16000, 8, 1, true, false), 
	        16000);
	        
	        
	        AudioSystem.write(stream, AudioFileFormat.Type.WAVE, path);
	    
	    
	}

}
