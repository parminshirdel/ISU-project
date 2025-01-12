import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To parmina online shop");
        System.out.println("Please enter the category you want to Enter ");
        System.out.println("1.Clothing");
        System.out.println("2.Books");
        System.out.println("3.Shoes");
        int categoryChoiceInt = sc.nextInt();



        if (categoryChoiceInt == 1) {
            System.out.println("Welcome to Clothing");
            System.out.println("Here are the clothing items available");

            System.out.println("1. Shirt - $19.99 ( Stock : 10)");
            System.out.println("2. T-Shirt - $15.99 ( Stock : 5");
            System.out.println("3. Jacket - $49.99 ( Stock : 3");

            System.out.println("Select a product (1-3):");
            int productChoiceInt = sc.nextInt();


            System.out.println("Enter quanity you want");
            int quantity = sc.nextInt();
            int shirtStock = 10;
            int tShirtSock = 5;
            int jacketSock = 3;

            if (productChoiceInt == 1 && quantity <= shirtStock) {
                System.out.println("Added" + quantity + " shirt(s) to your cart");
                shirtStock -= quantity;
            } else if (productChoiceInt == 2 && quantity <= tShirtSock) {
                System.out.println("Added " + quantity + " T-shirt(s) to your cart");
                tShirtSock -= quantity;
            } else if (productChoiceInt == 3 && quantity <= jacketSock) {
                System.out.println("Added " + quantity + " Jacket(s) to your cart");
                jacketSock -= quantity;
            } else {
                System.out.println("Invalid product choice");
            }


            } else if (categoryChoiceInt == 2) {
            System.out.println("Welcome to Books");
            System.out.println("Here are the book items available");
            System.out.println("1. Harry Potter - $35.99");
            System.out.println("2. The midnight library - $19.99");
            System.out.println("3. You - $25.99");

            System.out.println("Select a product (1-3):");
            int productChoiceInt = sc.nextInt();

            System.out.println("Enter quanity you want");
            int quantity = sc.nextInt();
            int HarryPotter= 10;
            int midnightLibrary = 5;
            int You = 3;
            if (productChoiceInt == 1 && quantity <= HarryPotter) {
                System.out.println("Added" + quantity + " Harry Potter");
                HarryPotter -= quantity;
            } else if (productChoiceInt == 2 && quantity <= midnightLibrary) {
                System.out.println("Added " + quantity + " Midnight Library");
                midnightLibrary -= quantity;
            } else if (productChoiceInt == 3 && quantity <= You) {
                System.out.println("Added " + quantity + " You");
                You -= quantity;
            } else {
                System.out.println("Invalid product choice");
            }


        } else if (categoryChoiceInt == 3) {
            System.out.println("Welcome to Shoes");
            System.out.println("Here are the shoe items available");
            System.out.println("1. Running shoes - $79.99");
            System.out.println("2. Sneakers - $59.99");
            System.out.println("3. Hills - $35.99");

            System.out.println("Select a product (1-3):");
            int productChoiceInt = sc.nextInt();
            System.out.println("Enter quanity you want");
            int quantity = sc.nextInt();
            int RunningShoes= 10;
            int Sneakers = 5;
            int Hills = 2;
            if (productChoiceInt == 1 && quantity <= RunningShoes) {
                System.out.println("Added" + quantity + " Running Shoes");
                RunningShoes -= quantity;
            } else if (productChoiceInt == 2 && quantity <= Sneakers) {
                System.out.println("Added " + quantity + " Sneakers");
                Sneakers -= quantity;
            } else if (productChoiceInt == 3 && quantity <= Hills) {
                System.out.println("Added " + quantity + " Hills");
                Hills -= quantity;
            }
        } else {
            System.out.println("Invalid choice, please try again");
        }
        sc.close();
    }
}







        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/


