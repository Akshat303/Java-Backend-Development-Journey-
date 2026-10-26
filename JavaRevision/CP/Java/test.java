import java.util.*;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // n = valid elements in first array
        // m = elements in second array
        int n = sc.nextInt();
        int m = sc.nextInt();

        // First array has total n + m size
        int[] arr1 = new int[n + m];

        for (int i = 0; i < n + m; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array has m elements
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge from the back
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;

        while (i >= 0 && j >= 0) {

            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }

            k--;
        }

        // Remaining elements of arr2
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }

        // Print final sorted array
        for (int x : arr1) {
            System.out.print(x + " ");
        }
    }
}