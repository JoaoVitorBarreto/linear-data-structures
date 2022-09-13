public class Pile {
  private Node topo;

  Pile() {
    this.topo = null;
  }

  public Node getTopo() {
    return topo;
  }

  public void setTopo(Node topo) {
    this.topo = topo;
  }

  public void push(int x) {
    Node novo = new Node(x);
    novo.setProx(this.topo);
    this.topo = novo;
  }

  public Object top() throws Exception {
    if (this.topo.getElemento() == null) {
      throw new Exception("Empty pile!");
    } else {
      return this.topo.getElemento();
    }
  }

  public Object pop() throws Exception {
    if (this.topo.getElemento() == null) {
      throw new Exception("Empty pile!");
    } else {
      Object y = this.topo.getElemento();
      Node copia = this.topo;
      this.topo = copia.getProx();
      copia.setProx(null);
      return y;
    }
  }

  public void print() {
    Node x = this.topo;
    System.out.println("------------------------");
    while (x != null) {
      System.out.println(x.getElemento());
      x = x.getProx();
    }
    System.out.println("------------------------");
  }
}
