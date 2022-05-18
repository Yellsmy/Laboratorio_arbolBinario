
package arbolbinario2;

public class Pila {
    NodoPila cima;
    int tamanio;
    public Pila(){
        cima = null;
        tamanio = 0;
    }
    
    public int push( int dato){ //Método para Ingresar datos a la pila A
        NodoPila nuevo = new NodoPila(dato);
        nuevo.siguienteA = cima;
        cima = nuevo;
        tamanio++;
        return dato;
    }
    
    public boolean vacia(){ //Método para saber si la pila A está vacía
        return cima == null;
    }
    
    public void imprimirPilaA(){ //Método para mostrar datos de la pila A
        NodoPila temp = cima;
        System.out.println("LA PILA INGRESADA ES: ");
        while(temp!= null){
            System.out.print(temp.dato+ ",");        
            temp = temp.siguienteA;
        }
    }
}
