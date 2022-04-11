package PayMoney;
import java.lang.annotation.Target;
import java.util.Scanner;

public class PayMoney {
    Scanner scanner = new Scanner(System.in);
    public void transactionChecker(int[] array, int size) {
        System.out.println("Enter the total no of targets that needs to be achieved");
        int noOfTransaction = scanner.nextInt();
        boolean targetAchieved = false;
        for (int i = 0; i < noOfTransaction; i++){
            System.out.println("Enter the value of target");
            int targetValue = scanner.nextInt();
            int sum = 0;
            for (int j = 0; j < size; j++){
                sum += array[j];
                if (sum >= targetValue){
                    targetAchieved = true;
                    System.out.println("Target achieved after " + (j+1) + " transactions ");
                    break;
                }
            }
            if (targetAchieved == false){
                System.out.println("Given target is not achieved");
            }
        }
    }
}