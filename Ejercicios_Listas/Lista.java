package Ejercicios_Listas;

public class Lista {
    Nodo primero;
    Nodo ultimo;
    int tamanio;

    Lista() {
        primero = ultimo = null;
        tamanio = 0;
    }

    public void insertar(Nodo nodo) {
        if (tamanio == 0)
            primero = ultimo = nodo;
        else {
            nodo.sig = primero;
            primero = nodo;
        }
        tamanio++;
    }

    public void insertarFinal(Nodo nodo) {
        if (tamanio == 0)
            primero = ultimo = nodo;
        else {
            ultimo.sig = nodo;
            ultimo = nodo;
        }
        tamanio++;
    }

    public void clonar(Nodo nodo) {
        if (tamanio == 0) {
        } else {

        }
    }

    public void imprimir() {
        if (tamanio == 0)
            System.out.println("Lista vacía");
        else {
            System.out.println();
            Nodo temp = primero;
            while (temp != null) {
                System.out.print(temp.dato + " -> ");
                temp = temp.sig;
            }
        }
    }
}