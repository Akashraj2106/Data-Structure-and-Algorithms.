
public class bubble_sort {

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void bubble_sorts(int arr[]) {
        for (int term = 0; term < arr.length - 1; term++) {  // from 0 to 3
            for (int j = 0; j < arr.length - 1 - term; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // selection sorting
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            swap(arr, i, min);

        }
    }

    public static void insertation_sort(int arr[]) {

        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        bubble_sorts(arr);
        System.out.println("sorting by bubble");
        print(arr);
        System.out.println();
        selection(arr);
        System.out.println("sort by selection");
        print(arr);
        insertation_sort(arr);
        System.out.println();
        System.out.println("sort by insertation");
        print(arr);
    }
}
