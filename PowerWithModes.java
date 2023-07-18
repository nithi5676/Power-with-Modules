package powerWithModes;

import java.util.Scanner;

public class PowerWithModes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A, B and C values");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();
        System.out.println(mod(A, B, C));

    }

    private static int mod(int a, int b, int c) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = (result * a) % c;
        }
        return result;
    }

}
