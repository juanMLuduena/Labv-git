public class Nodo<T> {

    T elemento;
    Nodo<T> siguiente;

    public Nodo(T elemento, Nodo<T> siguiente ) {

        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public Nodo(T elemento) {
        this.elemento = elemento;
    }


    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
