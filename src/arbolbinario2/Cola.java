
package arbolbinario2;

public class Cola{
    NodoCola primero;
    NodoCola ultimo;
    int tamanio;
    
    public Cola(){
        primero = null;
        ultimo = null;
        tamanio = 0;
    }
    
    public int push( int dato){
        NodoCola nuevo = new NodoCola(dato);
        if(tamanio==0){
            primero = nuevo;}
        else{
            ultimo.setSiguiente(nuevo);           
        }
        ultimo = nuevo;
        tamanio++;
        return dato;
    }
    
    public boolean vacia(){
        if(this.primero != null){
            return true;
        }
        System.out.println("La cola está vacía");
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
    
    public int size(){
        return tamanio;
    }
    
    public void imprimirDatos(){
        NodoCola temp = primero;
        while(temp!= null){
            System.out.println("[" + temp.dato + "]");
            temp = temp.siguiente;
        }
    }
    
}
