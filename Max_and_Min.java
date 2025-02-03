import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Max_and_Min {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        double max = decimalList.stream().max(Comparator.naturalOrder()).get();
        double min = decimalList.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Maximum : " + max + "\nMinimum : " + min);
    }
}
