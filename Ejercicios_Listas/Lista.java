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

    public void clonar(int veces) {
        if (tamanio == 0) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = primero;

        while (actual != null) {
            int clones = 0;
            // Guarda el siguiente nodo original antes de modificar los punteros
            Nodo siguiente = actual.sig;

            // Clona el nodo 'veces' veces
            while (clones < veces) {
                Nodo clon = new Nodo(actual.dato);
                // Inserta el clon justo después del nodo actual
                clon.sig = actual.sig;
                actual.sig = clon;

                // Avanza actual al clon recién insertado (para encadenar los siguientes)
                actual = clon;

                tamanio++;
                clones++;
            }

            // Al terminar los clones, pasa al siguiente nodo original
            actual = siguiente;
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