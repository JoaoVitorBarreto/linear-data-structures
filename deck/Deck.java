public class Deck {
  private Node start;
  private Node end;

  Deck() {
    this.start = null;
    this.end = null;
  }

  public Node getStart() {
    return start;
  }

  public void setStart(Node start) {
    this.start = start;
  }

  public Node getEnd() {
    return end;
  }

  public void setEnd(Node end) {
    this.end = end;
  }

  public void insertStart(int x) {
    Node newNode = new Node(x);
    if (this.start == null) {
      newNode.setNext(this.end);
      this.start = newNode;
      this.end = newNode;
    } else {
      newNode.setNext(this.start);
      this.start = newNode;
    }
  }

  public void insertEnd(int x) {
    Node newNode = new Node(x);
    if (this.end == null) {
      newNode.setNext(this.end);
      this.start = newNode;
      this.end = newNode;
    } else {
      newNode.setPrior(this.end);
      this.end.setNext(newNode);
      this.end = newNode;
    }
  }

  public Object removeStart() throws Exception {
    if (this.start.getElement() == null) {
      throw new Exception("Empty deck!");
    } else {
      Object y = this.start.getElement();
      Node copy = this.start;
      this.start = copy.getNext();
      this.start.setPrior(null);
      copy.setNext(null);
      return y;
    }
  }

  public Object removeEnd() throws Exception {
    if (this.end.getElement() == null) {
      throw new Exception("Empty deck!");
    } else {
      Object y = this.end.getElement();
      Node copy = this.end;
      this.end = copy.getPrior();
      this.end.setNext(null);
      copy.setPrior(null);
      return y;
    }
  }

  public Object first() throws Exception {
    if (this.start.getElement() == null) {
      throw new Exception("Empty deck!");
    } else
      return this.start.getElement();
  }

  public Object last() throws Exception {
    if (this.end.getElement() == null) {
      throw new Exception("Empty deck!");
    }
    return this.end.getElement();
  }

  public void print() {
    Node x = this.start;
    System.out.println("-------------------");
    while (x != null) {
      System.out.println(x.getElement());
      x = x.getNext();
    }
    System.out.println("-------------------");
  }
}