public class Node {
  private Object elemento;
  private Node prox;

  Node(Object elemento) {
    this.elemento = elemento;
    this.prox = null;
  }

  public Object getElemento() {
    return elemento;
  }

  public void setElemento(Object elemento) {
    this.elemento = elemento;
  }

  public Node getProx() {
    return prox;
  }

  public void setProx(Node prox) {
    this.prox = prox;
  }
}
