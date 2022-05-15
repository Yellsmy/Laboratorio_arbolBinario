
package arbolbinario2;

public class Arbol {
    NodoArbol1 raiz;
    NodoArbol2 raiz2;
    
    public Arbol(){
        this.raiz = null;
        this.raiz2 = null;
    }
     //insertar un nodo al primer árbol
    public void addNodo(int dato){
        NodoArbol1 nuevo = new NodoArbol1(dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            NodoArbol1 aux = raiz;
            NodoArbol1 padre;
            while(true){
                padre=aux;
                if(dato<aux.dato1){
                    //va a la izquierda
                    aux= aux.hijoIzquierdo1;
                    if(aux==null){
                        padre.hijoIzquierdo1 = nuevo;
                        return;
                    }
                }else{
                    //va a la derecha
                    aux = aux.hijoDerecho1;
                    if(aux == null){
                        padre.hijoDerecho1 = nuevo;
                        return;
                    }
                }
            }
        }       
    }
    
    //insertar un nodo en el segundo árbol
    public void addNodo2(int dato2){
        NodoArbol2 nuevo2 = new NodoArbol2(dato2);
        if(raiz2 == null){
            raiz2 = nuevo2;
        }else{
            NodoArbol2 aux2 = raiz2;
            NodoArbol2 padre2;
            while(true){
                padre2=aux2;
                if(dato2<aux2.dato2){
                    //va a la izquierda
                    aux2= aux2.hijoIzquierdo2;
                    if(aux2==null){
                        padre2.hijoIzquierdo2 = nuevo2;
                        return;
                    }
                }else{
                    //va a la derecha
                    aux2 = aux2.hijoDerecho2;
                    if(aux2 == null){
                        padre2.hijoDerecho2 = nuevo2;
                        return;
                    }
                }
            }
        }       
    }
    
    //Método para saber si el árbol está vacío
    public boolean vacio(){
        if( raiz == null){
            System.out.println("El árbol está vacío");
            return true;
        }else{
            return false;
        }           
    }
    
    //Método para mostrar los datos en PreOrden del primer árbol
    public void ImprimirPreOrden(NodoArbol1 r){
        System.out.print(" "+r.dato1);     //Mostramos posición actual
        if(r.hijoIzquierdo1 != null){   //Entra a la posición izquierda del árbol siempre que no sea null
            ImprimirPreOrden(r.hijoIzquierdo1);}  //Volvemos a llamar a la función hasta que la posición izquierda sea null
        if(r.hijoDerecho1 != null){ //Entramos a la posición derecha siempre que sea diferente de null, si es null continua con el resto del código 
            ImprimirPreOrden(r.hijoDerecho1); //Si tiene posición derecha se llama a la función nuevamente hasta que la posición derecha sea null
        }                 
    }
    
    //Método para mostrar los datos InOrden del primer árbol
    public void ImprimirInOrden(NodoArbol1 r){
        if(r.hijoIzquierdo1 != null){   //Entra a la posición izquierda del árbol siempre que no sea null
            ImprimirInOrden(r.hijoIzquierdo1);}  //Volvemos a llamar a la función hasta que la posición izquierda sea null
        System.out.print(" "+r.dato1);     //Mostramos posición actual
        if(r.hijoDerecho1 != null){ //Entramos a la posición derecha siempre que sea diferente de null, si es null continua con el resto del código 
            ImprimirInOrden(r.hijoDerecho1); //Si tiene posición derecha se llama a la función nuevamente hasta que la posición derecha sea null
        }         
    }
    
    //Método para mostrar los datos InOrden del segundo árbol
    public void ImprimirInOrden2(NodoArbol2 r2){
        if(r2.hijoIzquierdo2 != null){   //Entra a la posición izquierda del árbol siempre que no sea null
            ImprimirInOrden2(r2.hijoIzquierdo2);}  //Volvemos a llamar a la función hasta que la posición izquierda sea null
        System.out.print(" "+r2.dato2);     //Mostramos posición actual
        if(r2.hijoDerecho2 != null){ //Entramos a la posición derecha siempre que sea diferente de null, si es null continua con el resto del código 
            ImprimirInOrden2(r2.hijoDerecho2); //Si tiene posición derecha se llama a la función nuevamente hasta que la posición derecha sea null
        }         
    }
    
