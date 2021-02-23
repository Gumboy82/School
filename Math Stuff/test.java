public class test {
    public static void main(String[] args) {
        int time = 4;
        double total = 0;
        double x = Math.PI*0.1;
        double fact = 1;

        for(int i = 1; i <= time; i+=2) {
            fact = 1;
            for(int j=1; j<=i;j++) {
                fact*=j;
            }
            
            total+=Math.pow(x, i)/fact;
        }
        System.out.println(total);
        Object obj;
        obj.
    }
}
