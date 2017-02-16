import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anthonymparker on 2/16/17.
 */
public class CarApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Car user = new Car();

        System.out.print("How many cars do you want to enter ? ");
        int numCar = scan.nextInt();

        ArrayList<Car> userList = new ArrayList<Car>();

        for (int i = 0; i < numCar; i++) {
            System.out.print("\nEnter Car # " + (i + 1) + " Make: ");
            String make = scan.next();
            System.out.print("Enter Car # " + (i + 1) + " Model: ");
            String model = scan.next();
            System.out.print("Enter Car # " + (i + 1) + " Year: ");
            int year = scan.nextInt();
            System.out.print("Enter Car # " + (i + 1) + " Price: ");
            double price = scan.nextDouble();

            Car u = new Car(make, model, year, price);
            userList.add(u);
        }
        System.out.print("\nCurrent Inventory: ");
        System.out.println("\nMake\tModel\tYear\tPrice");

        for (Car u : userList) {
            System.out.print(u);

        }
    }
}