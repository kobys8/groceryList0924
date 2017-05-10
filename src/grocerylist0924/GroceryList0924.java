/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerylist0924;

/**
 *
 * @author kms080
 */
import java.util.Scanner;
public class GroceryList0924 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //groceryListA7();
        double itemPrice1, itemPrice2, itemPrice3, itemPrice4, itemPrice5;
        int itemQuantity1, itemQuantity2, itemQuantity3, itemQuantity4, itemQuantity5;
        double total;
        System.out.println("\nPlease enter the price of the oranges: ");
        itemPrice1 = in.nextDouble();
        System.out.println("Please enter the quantity of the oranges: ");
        itemQuantity1 = in.nextInt();
        ListItem newItem1 = new ListItem(itemPrice1, itemQuantity1, 1);
        System.out.println("Please enter the price of the bananas: ");
        itemPrice2 = in.nextDouble();
        System.out.println("Please enter the quantity of the bananas: ");
        itemQuantity2 = in.nextInt();
        ListItem newItem2 = new ListItem(itemPrice2, itemQuantity2, 2);
        System.out.println("Please enter the price of the flamingos: ");
        itemPrice3 = in.nextDouble();
        System.out.println("Please enter the quantity of the flamingos: ");
        itemQuantity3 = in.nextInt();
        ListItem newItem3 = new ListItem(itemPrice3, itemQuantity3, 3);
        System.out.println("Please enter the price of the tigers: ");
        itemPrice4 = in.nextDouble();
        System.out.println("Please enter the quantity of the tigers: ");
        itemQuantity4 = in.nextInt();
        ListItem newItem4 = new ListItem(itemPrice4, itemQuantity4, 4);
        System.out.println("Please enter the price of the tennis balls: ");
        itemPrice5 = in.nextDouble();
        System.out.println("Please enter the quantity of the tennis balls: ");
        itemQuantity5 = in.nextInt();
        ListItem newItem5 = new ListItem(itemPrice5, itemQuantity5, 5);
        System.out.println("The totals for the items:\n");
        System.out.printf("%-10s %-10s %-10s", "Item:", "Cost:", "Total:");
        total = newItem1.returnTotalCost();
        System.out.printf("%-10s %-15.2f %-13.2f", "\n#1", itemPrice1, total);
        total = newItem2.returnTotalCost();
        System.out.printf("%-10s %-15.2f %-13.2f", "\n#2", itemPrice2, total);
        total = newItem3.returnTotalCost();
        System.out.printf("%-10s %-15.2f %-13.2f", "\n#3", itemPrice3, total);
        total = newItem4.returnTotalCost();
        System.out.printf("%-10s %-15.2f %-13.2f", "\n#4", itemPrice4, total);
        total = newItem5.returnTotalCost();
        System.out.printf("%-10s %-15.2f %-13.2f", "\n#5", itemPrice5, total);
        
    }
    public static void groceryListA7() {
        Scanner in = new Scanner(System.in);
        double price1;
        double price2;
        double price3;
        double price4;
        double price5;
        System.out.println("Please enter the price for the first item: ");
        price1 = in.nextDouble( );
        System.out.println("Please enter the price for the second item: ");
        price2 = in.nextDouble( );
        System.out.println("Please enter the price for the third item: ");
        price3 = in.nextDouble( );
        System.out.println("Please enter the price for the fourth item: ");
        price4 = in.nextDouble( );
        System.out.println("Please enter the price for the fifth item: ");
        price5 = in.nextDouble( );
        double total = price1;
        System.out.printf("%-10s %-10s %-10s", "Item:", "Cost:", "Total:");
        System.out.printf("%-10s %-10.2f %-10.2f", "\n#1", price1, total);
        total += price2;
        System.out.printf("%-10s %-10.2f %-10.2f", "\n#2", price2, total);
        total += price3;
        System.out.printf("%-10s %-10.2f %-10.2f", "\n#3", price3, total);
        total += price4;
        System.out.printf("%-10s %-10.2f %-10.2f", "\n#4", price4, total);
        total += price5;
        System.out.printf("%-10s %-10.2f %-10.2f", "\n#5", price5, total);
    }
}

class ListItem {
    private double itemPrice[] = new double[5];
    private int itemQuantity[] = new int[5];
    private int itemNums;
    public ListItem(double newItemPrice, int newItemQuantity, int itemNum) {
        itemNums = itemNum;
        itemPrice[itemNum-1] = newItemPrice;
        itemQuantity[itemNum-1] = newItemQuantity;
    }
    public double returnTotalCost() {
        double totalCost = itemPrice[itemNums-1] * itemQuantity[itemNums-1];
        return totalCost;
    }
}