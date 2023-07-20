
public class Solution1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,9,13};
        int n = arr.length;
        int ele=1;
        int i=0;
        while(i<n) {
            if(arr[i]==ele) {
                ele++;
                i++;
            } else {
                System.out.print(ele+" ");
                ele++;
            }

        }

    }
    
}
