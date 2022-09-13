import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean teste = true;
        System.out.println("Insert the size of the array");
        Pile myPile = new Pile(input.nextInt());

        while (teste == true) {
            System.out.println("1) Push red pile \n2) Push black pile"
                    + "\n3) Pop red pile \n4) Pop black pile "
                    + "\n5) Top red pile \n6) Top black pile "
                    + "\n7) Show array" + "\n8) End program");
            switch (input.nextInt()) {
                case 1:
                    try {
                        myPile.pushV();
                    } catch (Exception e) {
                        System.out.println("Pile is full!");
                        myPile.dobrarArrayV(myPile.getArray());
                    }
                    break;
                case 2:
                    try {
                        myPile.pushP();
                    } catch (Exception e) {
                        System.out.println("Pile is full!");
                        myPile.dobrarArrayP(myPile.getArray());
                    }
                    break;
                case 3:
                    try {
                        myPile.popV();
                    } catch (Exception e) {
                        System.out.println("Pile is empty!");
                    }
                    break;
                case 4:
                    try {
                        myPile.popP();
                    } catch (Exception e) {
                        System.out.println("Pile is empty!");
                    }
                    break;
                case 5:
                    myPile.topV();
                    break;
                case 6:
                    myPile.topP();
                    break;
                case 7:
                    myPile.printArray();
                    break;
                case 8:
                    teste = false;
                    break;
                case 9:
                    System.out.println(myPile.getArray().length);
                    break;
            }

        }
    }
}
