package CurrencyDenominations;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Enter the size of currency denominations");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        // Taking inputs for array
        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < size; i++){
            array.add(scanner.nextInt());
        }
        array.sort(Comparator.naturalOrder());
        //Calling Denominator Method
        Denominator denominator = new Denominator();
        denominator.denominator(array, size);

    }
}
