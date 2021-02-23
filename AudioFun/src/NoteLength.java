public class NoteLength {
	private double inc;
    public double[] quarter;
    public double[] eighth;
    public double[] sixteenth;
    public double[] half;
    public double[] whole;
    public double[] quarterdot;
    public double[] halfdot;
    public double[] eighthdot;
    private double bps = 0;

       

    public NoteLength(double bpm, double frameSize) { // seconds per beat
    	bps = bpm/60; //60 bpm = 16000 samples
    	double spb=1/bps; //120bpm = 1/4 sec per beat
    	
    	
    	
        quarter = new double[(int)((spb)*frameSize)];
        eighth = new double[(int)((spb/2)*frameSize)];
        sixteenth = new double[(int)((spb/4)*frameSize)];
        half = new double[(int)((spb*2)*frameSize)];
        whole = new double[(int)((spb*4)*frameSize)];
        quarterdot = new double[(int)((spb*1.5)*frameSize)];
        halfdot = new double[(int)((spb*3)*frameSize)];
        eighthdot = new double[(int)((spb*3/4)*frameSize)];
        double inc = 0;
        for(int i  = 0; i < whole.length; i++) {
        	try {
        		quarter[i] = inc;
        		eighth[i] = inc;
        		sixteenth[i] = inc;
        		half[i] = inc;
        		whole[i] = inc;
        		quarterdot[i] = inc;
        		halfdot[i] = inc;
        		eighthdot[i] = inc;
        		inc+=1/8000;
        	}
        	catch(Exception e) {
        		
        	}
        }
        
        
        
    }

    



}
