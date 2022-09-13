import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean test = true;
        Deck myDeck = new Deck();
        int number;

        while (test == true) {
            System.out.println("1) Insert at the start"
                    + "\n2) Insert at the end"
                    + "\n3) Remove from the start"
                    + "\n4) Remove from the end"
                    + "\n5) Show first"
                    + "\n6) Show last"
                    + "\n7) Show deck"
                    + "\n8) End program");

            switch (input.nextInt()) {
                case 1:
                    System.out.println("Insert an integer ");
                    number = input.nextInt();
                    myDeck.insertStart(number);
                    break;
                case 2:
                    System.out.println("Insira um inteiro ");
                    number = input.nextInt();
                    myDeck.insertEnd(number);
                    break;
                case 3:
                    try {
                        System.out.println(myDeck.removeStart());
                    } catch (Exception e) {
                        System.out.println("Empty deck!");
                    }
                    break;
                case 4:
                    try {
                        System.out.println(myDeck.removeEnd());
                    } catch (Exception e) {
                        System.out.println("Empty deck!");
                    }
                    break;
                case 5:
                    try {
                        System.out.println(myDeck.first());
                    } catch (Exception e) {
                        System.out.println("Empty deck!");
                    }
                    break;
                case 6:
                    try {
                        System.out.println(myDeck.last());
                    } catch (Exception e) {
                        System.out.println("Empty deck!");
                    }
                    break;
                case 7:
                    myDeck.print();
                    break;
                case 8:
                    test = false;
                    break;
            }

        }
    }
}
