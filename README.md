# JAVA_Herencia_Ejemplo2
##Ejemplo sobre cómo funcionan los constructores y la herencia

Vamos a observar un ejemplo muy sencillo para ver cómo se va llamando 
a los métodos constructores de las clases de las que se hereda.
  
 **Recuerda:** Cuando se crea un objeto de una subclase, primero se ejecuta el método constructor de la superclase y, cuando éste finaliza, se ejecuta el método constructor de la subclase.
 
 Si en el constructor de la clase hija no llamamos explícitamente al constructor de la clase padre, mediante super() en Java, entonces el compilador llama automáticamente al constructor por defecto (es decir, sin argumentos) de la clase padre.
 
 En este ejemplo:
 - BASE1 es la superclase.
 - DERIVA1 hereda de BASE1.
 - DERIVA2 hereda de DERIVA1 y por lo tanto también de BASE1 (jerarquía de clases)
