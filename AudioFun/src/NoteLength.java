public class NoteLength {
    public byte[] quarter;
    public byte[] eighth;
    public byte[] sixteenth;
    public byte[] half;
    public byte[] whole;
    public byte[] quarterdot;
    public byte[] halfdot;
    public byte[] eighthdot;


       

    public NoteLength(double spb) { // seconds per beat
        quarter = new byte[(int)(spb-1/8000)*8000];
        eighth = new byte[(int)((spb/2)-1/8000)*8000];
        sixteenth = new byte[(int)((spb/4)-1/8000)*8000];
        half = new byte[(int)((spb*2)-1/8000)*8000];
        whole = new byte[(int)((spb*4)-1/8000)*8000];
        quarterdot = new byte[(int)((spb*1.5)-1/8000)*8000];
        halfdot = new byte[(int)((spb*3)-1/8000)*8000];
        eighthdot = new byte[(int)((spb*3/4)-1/8000)*8000];
    }

    



}
