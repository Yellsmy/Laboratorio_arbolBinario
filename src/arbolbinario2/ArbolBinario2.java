
package arbolbinario2;

import java.util.Scanner;


public class ArbolBinario2 {
    Scanner op = new Scanner(System.in);
    Arbol ArbolB = new Arbol();
    
    public void menu(){
        boolean salir = false;
        int opcion;
        
        while(!salir){
           System.out.println("");
           System.out.println("|------------**BIENVENIDO**------------|"); 
           System.out.println("|          **ÁRBOL BINARIO**           |");
           System.out.println("|  1. Agregar datos al Árbol 1         |");
           System.out.println("|  2. Agregar datos Árbol 2            |");
           System.out.println("|  3. Mostrar árbol PreOrden           |");
           System.out.println("|  4. Mostrar árbol InOrden            |");
           System.out.println("|  5. Mostrar árbol PostOrden          |");
           System.out.println("|  6. Buscar un dato                   |");
           System.out.println("|  7. Eliminar dato                    |");
           System.out.println("|  8. Obtener la raíz                  |");
           System.out.println("|  9. Altura del árbol                 |");
           System.out.println("|  10. Número de elementos             |");
           System.out.println("|  11. Comparar Árboles                |");
           System.out.println("|  12. Vaciar Árboles                  |");
           System.out.println("|  13. Árbol binario completo          |");
           System.out.println("|  14. Mostrar en orden transversal    |");
           System.out.println("|  0. SALIR                            |");
           System.out.println("| --------Selecciona la opción-------- |");
           opcion = op.nextInt();
           op.nextLine();
           switch(opcion){
            case 1:
                System.out.println("Ingrese dato: ");
                ArbolB.addNodo(op.nextInt());
                break;
            case 2:
                System.out.println("Ingrese dato: ");
                ArbolB.addNodo2(op.nextInt());
                break; 
            case 3:
                System.out.println("--------PREORDEN---------");
                if( ArbolB.vacio()== false){
                    ArbolB.ImprimirPreOrden(ArbolB.raiz);
                }                    
                break;           
            case 4:
                System.out.println("--------INORDEN---------");
                if( ArbolB.vacio()== false){
                    ArbolB.ImprimirInOrden(ArbolB.raiz);
                }         
                break;
            case 5:
                System.out.println("--------POSTORDEN---------");
               if( ArbolB.vacio()== false){
                    ArbolB.ImprimirPostOrden(ArbolB.raiz);
                }
                break;
            case 6:
                System.out.println("Ingrese búsqueda: ");
                int busqueda = ArbolB.Buscar(op.nextInt());
                if( busqueda == 0){
                    System.out.println("El dato buscado no existe en el árbol");
                }else{
                    System.out.println("El dato " +busqueda+ " ha sido encontrado");
                }
                
                break;
            case 7:
                if( ArbolB.vacio() == false){
                    System.out.println("Ingrese dato a eliminar: ");
                    ArbolB.eliminarNodo(ArbolB.raiz,op.nextInt());
                }               
                break;
            case 8:
                System.out.println("La raíz es: "+ ArbolB.raiz.dato1);
                break;
                
            case 9:
                if(ArbolB.vacio() == false){
                    System.out.println("La altura del árbol es: "+ ArbolB.alturaArbol(ArbolB.raiz));
                }              
                break;
            case 10:
                if( ArbolB.vacio()== false){
                    System.out.println("El total de elementos dentro del árbol es: "+ ArbolB.nElementos(ArbolB.raiz));
                }      
                break;
            case 11: 
                if( ArbolB.raiz == null && ArbolB.raiz2 == null){
                    System.out.println("El árbol está vacío");
                }else{
                    if(ArbolB.acceso(ArbolB.raiz, ArbolB.raiz2) == true){
                    System.out.println("          ¡¡FELICIDADES!!          ");
                    System.out.println("           (づ｡◕‿‿◕｡)づ            ");
                    System.out.println("Los Árboles ingresados son identicos");                   
                    }
                    else{
                        System.out.println("                ( ╥﹏╥)                 ");
                        System.out.println(" Los Árboles ingresados no son identicos");
                    }
                    System.out.println("El primer árbol es:");
                    ArbolB.ImprimirInOrden(ArbolB.raiz);
                    System.out.println("");
                    System.out.println("El segundo árbol es: ");
                    ArbolB.ImprimirInOrden2(ArbolB.raiz2);                         
                    }                               
                break;
            case 12:
                ArbolB.vaciar();
                System.out.println("Los árboles están vacios");
                break;
            case 13:
                
                break;            
            case 0:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    public static void main(String[] args) {
        ArbolBinario2 objeto = new ArbolBinario2();
        objeto.menu();
    }
    
}
