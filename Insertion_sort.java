public class Insertion_sort {
    public static void main(String[] args) {
        int arr[] = { 56, 3, 8, 2, 9, 190, 0 };
        for (int i = 1; i < arr.length; i++) { // i is the first element of our unsorted array
            int current = arr[i]; // current me unsorted array ka phla elment asa gya
            int j = i - 1; // j hamara sorted array ka last elemt ka index hai..
            while (j >= 0 && current < arr[j]) { // while loop ke jariye ... jab tak sorted array me last element se
                                                 // leke fist element tak aur jab tak current mtlb unsorted ka fist
                                                 // elemnt hamara sortted elemt se chotta hai.
                arr[j + 1] = arr[j];// jo elemt current value se bada hai usko khischkate jaa rahe hai .. taki last
                                    // me j+1 position pr cuirrent value ko daal sake.
                j--;
            }
            // now, we get the position j where we have to inserted ith value
            // placement of value
            arr[j + 1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
