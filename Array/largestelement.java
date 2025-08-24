
public class largestelement {

    // Method to find the largest element
    public static int findLargest(int arr[]) {
        int max = arr[0];  // assume first element is largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // update max if current element is greater
            }
        }

        return max;
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 9, 6};
        int largest = findLargest(arr);

        System.out.println("The largest element is: " + largest);
    }
}
