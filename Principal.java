
package Calificaciones.Principal;

/**
 *
 * @author kaivo
 */
public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        char nota = ' ';
        
        Metodos obj=new Metodos();
        obj.ingresaNombre();
        obj.calPromedio();
        obj.Imprime();
        nota = obj.notaFinal();
        
    }
    
    
    
}
