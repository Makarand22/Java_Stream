import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge_Unsorted_Array {
    public static void main(String[] args) {
           int[] a = {33, 52, 2, 12, 34};
           int[] b = {23, 54, 6, 76, 22};

           int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
           System.out.println(Arrays.toString(c));
    }
}
