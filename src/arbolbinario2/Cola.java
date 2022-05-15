
package arbolbinario2;

public class Cola {
    private NodoCola primero;
    private NodoCola ultimo;
    int tamanio;
    
    public Cola(){
        primero = null;
        ultimo = null;
        tamanio = 0;
    }
    
    public void push( int dato){
        NodoCola nuevo = new NodoCola(dato);
        if(tamanio==0){
            primero = nuevo;}
        else{
            ultimo.setSiguiente(nuevo);
            
        }
        ultimo = nuevo;
        tamanio++;
    }
    
    public boolean vacia(){
        if(this.primero != null){
            return true;
        }
        System.out.println("La lista está vacía");
        return false;
    }
    
    public int pop(){
        int aux = primero.dato;
        primero = primero.siguiente;
        tamanio--;
        if(tamanio==0){
            ultimo = null;}
        return aux;
    }
    
}
