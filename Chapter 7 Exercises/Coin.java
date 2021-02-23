public class Coin {
    private int side;

    public Coin() {
        side = 1;
    }

    public String getSide() {
        if (side == 1) {
            return "Heads";
        }
        else {
            return "Tails";
        }
    }

    public void flip() {
        side = (int)(Math.random()*2);
    }
}
