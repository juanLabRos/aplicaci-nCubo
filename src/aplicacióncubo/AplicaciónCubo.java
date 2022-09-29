/*
Clase cubo con ancho, largo y profundo tipo int
2 constructores el vacio y con 3 argumentos
1 método que se va a llamar calcular volumen (a*b*c=volmen)
 */
package aplicacióncubo;
import dominio.cubo;


/**
 *
 * @author Alumnos Mañana
 */
public class AplicaciónCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PROBLEMA CUBO");
        
        //Instancio mi cubo
        cubo cubo1 = new cubo(12, 12, 12);
        
        //Llamo al método calcular volumen
        int resultado = cubo1.calcularVolumen(cubo1.getAlto(), cubo1.getAncho()
                , cubo1.getLargo());
        
        //Imprimir por pantalla el resultado
        System.out.println("El resultado del volumen del cubo es = " + resultado);
        
        
        
    }
    
}
