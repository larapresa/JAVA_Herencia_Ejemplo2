
package prog.herencia_ejemplo_2;

public class Deriva1 extends Base1 {

        // Constructor
        // ** Recuerda: Cuando se crea un objeto de una subclase, 
        // primero se ejecuta el método constructor de la superclase y, 
        // cuando éste finaliza, se ejecuta el método constructor de la subclase.
	public Deriva1() {
		System.out.println("\n\n\tHemos entrado en el constructor de la clase Deriva1");
	}
}