    //Método para mostrar los datos en PostOrden del primer árbol
    public void ImprimirPostOrden(NodoArbol1 r){
        if(r.hijoIzquierdo1 != null){   //Entra a la posición izquierda del árbol siempre que no sea null
            ImprimirPostOrden(r.hijoIzquierdo1);}  //Volvemos a llamar a la función (recursividad) hasta que la posición izquierda sea null
        if(r.hijoDerecho1 != null){ //Entramos a la posición derecha siempre que sea diferente de null, si es null continua con el resto del código 
            ImprimirPostOrden(r.hijoDerecho1); //Si tiene posición derecha se llama a la función nuevamente hasta que la posición derecha sea null
        }
        System.out.print(" "+r.dato1);     //Mostramos posición actual
    }
    
    //Método para mostrar la altura del primer árbol
    public int alturaArbol(NodoArbol1 r){     
        if(r != null){
            return 1 + Math.max(alturaArbol(r.hijoIzquierdo1), alturaArbol(r.hijoDerecho1)); //Compara ambos lados y saca el máximo, a eso se le suma 1 que es el nivel donde está la raíz   
       }   
        return -1;         
    }
    
    //Método para mostrar la altura del segundo árbol
    public int alturaArbol2(NodoArbol2 r2){     
        if(r2 != null){
            return 1 + Math.max(alturaArbol2(r2.hijoIzquierdo2), alturaArbol2(r2.hijoDerecho2)); //Compara ambos lados y saca el máximo, a eso se le suma 1 que es el nivel donde está la raíz   
       }   
        return -1;         
    }
    
    //Método para buscar un dato dentro del primer árbol
    public int Buscar(int dato){
        NodoArbol1 temp = raiz;
        while(temp.dato1 != dato){ //Siempre que el dato buscado no sea igual al dato en el árbol, entonces que lo busque
            if( dato < temp.dato1){ // si el dato buscado es menor que la raiz es porque el dato buscado está del lado izquierdo
                temp = temp.hijoIzquierdo1;
            }else{ //sino es menor a la raiz es porque es mayor, por lo que estará del lado derecho
                temp = temp.hijoDerecho1;
            }
            if(temp == null){  //si el nodo llega a null y no ha encontrado el dato buscado, que retorne 0           
                return 0;}                
        }
        return temp.dato1; // cuando salga del while es porque encontró el dato, por lo tanto que retorne el dato encontrado    
    }
    
    
    //Método para eliminar un dato   
    public NodoArbol1 eliminarNodo( NodoArbol1 nodo, int dato){
        if(nodo != null){ 
            if(dato == nodo.dato1){ 
                if(nodo.hijoIzquierdo1 == null && nodo.hijoDerecho1 == null){ // si el nodo a eliminar no tiene hijos nodo va apuntar a null
                    return nodo= null;
                }else{
                    //Si el nodo a eliminar solo tiene un hijo
                    if (nodo.hijoIzquierdo1 == null && nodo.hijoDerecho1 != null){ // si el nodo a eliminar no tiene hijo izquierdo, se debe retornar el derecho
                        return nodo = nodo.hijoDerecho1;
                    }else{
                        if(nodo.hijoIzquierdo1 != null && nodo.hijoDerecho1 == null){ // si el nodo a eliminar no tiene hijo derecho, se debe retornar el izquierdo
                            return nodo= nodo.hijoIzquierdo1;
                        }else{
                            if(nodo.hijoIzquierdo1 != null && nodo.hijoDerecho1 != null){ // si el nodo a eliminar tiene 2 hijos, entonces 
                                NodoArbol1 derecho = nodo.hijoDerecho1;
                                NodoArbol1 temp = sucesor(derecho); // Llamamos al método auxiliar y le pasamos el nodo derecho como argumento
                                
                                temp.hijoIzquierdo1 = nodo.hijoIzquierdo1; //A temp. izquierdo se añade todos los nodos izquierdos para no perderlos
                                return temp;
                            }
                        }
                    }
                }
            }
            if( dato < nodo.dato1){ //Si el dato buscado es menor, que lo busque del lado izquierdo
                nodo.hijoIzquierdo1 = eliminarNodo(nodo.hijoIzquierdo1, dato);
               
            }else{ //sino está en el lado izquierdo, que lo busque en el derecho
                nodo.hijoDerecho1 = eliminarNodo(nodo.hijoDerecho1, dato);
            }
        }
        System.out.println("eliminación exitosa");
        return nodo;
    }
    
