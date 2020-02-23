
package tarea;
import java.util.ArrayList;
import java.util.Scanner;


public class Factura extends Lista {

public static void main(String[] args) {
     Lista miLista = new Lista();
    //miLista.productos = new ArrayList();
  // miLista.leerOpcion();
}

//ArrayList<Lista> ListaMedicina = new ArrayList<Lista>();
   





 public void leerOpcion(){
    Scanner imprimir = new Scanner (System.in);
    
    int opcion = 0;
    do{
        System.out.println(" precione 1 para agregar elemento");
        System.out.println(" precione 2 para eliminar  elemento");
        System.out.println(" precione 3 para insertar elemento");
        System.out.println(" precione 4 para modificar elemento");
        System.out.println(" precione 5 para buscar elemento");   
        System.out.println(" precione 6 para mostar elemento");
        System.out.println(" precione 7  para salir");
              
              opcion = imprimir.nextInt();
              
              switch (opcion){
                  case 1:
                      agregarElemento();
                      break;
                      
                  case 2:
                      eliminarElemento();
                  
                  case 3:    
                      insertarElemento();
                       break;
                  case 4:
                      modificarElemento();
                       break;
                  case 5:
                       buscarElemento();
                       break;
                  case 6:     
                       mostarElemento();
                       break;
   
        
        
        
    }        
    } while(opcion != 7 );
            
       
    }
}
      

