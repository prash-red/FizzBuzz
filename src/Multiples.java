public class Multiples {
    public static void main(String[] args) {
        int sum = 0;
        int mult3 = 3;
        int mult5 = 5;
        while (mult3 < 1000) {
            sum += 1;
            mult3 += 3;
        }
        while (mult5 < 1000) {
            sum += 1;
            mult5 += 5;
        }
        System.out.println(sum);
    }
}
