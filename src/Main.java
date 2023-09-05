public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(cal(5));
        System.out.println(fibonacci(9));
    }
    public static long cal(int n) {
        if (n == 0) {
            n = 1;
            return 1;
        } else {
            return n * cal(n - 1);
        }
    }
    private static int fibonacci(int a){

        if (a==1||a==2) {
            return 1;
        } else {
            return fibonacci(a-1)+fibonacci(a-2);
        }

    }
}