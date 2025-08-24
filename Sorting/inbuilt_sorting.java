
import java.util.*;

public class inbuilt_sorting {

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        Integer arry[] = {5, 3, 9, 4, 3};
        Arrays.sort(arry, Collections.reverseOrder());
        System.out.println("reverseOrder");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }
}
