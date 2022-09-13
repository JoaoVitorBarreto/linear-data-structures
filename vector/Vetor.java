package vector;

public class Vetor {

    private Object[] array;
    private int tam, fim;

    Vetor(int tam) {
        this.tam = tam;
        this.fim = -1;
        this.array = new Object[tam];
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

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public Object elemAtRank(int x) throws Exception {
        if (x >= this.tam) {
            throw new Exception("Index out of bounds");
        } else {
            return this.array[x];
        }
    }

    public Object replaceAtRank(int x, Object o) throws Exception {
        if (x >= this.tam) {
            throw new Exception("Index out of bounds");
        } else {
            Object i = this.array[x];
            this.array[x] = o;
            return i;
        }
    }

    public void duplicar(int x, Object o) {
        Object[] novo = new Object[2 * this.tam];
        this.fim++;
        for (int i = 0, y = 0; i <= this.fim; i++) {
            if (i == x) {
                novo[i] = o;
            } else {
                novo[i] = this.array[y];
                y++;
            }
        }
        this.tam *= 2;
        this.array = novo;
    }

    public void insertAtRank(int x, Object o) {
        if (this.fim == this.tam - 1) {
            duplicar(x, o);
        } else {
            for (int i = this.fim; i > x; i--) {
                this.array[i + 1] = this.array[i];
            }
            this.array[x] = o;
            this.fim++;

        }
    }

    public Object removeAtRank(int x) throws Exception {
        if (x >= this.tam) {
            throw new Exception("Index out of bounds");
        } else {
            Object y = this.array[x];
            for (int i = x + 1; i < this.tam; i++) {
                this.array[i - 1] = this.array[i];
            }
            this.array[this.fim] = null;
            this.fim--;
            return y;
        }
    }

    public void print() {
        System.out.println("--------------------------");
        for (int i = 0; i <= this.fim; i++) {
            System.out.println(this.array[i]);
        }
        System.out.println("--------------------------");
    }

}