/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.herencia_ejemplo_2;

/**
 *
 * @author larapresa
 */
/**
 * EJEMPLO DE CÓMO FUNCIONAN LOS CONSTRUCTORES CON LA HERENCIA 
 * 
 * Vamos a observar un ejemplo muy sencillo para ver cómo se va llamando 
 * a los métodos constructores de las clases de las que se hereda.
 * 
 * Recuerda: Cuando se crea un objeto de una subclase, primero se ejecuta el método constructor 
 * de la superclase y, cuando éste finaliza, se ejecuta el método constructor de la subclase.
 * 
 * Si en el constructor de la clase hija no llamamos explícitamente al constructor de la clase padre,
 * mediante super() en Java, entonces el compilador llama automáticamente al constructor por defecto 
 * (es decir, sin argumentos) de la clase padre.
 * 
 * En este ejemplo BASE1 es la superclase, DERIVA1 hereda de BASE1, DERIVA2 hereda de DERIVA1 
 * y por lo tanto también de BASE1 (jerarquía de clases)
 */
public class Herencia_ejemplo_2 {

    public static void main(String[] args) {
        System.out.println("\n\n1Declaración de un objeto del tipo BASE1");
        Base1 ob1;
        System.out.println("\n\nINSTANCIACIÓN de un objeto del tipo BASE1");
        ob1 = new Base1();
        System.out.println("\n\nDeclaración de un objeto del tipo DERIVA1");
        Deriva1 ob2;
        System.out.println("\n\nINSTANCIACIÓN de un objeto del tipo DERIVA1");
        ob2 = new Deriva1();

        System.out.println("\n\nDeclaración de un objeto del tipo DERIVA2");
        Deriva2 ob3;
        System.out.println("\n\nINSTANCIACIÓN de un objeto del tipo DERIVA2");
        ob3 = new Deriva2();

        System.out.println("\n\n\nFINALIZACIÓN DEL PROCESO");
    }
}
