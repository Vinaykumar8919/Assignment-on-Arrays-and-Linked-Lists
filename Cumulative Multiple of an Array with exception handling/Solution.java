import java.util.*;

public class Solution {

    // reading array elements
    public static void read(int n, int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            try {
                arr[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine(); 
                i--;
            }
        }
    }

    public static void display(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void cumulativeMultiple(int n, int arr[]) {
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] * arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter Size of Array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        read(n, arr);
        cumulativeMultiple(n, arr);
        display(n, arr);
        sc.close(); //close
    }
}
