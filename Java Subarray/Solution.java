import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        int count = 0;
        for(int i = 0;i<n;i++){
            int tot = arr[i];
            if (tot < 0){
                count += 1;
            }
            for(int j = i+1;j<n;j++){
                tot += arr[j];
                if (tot < 0){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
