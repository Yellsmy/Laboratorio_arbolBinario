
package arbolbinario2;


public class NodoCola {
    int dato;
    NodoCola siguiente;
    NodoCola primero;
    
    public NodoCola(int dato){
        this.dato = dato;
        siguiente = null;
        primero = null;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
}
