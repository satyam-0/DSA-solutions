import java.util.*;

public class bubble_sort {
    public static void main(String sid[]) {
        int arr[] = { 5, 3, 6, 2, 1, 9, 11 };
        // sorting
        for (int i = 0; i < arr.length - 1; i++) // loop for n-1 pass
        {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 0; i <= arr.length; i++)
            System.out.println(arr[i]);
    }
}
