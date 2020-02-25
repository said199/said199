
package tarea;


public class Lista implements Articulo {

    
 private Nodo cabeza;
 private int tamano;
 
     Lista (){
         cabeza  = null;
         tamano = 0;
         
        }
      void agregarDelante(Object articulo){
          if ( cabeza == null){
              cabeza = new Nodo (articulo );
              
          }
         
           else{
             Nodo temp = cabeza ;
             Nodo nuevo = new Nodo(articulo);
                  nuevo.agragar(temp);
                  cabeza = nuevo;
                          
                 }
          tamano ++;
          
              }
        Object ver (int indice ){
            
              Nodo temp = cabeza ;
              for (int i = 0 ; i<indice; i++){
                  temp = temp.verSiguiente();
              
          }
              return temp.verDato();
            } 

    @Override
    public void medicina() {
        System.out.println("asetaminofen");
        
    }

    @Override
    public void armas() {
        
        System.out.println("calibre 50");
         }

    @Override
    public void electrodomesticos() {
      
        System.out.println("refrigeradora");
    }
    
      }

