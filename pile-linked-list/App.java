import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean teste = true;
        Pile myPile = new Pile();
        int pu;

        while (teste == true) {
            System.out.println("1) Push \n2) Pop"
                    + "\n3) Top \n4) Show pile"
                    + "\n5) End program");

            switch (input.nextInt()) {
                case 1:
                    System.out.println("Insert an integer ");
                    pu = input.nextInt();
                    myPile.push(pu);
                    break;
                case 2:
                    try {
                        System.out.println(myPile.pop());
                    } catch (Exception e) {
                        System.out.println("Empty pile!");
                    }
                    break;
                case 3:
                    try {
                        System.out.println(myPile.top());
                    } catch (Exception e) {
                        System.out.println("Empty pile!");
                    }
                    break;
                case 4:
                    myPile.print();
                    break;
                case 5:
                    teste = false;
                    break;
            }

        }

    }
}
