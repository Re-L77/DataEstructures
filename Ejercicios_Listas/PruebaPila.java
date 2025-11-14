package Ejercicios_Listas;

public class PruebaPila {

    public static void main(String[] args) {
        // Pila pila = new Pila();

        // Nodo n1 = new Nodo("8");
        // Nodo n2 = new Nodo("5");
        // Nodo n3 = new Nodo("3");
        // Nodo n4 = new Nodo("7");
        // pila.push(n1);
        // pila.push(n2);
        // pila.push(n3);
        // pila.push(n4);
        // System.out.println(pila.imprimir());

        Pila prueba1 = new Pila();
        System.out.println("Ejemplo paso a paso para ((43+2)(32+1)):");
        PilaDebugger.esBalanceadoPasoAPaso(prueba1, "(()");
    }

}
