import java.util.Arrays;
import java.util.List;

public class Sort_Using_Comparator {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12, 100.00);

        List<Double> sortedList = decimalList.stream()
                .sorted((a, b) -> (int) (a - b))
                .toList();
        List<Double> reverseSortedList = decimalList.stream()
                .sorted((a, b) -> (int) (b - a))
                .toList();
        System.out.println("Ascending Sort :  " + sortedList);
        System.out.println("Descending Sort : " + reverseSortedList);
    }
}
