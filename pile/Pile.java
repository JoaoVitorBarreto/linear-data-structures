import java.util.Scanner;

public class Pile {
  private Object[] array;
  private int tam, pilhaV, pilhaP;
  private int contV = 0, contP = 0;
  Scanner input = new Scanner(System.in);

  Pile(int tam) {
    this.tam = tam;
    this.array = new Object[tam];
    this.pilhaV = -1;
    this.pilhaP = this.array.length;
  }

  public Object[] getArray() {
    return array;
  }

  public void setArray(Object[] array) {
    this.array = array;
  }

  public int getTam() {
    return tam;
  }

  public void setTam(int tam) {
    this.tam = tam;
  }

  public int getPilhaV() {
    return pilhaV;
  }

  public void setPilhaV(int vermelha) {
    this.pilhaV = vermelha;
  }

  public int getPilhaP() {
    return pilhaP;
  }

  public void setPilhaPreta(int preta) {
    this.pilhaP = preta;
  }

  public int getContV() {
    return contV;
  }

  public void setContV(int contV) {
    this.contV = contV;
  }

  public int getContP() {
    return contP;
  }

  public void setContP(int contP) {
    this.contP = contP;
  }

  public Scanner getInput() {
    return input;
  }

  public void setInput(Scanner input) {
    this.input = input;
  }

  public void pushV() throws Exception {
    if (((this.pilhaV + 1) == this.pilhaP) || ((this.pilhaV + 1) == this.array.length)) {
      throw new Exception("Pile is full!");
    } else {
      System.out.println("Insert element");
      this.pilhaV++;
      this.array[this.pilhaV] = input.nextInt();
      this.contV++;
    }
  }

  public void pushP() throws Exception {
    if ((this.pilhaP - 1) == this.pilhaV) {
      throw new Exception("Pile is full!");
    } else {
      System.out.println("Insert element");
      this.pilhaP--;
      this.array[this.pilhaP] = input.nextInt();
      this.contP++;
    }
  }

  public void popV() throws Exception {
    if (this.pilhaV == -1) {
      throw new Exception("Pile is empty!");
    } else {
      System.out.println("Element to be removed: " + this.array[this.pilhaV]);
      this.array[this.pilhaV] = null;
      this.pilhaV--;
      this.contV--;
    }
  }

  public void popP() throws Exception {
    if (this.pilhaV == this.tam) {
      throw new Exception("Pile is empty!");
    } else {
      System.out.println("Element to be removed: " + this.array[this.pilhaP]);
      this.array[this.pilhaP] = null;
      this.pilhaP++;
      this.contP--;
    }
  }

  public void topV() {
    if (this.pilhaV == -1) {
      System.out.println("Pile is empty!");
    } else {
      System.out.println("Element at the top of the pile: "
          + this.array[this.pilhaV]);
    }
  }

  public void topP() {
    if (this.pilhaP == this.tam) {
      System.out.println("Pile is empty!");
    } else {
      System.out.println("Element at the top of the black pile: "
          + this.array[this.pilhaP]);
    }
  }

  public void dobrarArrayV(Object[] array) {
    Object[] array2 = new Object[this.tam * 2];
    int novoT = this.tam * 2;
    for (int v = 0; v < this.contV; v++) {
      array2[v] = array[v];
    }

    for (int p = novoT, i = 0; i < this.contP; i++) {
      p--;
      this.tam--;
      array2[p] = array[this.tam];
    }

    this.tam = novoT;
    this.array = array2;
    this.pilhaP = this.tam - this.contP;
    this.pilhaV++;
    System.out.println("Array was duplicated, insert new element: ");
    this.array[this.pilhaV] = input.nextInt();
    this.contV++;
  }

  public void dobrarArrayP(Object[] array) {
    Object[] array2 = new Object[this.tam * 2];
    int novoT = this.tam * 2;
    for (int v = 0; v < this.contV; v++) {
      array2[v] = array[v];
    }

    for (int p = novoT, i = 0; i < this.contP; i++) {
      p--;
      this.tam--;
      array2[p] = array[this.tam];
    }

    this.tam = novoT;
    this.array = array2;
    this.pilhaP = this.tam - this.contP;
    this.pilhaP--;
    System.out.println("Array was duplicated, insert new element: ");
    this.array[this.pilhaP] = input.nextInt();
    this.contP++;
  }

  public void printArray() {
    System.out.println("-------------------------");
    for (int i = 0; i < this.tam; i++) {
      System.out.println(this.array[i] + " ");
    }
    System.out.println("-------------------------");
  }

}