    //Método auxiliar para eliminar
    public NodoArbol1 sucesor( NodoArbol1 nodo){ //Tomará el menor de los mayores 
        if( nodo.hijoIzquierdo1 != null){  //Si existe un nodo menor al que fue pasado como argumento, entonces buscará el menor y lo retornará
            return sucesor(nodo.hijoIzquierdo1);
        }
        return nodo; // Si no entra a la condición anterior, retornará el mismo nodo pasado como argumento ya que no existe un nodo menor
    }
    
    //Método que devuelve el nodo reemplazo 
    public NodoArbol1 obtenerNodoReemplazo(NodoArbol1 NodoRemp){
        NodoArbol1 reemplazarAnterior = NodoRemp;
        NodoArbol1 reemplazo = NodoRemp;
        NodoArbol1 auxiliar = NodoRemp.hijoDerecho1;
        while(auxiliar != null){
            reemplazarAnterior = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoIzquierdo1;
        }
        if(reemplazo != NodoRemp.hijoDerecho1){
            reemplazarAnterior.hijoIzquierdo1 = reemplazo.hijoDerecho1;
            reemplazo.hijoDerecho1 = NodoRemp.hijoDerecho1;
        }
        System.out.println("El nodo reemplazo es: "+ reemplazo);
        return reemplazo;
    }
    
    //Método para calcular el número de elementos que hay en el primer árbol
    public int nElementos(NodoArbol1 r){
        int cont = 1; //El contador inicia en 1 porque inicia contando la raíz
        if(r.hijoIzquierdo1 != null){  
            cont += nElementos(r.hijoIzquierdo1);
        }
        if(r.hijoDerecho1 != null){
            cont += nElementos(r.hijoDerecho1);
        }
        return cont;
    }
    
    //Método para calcular el número de elementos que hay en el segundo árbol
    public int nElementos2(NodoArbol2 r2){
        int cont = 1; //El contador inicia en 1 porque inicia contando la raíz
        if(r2.hijoIzquierdo2 != null){  
            cont += nElementos2(r2.hijoIzquierdo2);
        }
        if(r2.hijoDerecho2 != null){
            cont += nElementos2(r2.hijoDerecho2);
        }
        return cont;
    }
    
    //Método para vaciar los árboles
    public void vaciar(){
        raiz.hijoDerecho1 = raiz.hijoIzquierdo1 = null;
        raiz = null;
        raiz2.hijoDerecho2 = raiz2.hijoIzquierdo2 = null;
        raiz2 = null;
    }
    
    //Método para saber si los datos de árbol 1 y árbol 2 son iguales
    public boolean comparar(boolean bandera, NodoArbol1 r1, NodoArbol2 r2){
        boolean acceso = bandera;
        if(r1 == null && r2 == null){
            return true;
        }
        else{
            acceso = true;
            if(r1.dato1!= r2.dato2){
                return false;
            }
        }
        return comparar(acceso,r1.hijoIzquierdo1, r2.hijoIzquierdo2)&& comparar(acceso,r1.hijoDerecho1, r2.hijoDerecho2);               
    }
    
    //Método para comparar la estructura y datos de árbol 1 y árbol 2
    public boolean acceso(NodoArbol1 r1, NodoArbol2 r2){
        boolean bandera = false;
        if(alturaArbol(r1) == alturaArbol2(r2)){
            if(nElementos(r1) == nElementos2(r2)){
                bandera = comparar(false, r1, r2);
            }
        }
        return bandera;
    }
    
    //Método para saber si el árbol binario está completo
    /*public boolean completo1(NodoArbol1 r){
        boolean a = false;
        NodoArbol1 temp = r;
        NodoArbol1 temp2 = null;
        System.out.println("INICIO");
        if( r == null){
            System.out.println("es null");
            return true;
        }
        else if(r.hijoIzquierdo1 != null){
            System.out.println("no es null");           
            if( r.hijoIzquierdo1 == null && r.hijoDerecho1 != null || r.hijoIzquierdo1 != null && r.hijoDerecho1 == null){
                System.out.println("dentro del if si es incompleto");
                return false;
            }
            else{
                System.out.println("dentro del else");
                return completo(r.hijoIzquierdo1) && completo(r.hijoDerecho1);
            }
            
        }return a;    
    }
    
    //Método para recorrer el árbol por niveles
    public boolean ordenTransversal(NodoArbol1 r1){
        NodoArbol1 temp = r1;
        NodoArbol1 temp2 = null;
        if( r1 == null) return true;
        Cola cola = new Cola();
        cola.push(temp.dato1);
        while(cola.vacia() != false){
            temp = cola.pop();
            
        }
    }*/
    
    
}
