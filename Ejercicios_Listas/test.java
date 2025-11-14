package Ejercicios_Listas;

public class test {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Nodo n1 = new Nodo("8");
        Nodo n2 = new Nodo("9");
        Nodo n3 = new Nodo("4");
        Nodo n4 = new Nodo("5");
        // Nodo n5 = new Nodo(10);
        // Nodo n6 = new Nodo(11);
        lista.insertar(n3);
        lista.insertar(n2);
        lista.insertar(n1);
        lista.insertar(n4);
        lista.clonar2();
        // lista.clonar();
        lista.imprimir();
        // lista.insertar(n4);
        // lista.imprimir();
        // lista.insertarFinal(n5);
        // lista.imprimir();
        // lista.insertarFinal(n6);
        // lista.imprimir();
    }
}
