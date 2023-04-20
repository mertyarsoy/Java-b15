public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println("Prime numbers from 0 to 100 are: ");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
