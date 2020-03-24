public class Pila<T extends Comparable> {

   public Nodo<T> tope;
   public Nodo<T> base;

    public Pila() {
        tope = null;
        base = null;
    }

    public Pila(Nodo<T> tope, Nodo<T> base ) {
        this.tope = tope;
        this.base = base;
    }

    public Nodo<T> getTope() {
        return tope;
    }

    public void setTope(Nodo<T> tope) {
        this.tope = tope;
    }

    public Nodo<T> getBase() {
        return base;
    }

    public void setBase(Nodo<T> base) {
        this.base = base;
    }

    public void push(T t){
        Nodo<T> nodo= new Nodo<T>(t);
        if(tope==null){
            base=nodo;
            tope=base;
        }
        else{
            tope.setSiguiente(nodo);
            tope=nodo;
        }
    }

    public Nodo pop(){
        return tope;
    }

    public int size(){
        int i =0;
        Nodo<T> nodo= new Nodo(base.getElemento(),base.getSiguiente());


        while(nodo!=null){
            i++;
            nodo=nodo.getSiguiente();
        }
        return i;

    }




}
