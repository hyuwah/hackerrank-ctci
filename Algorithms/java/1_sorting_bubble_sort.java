import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        /** Mulai coding disini */

        // bikin array a[], isi dengan baca input STDIN
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        
        // Untuk cek doang
        //System.out.println(Arrays.toString(a));
        
        // bikin variabel untuk nampung nilai sementara
        int temp=0;
        // bikin variabel penghitung pertukaran / swap
        int swap=0;
        // mulai proses sorting, 2 loop supaya membandingkan semua data
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                // simpen nilai banding pertama (posisi di kiri) di temp, karena kalo ga disimpen ntar ketimpa
                temp = a[j-1];
                // kalo nilai banding pertama lebih besar dari nilai banding kedua (posisi di kanan), tuker tempat
                if(a[j-1]>a[j]){
                // increment pertukaran
                swap++; 
                // isi nilai banding pertama (pos kiri) dengan nilai banding kedua (pos kanan)
                // [...][nilai banding pertama][nilai banding kedua][...] -> [...][nilai banding kedua][nilai banding kedua][...]
                a[j-1] = a[j];
                // ganti nilai banding kedua (pos kanan) dengan nilai banding pertama dari temp
                // [...][nilai banding kedua][nilai banding kedua][...] -> [...][nilai banding kedua][nilai banding pertama][...]
                a[j] = temp;
                }
            }
        }
        
        //System.out.println(Arrays.toString(a));
        
        System.out.println("Array is sorted in "+swap+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);

        /** Akhir coding disini */
        
    }
}