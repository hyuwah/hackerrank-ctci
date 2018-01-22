import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
        /** Mulai coding disini */

        // n = 0 dan 1 masing-masing ngembaliin 0 dan 1
        if(n==0) return 0;
        if(n==1) return 1;
        
        // n = lebih dari 1, ngembaliin fib(n-1) + fib(n-2), nah terjadi rekursi
        return fibonacci(n-1) + fibonacci(n-2);
        
        /** Akhir coding disini */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
