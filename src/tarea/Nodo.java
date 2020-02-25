
package tarea;


public class Nodo {
    private Nodo siguiente;
    private final Object dato;

    public Nodo(Nodo siguiente, Object dato) {
        this.siguiente = siguiente;
        this.dato = dato;
    }

    Nodo(Object articulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Nodo verSiguiente (){
        return this.siguiente;
    }
    void agragar (Nodo n ){
      this.siguiente = n ;
        
    }
    Object verDato(){
        return this.dato;
    }
}
