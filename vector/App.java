package vector;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Boolean teste = true;
        System.out.println("Insert the size of the array (must be bigger than 1)");
        Vetor meuVetor = new Vetor(input.nextInt());
        Object escolha;

        while (teste == true) {
            System.out.println("1) elemAtRank \n2) replaceAtRank"
                    + "\n3) insertAtRank \n4) removeAtRank"
                    + "\n5) Print \n6) End program");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Insert an index");
                    try {
                        System.out.println(meuVetor.elemAtRank(input.nextInt()));
                    } catch (Exception e) {
                        System.out.println("Index out of bounds");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Insert the index and the object");
                    try {
                        System.out.println(meuVetor.replaceAtRank(input.nextInt(), input.nextInt()));
                        ;
                    } catch (Exception e) {
                        System.out.println("Index out of bounds");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Insert the index and the object");
                    meuVetor.insertAtRank(input.nextInt(), input.nextInt());
                    break;
                case 4:
                    System.out.println("Insert the index of the node to be removed");
                    escolha = meuVetor.removeAtRank(input.nextInt());
                    System.out.println(escolha);
                    break;
                case 5:
                    meuVetor.print();
                    break;
                case 6:
                    teste = false;
                    break;

            }
        }
        input.close();
    }
}