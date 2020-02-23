
package tarea;

import java.util.ArrayList;
import java.util.Scanner;


public class Lista implements Articulo {
private int precio = 0;
private String marca = null;
private String calibre = null;
private int cantidad = 0;

    private static void add(String elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
ArrayList<Lista> prouctos;
public void  agregarElemento(){
             Scanner imprimir = new Scanner (System.in);
             String elemento = null;
            System.out.println("ingrese elemento");
            elemento = imprimir.next();
            
            Lista.add(elemento);
        }
public void eliminarElemento(){
}
    public void insertarElemento(){
        
    }
    public void modificarElemento(){
        
    }
    
      public void buscarElemento(){
             Scanner imprimir = new Scanner (System.in);
              String elemento = null;
              int indice;
              System.out.println("buscar elemento");
               elemento = imprimir.next();
             //  indice = imprimir.indexOf(elemento)
      }
            public void mostarElemento(){
      }
        
  
    
 
    @Override
    public void medicina() { 
        System.out.println("medicina");
        
        
    }

    @Override
    public void armas() { 
        
    }

    @Override
    public void electrodomesticos() { 
        
    }

    @Override
    public void ropa() { 
    
    }

    
   
  
   
  
}
