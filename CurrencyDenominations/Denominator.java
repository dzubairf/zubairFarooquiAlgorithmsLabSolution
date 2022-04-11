package CurrencyDenominations;
import java.util.ArrayList;
import java.util.Scanner;

public class Denominator {
    Scanner scanner = new Scanner(System.in);
    public void denominator(ArrayList<Integer> array, int size) {
        System.out.println("Enter the amount you want to pay");
        int amount = scanner.nextInt();

        ArrayList<Integer> coinList = new ArrayList<>();
        ArrayList<Integer> coin = new ArrayList<>();

        //This loop will run for this currency
        for (int i = size - 1; i > -1; i--){
            for (int j = 0; j < amount / array.get(i) ;j++){
                int coinCount = amount / array.get(i);
                amount -= (coinCount * array.get(i));
                coinList.add(array.get(i)); // Pushing used notes to an array
                coin.add(coinCount); // Pushing notes count to an array
            }
        }
        //Printing Result
        if (amount != 0){
            System.out.println("Exact amount cannot be achived with ");
        }
        else {
            System.out.println("Your payment approach in order to give min no of notes will be");
            for (int k = 0; k < coinList.size(); k++){
                System.out.println(coinList.get(k) + ":"+ coin.get(k));
            }
        }
    }
}
