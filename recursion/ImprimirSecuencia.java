package recursion;

import java.math.BigInteger;

public class ImprimirSecuencia {
    public static void impSec1(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }

    public static void impSec2(int n, int m) {
        if (n == m) {
            System.out.println(n);
        } else {
            impSec2(n + 1, m);
            System.out.println(n);
        }
    }

    // public static void impSec2(int n, int m) {
    // if (n == m) {
    // System.out.println(m);
    // } else {
    // System.out.println(m);
    // impSec2(n, m -1);
    // }
    // }

    public static int factorialN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialN(n - 1);
        }
    }

    public static BigInteger fibo(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else {
            return fibo(n - 1).add(fibo(n - 2));
        }
    }

    public static void main(String[] args) {
        // impSec2(1, 3);
        // System.out.println(factorialN(5));
        System.out.println(fibo(50));
    }
}
