import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);


                int HarryPotterStock = 20;
                int TheMidnightLibraryStock = 14;
                int YouStock = 3;

                int RunningShoesStock = 30;
                int SneakerStock = 9;
                int HillsStock = 2;


                int ShirtStock = 10;
                int TShirtStock = 12;
                int JacketStock = 7;

        double ShirtPrice = 10.99;
        double tShirtPrice = 15.99;
        double jacketPrice = 49.99;

        double HarrypotterPrice = 35.99;
        double TheMidnightLibraryPrice = 25.99;
        double YouPrice = 20.99;

        double RunningShoesPrice = 40.99;
        double SneakerPrice = 49.99;
        double HillsPrice = 35.99;


        String adminUsername = "admin";
        String adminPassword = "1386";
        boolean isAdminLoggedIn = false;

        int choice = 0;
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<String> orders = new ArrayList<>();

        while (true) {
            System.out.println("Welcome to the Parmina Online shop!");
            System.out.println("1. Products by category");
            System.out.println("2. add product to your cart");
            System.out.println("3. update cart Items");
            System.out.println("4. Remove products from cart");
            System.out.println("5. checkout");
            System.out.println("6. Admin login");
            System.out.println("7. View orders(admin)");
            System.out.println("8. Exit");


            System.out.println("Please Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            if (choice == 1) {
                System.out.println("Please enter your category: ");
                System.out.println("1. clothing");
                System.out.println("2. Books");
                System.out.println("3. Shoes");
                int categoryChoice = sc.nextInt();
                sc.nextLine();

                if (categoryChoice == 1) {
                    System.out.println("1.shirt - $ " + ShirtPrice + "(Stock: " + ShirtStock + ")");
                    System.out.println("2. T-Shirt - $ " + TShirtStock + "(Stock: " + TShirtStock + ")");
                    System.out.println("3. Jacket - $ " + JacketStock + "(Stock: " + JacketStock + ")");
                } else if (categoryChoice == 2) {
                    System.out.println("1. Harry Potter - $ " + HarrypotterPrice + "(Stock: " + HarryPotterStock + ")");
                    System.out.println("2. The Midnight Library - $ " + TheMidnightLibraryPrice + "(Stock: " + TheMidnightLibraryStock + ")");
                    System.out.println("3. You - $ " + YouPrice + "(Stock: " + YouStock + ")");
                } else if (categoryChoice == 3) {
                    System.out.println("1. Running shoes - $ " + RunningShoesPrice + "(Stock: " + RunningShoesStock + ")");
                    System.out.println("2. Sneakers - $ " + SneakerPrice + "(Stock: " + SneakerStock + ")");
                    System.out.println("3. Hills - $ " + HillsPrice + "(Stock: " + HillsStock + ")");
                } else {
                    System.out.println("Invalid choice");
                }
                System.out.println("please enter the product number to add to your cart");
                int productChoice = sc.nextInt();
                System.out.println("Enter the quantity");
                int quantity = sc.nextInt();

                boolean isAdded = false;

                    if (categoryChoice == 1) {
                        if (productChoice == 1 && quantity <= ShirtStock) {
                            cart.add("Shirt -" + quantity + "x $ " + ShirtPrice);
                            ShirtStock -= quantity;
                            isAdded = true;
                        } else if (productChoice == 2 && quantity <= TShirtStock) {
                            cart.add("T-Shirt -" + quantity + "x $ " + tShirtPrice);
                            TShirtStock -= quantity;
                            isAdded = true;
                        } else if (productChoice == 3 && quantity <= JacketStock) {
                            cart.add("Jacket - " + quantity + "x $ " + jacketPrice);
                            JacketStock -= quantity;
                            isAdded = true;
                        } else {
                            System.out.println("Invalid choice");
                        }
                    } else if (categoryChoice == 2) {
                        if (productChoice == 1 && quantity <= HarryPotterStock) {
                            cart.add("HarryPotter - " + quantity + "x $ " + HarrypotterPrice);
                            HarryPotterStock -= quantity;
                            isAdded = true;
                        } else if (productChoice == 2 && quantity <= TheMidnightLibraryStock) {
                            cart.add("The Midnight Library - " + quantity + "x $ " + TheMidnightLibraryPrice);
                            TheMidnightLibraryStock -= quantity;
                            isAdded = true;
                        } else if (productChoice == 3 && quantity <= YouStock) {
                            cart.add("You - " + quantity + "x $ " + YouPrice);
                            YouStock -= quantity;
                            isAdded = true;
                        } else {
                            System.out.println("Invalid choice");
                        }
                    } else if (categoryChoice == 3) {
                        if (productChoice == 1 && quantity <= RunningShoesStock) {
                            cart.add("Running Shoes - " + quantity + "x $ " + RunningShoesPrice);
                            RunningShoesStock -= quantity;
                            isAdded = true;
                        } else if (productChoice == 2 && quantity <= SneakerStock) {
                            cart.add("Sneakers - $ " + quantity + "x $ " + SneakerPrice);
                            SneakerStock -= quantity;
                            isAdded = true;
                        } else if (productChoice == 3 && quantity <= HillsStock * quantity) {
                            cart.add("Hills - $ " + quantity + "x $ " + HillsPrice);
                            HillsStock -= quantity;
                            isAdded = true;
                        }
                    }
                    if (isAdded) {
                        System.out.println("Item is added to cart");
                    } else {
                        System.out.println("Invalid choice ");
                    }

            } else if (choice == 2) {
                System.out.println("Your cart:");
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty:");
                } else {
                    for (String item : cart) {
                        System.out.println(item);
                    }
                }
                System.out.println("Do you want to add more item to your cart?");
                System.out.println("1. yes ");
                System.out.println("2. go back to menu");

                int cartAction = sc.nextInt();
                sc.nextLine();

                if (cartAction == 1) {
                    continue;
                }
            } else if (choice == 3) {
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty:");
                } else {
                    System.out.println("Your cart is:");
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println((i + 1) + " . " + cart.get(i));
                    }
                    System.out.println("Enter the number of the item you want to update");
                    int itemUpdate = sc.nextInt();
                    sc.nextLine();

                    if (itemUpdate < 1 || itemUpdate > cart.size()) {
                        System.out.println("Invalid item number");
                    } else {
                        System.out.println("Enter the new quantity");
                        int newQuantity = sc.nextInt();

                        if (newQuantity <= 0) {
                            System.out.println("Invalid quantity");
                        } else {
                            String selectedItem = cart.get(itemUpdate - 1);
                            String[] parts = selectedItem.split(" - ");
                            String itemName = parts[0].trim();
                            String quantityAndPrice = parts[1].trim();


                            String[] quantityAndPriceParts = quantityAndPrice.split(" x");
                            int oldQuantity = Integer.parseInt(quantityAndPriceParts[0].trim());
                            double itemPrice = Double.parseDouble(quantityAndPriceParts[1].trim());

                            if ( itemName.equals("Shirt") ) itemPrice = ShirtPrice;
                            else if ( itemName.equals("T-Shirt") ) itemPrice = tShirtPrice;
                            else if ( itemName.equals("Jacket") ) itemPrice = jacketPrice;
                            else if ( itemName.equals("Harry Potter") ) itemPrice = HarrypotterPrice;
                            else if ( itemName.equals("TheMidnightLibrary") ) itemPrice = TheMidnightLibraryPrice;
                            else if ( itemName.equals("You") ) itemPrice = YouPrice;
                            else if ( itemName.equals("Running Shoes") ) itemPrice = RunningShoesPrice;
                            else if ( itemName.equals("Sneakers")) itemPrice = SneakerPrice;
                            else if ( itemName.equals("Hills") ) itemPrice = HillsPrice;

                            double totalPrice = itemPrice * newQuantity;

                            cart.set(itemUpdate - 1, itemName + " - " + newQuantity + "x $ " + totalPrice);
                            System.out.println("cart updated with new Quantity and price");
                        }
                    }
                }
                System.out.println("Do you want to update another item?");
                System.out.println("1. yes ");
                System.out.println("2. go back to menu");
                int itemUpdate = sc.nextInt();
                sc.nextLine();

                if (itemUpdate == 1) {
                    continue;
                }
            }

            else if (choice == 4) {
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty.");
                } else {
                    System.out.println("Your cart is:");
                    for ( int i = 0; i < cart.size(); i++ ) {
                        System.out.println((i + 1) + " . " + cart.get(i));
                    }
                    System.out.println("Enter the number of the item you want t remove");
                    int itemRemove= sc.nextInt();
                    sc.nextLine();

                    if ( itemRemove < 1 || itemRemove > cart.size() ) {
                        System.out.println("Invalid item number");
                    } else {
                        cart.remove(itemRemove - 1);
                        System.out.println("cart removed");
                    }
                }
            }
            else if (choice == 5) {
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty.");
                } else {
                    System.out.println("checkout your cart:");
                    double totalAmount  = 0;

                    for (String item : cart) {
                        System.out.println(item);

                        String[] parts = item.split("- ");

                        if (parts.length == 2) {
                            String quantityAndPrice = parts[1];
                            String[] quantityAndPriceParts = quantityAndPrice.split(" x \\$");

                            if (quantityAndPriceParts.length == 2) {
                                int quantity = Integer.parseInt(quantityAndPriceParts[0].trim());
                                double price = Double.parseDouble(quantityAndPriceParts[1].trim());

                                totalAmount += price * quantity;

                            } else {
                                System.out.println("Invalid quantity and price " + quantityAndPrice);
                            }
                        } else {
                            System.out.println("Invalid item number" + item);
                        }
                    }
                    System.out.println("Total amount is " + totalAmount);
                    cart.clear();
                    System.out.println("cart is updated , thank you for your purchase");
                }
            }
            else if (choice == 6) {
                System.out.println("Enter the admin username");
                String username = sc.nextLine();
                System.out .println("Enter admin password");
                String password = sc.nextLine();

                if ( username.equals(adminUsername) && password.equals(adminPassword)) {
                    isAdminLoggedIn = true;
                    System.out.println("Admin logged in");
                } else {
                    System.out.println("Invalid username or password");
                }
            }
            else if (choice == 7) {
                if ( isAdminLoggedIn) {
                    if ( orders.isEmpty()) {
                        System.out.println("Your order is empty");
                    } else {
                        System.out.println("Your order is:");
                        for ( String order : orders ) {
                            System.out.println(order);
                        }
                    }
                } else {
                    System.out.println("You are not logged in as admin");
                }
            }
            else if (choice == 8) {
                System.out.println("Thank you for shopping with us!!");
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
