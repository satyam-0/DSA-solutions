public class Selection_sort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 78, 90, 21, 523, 1 };
        for (int i = 0; i < arr.length - 1; i++) { // iterate all the loop
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) { // start from the second index and compare it with the rest.
                // find the index of smallest element.
                if (arr[smallest] > arr[j])
                    smallest = j;
            }
            // swap with smallest with ith index value.
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
    }
}
