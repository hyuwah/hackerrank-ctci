import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
       /** Mulai coding disini */

        // Untuk cek doang
        // System.out.println(Arrays.toString(a));      

        // bikin array b, isinya array a dari index "k" sampai terakhir
        int b[] = new int[n-k];
        b = Arrays.copyOfRange(a, k, n); // liat dokumentasi Arrays.copyOfRange()
        
        // bikin array b2, isinya array a dari index 0 sampai "k"
        int b2[] = new int[k];
        b2 = Arrays.copyOfRange(a,0,k);
        
        // bikin array c, isinya array b kemudian disambung b2
        int c[] = new int[n];
        c = IntStream.concat(Arrays.stream(b), Arrays.stream(b2)).toArray(); // liat dokumentasi IntStream.concat()
                
        // Untuk cek doang
        //System.out.println(Arrays.toString(b));
        // Untuk cek doang
        //System.out.println(Arrays.toString(b2));

        // tampilkan array tapi tanpa "[", "]", dan "," (via method .replace())
        System.out.println(Arrays.toString(c).replace("[","").replace("]","").replace(",",""));
        
        /** Akhir coding disini */
    }
}
