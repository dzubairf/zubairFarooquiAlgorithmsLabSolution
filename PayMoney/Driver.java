package PayMoney;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Enter the size of transaction array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        // Taking inputs for array
        System.out.println("Please enter the values of array");
        for (int i = 0; i < size; i++){
            int userInput = scanner.nextInt();
            array[i] = userInput;
        }
        //Creating Object of PayMoney class to call transaction checker method
        PayMoney payMoney = new PayMoney();
        payMoney.transactionChecker(array, size);
    }
}
