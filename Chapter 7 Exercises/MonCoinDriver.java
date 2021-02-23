public class MonCoinDriver {

    public static void main(String[] args) {
        MonetaryCoin q = new MonetaryCoin(0.25); // 1 Quarter
        MonetaryCoin d = new MonetaryCoin(0.1,5); // 5 Dimes
        double total = 0;
        total = q.getValue() + d.getValue();
        System.out.println(total);
        q.flip();
        System.out.println(q.getSide());
    }



}
