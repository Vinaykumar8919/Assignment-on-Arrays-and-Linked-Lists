import java.util.*;


public class Solution {

    public static int countSingular(int n, int arr[]) {
        Map<Integer,Integer> pairCount = new HashMap<>();
        for(int id : arr) {
            pairCount.put(id, pairCount.getOrDefault(id, 0)+1);
        }

        int count = 0;
        for(int id : pairCount.keySet()) {
            count=count+pairCount.get(id)%2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        int result = countSingular(n,arr);
        System.out.println("Count of singular socks = " + result);
    }
}