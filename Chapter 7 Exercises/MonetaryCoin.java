public class MonetaryCoin extends Coin{
    private double value;
    public int amount;

    public MonetaryCoin(double v) {
        value = v;
        amount = 1;
    }
    public MonetaryCoin(double v, int a) {
        value = v;
        amount = a;
    }

    public double getValue() {
        return value*amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int a) {
        amount = a;
    }

    






}
