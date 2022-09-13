public class Node {
  private Object element;
  private Node next;
  private Node prior;

  Node(Object element) {
    this.element = element;
    this.next = null;
    this.prior = null;
  }

  public Object getElement() {
    return element;
  }

  public void setElement(Object element) {
    this.element = element;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getPrior() {
    return prior;
  }

  public void setPrior(Node prior) {
    this.prior = prior;
  }

}
