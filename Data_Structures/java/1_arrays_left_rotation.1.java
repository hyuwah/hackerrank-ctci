import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // ukuran array
        int k = in.nextInt(); // banyaknya "left rotations" yang mesti dilakukan (geser "k" data ke kiri)
        int a[] = new int[n]; // array awal
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        /** Mulai coding disini */

        // Untuk cek doang
        // System.out.println(Arrays.toString(a));
        
        // bikin array baru
        int b[]= new int[n];
        // set index ke k (index untuk array a[]) 
        int index = k;
        // saatnya isi array b[]
        for(int b_i=0; b_i< n; b_i++){
            // isi array b[] dari index 0 dengan data array a[] pada index = k
           b[b_i] = a[index];
           // tampilkan
           System.out.print(a[index]+" ");
           // increment juga index/k untuk array a[] nya
           index++; 
           // kalo index/k udah di data terakhir, set ke data pertama
           // awal -> [0][...][n] <- akhir
           // jadi muter
           if(index==n){index=0;}
        }
        
        // Untuk cek doang
        // System.out.println(Arrays.toString(b));
        
        /** Akhir coding disini */
        
    }
}
