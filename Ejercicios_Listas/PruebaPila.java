package Ejercicios_Listas;

public class PruebaPila {

    public static boolean balaceado(String str) {
        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                contador++;
            else if (str.charAt(i) == ')') {
                contador--;
            }
        }
        return contador == 0 ? true : false;
    }

    public static void main(String[] args) {
        Pila pila = new Pila();

        Nodo n1 = new Nodo(8);
        Nodo n2 = new Nodo(5);
        Nodo n3 = new Nodo(3);
        Nodo n4 = new Nodo(7);
        pila.push(n1);
        pila.push(n2);
        pila.push(n3);
        pila.push(n4);
        System.out.println(pila.imprimir());
        // pila.imprimir();
        // System.out.println("\nPeek: " + pila.peek());
        // pila.pop();
        // pila.imprimir();
        // System.out.println("\nPeek: " + pila.peek());
        System.out.println(balaceado("((9-1)(1-9))"));
    }

}
