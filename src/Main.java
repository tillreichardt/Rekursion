public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(cal(5));
    }
    public static long cal(int n) {
        if (n == 0) {
            n = 1;
            return 1;
        } else {
            return n * cal(n - 1);
        }
    }
}