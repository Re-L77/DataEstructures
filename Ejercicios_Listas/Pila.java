package Ejercicios_Listas;

public class Pila {
    Nodo primero;
    Nodo ultimo;
    int tamanio;

    Pila() {
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

    public void push(Nodo nodo) {
        if (tamanio == 0)
            primero = ultimo = nodo;
        else {
            ultimo.sig = nodo;
            ultimo = nodo;
        }
        tamanio++;
    }

    public int peek() {
        if (tamanio == 0) {
            System.err.println("No hay elementos.");
            return -1;
        }
        return ultimo.dato;
    }

    public void pop() {
        if (tamanio == 0) {
            System.err.println("No hay nada que eliminar");
        } else {
            int indice = 1;
            Nodo temp = primero;
            while (indice < tamanio - 1) {
                temp = temp.sig;
                indice++;
            }
            ultimo = temp;
            ultimo.sig = null;
            tamanio--;
        }
    }

    boolean isEmpty() {
        return tamanio == 0 ? true : false;
    }

    // public void clonar2() {
    // if (tamanio == 0)
    // System.out.println("No");
    // else {
    // Nodo temp = primero;
    // Nodo nuevo;
    // while (temp != null) {
    // nuevo = new Nodo(temp.dato);
    // nuevo.sig = temp.sig;
    // temp.sig = nuevo;
    // temp = nuevo.sig;
    // }
    // }
    // }

    // public void clonar(int veces) {
    // if (tamanio == 0) {
    // System.out.println("Lista vacía");
    // return;
    // }

    // Nodo actual = primero;

    // while (actual != null) {
    // int clones = 0;
    // // Guarda el siguiente nodo original antes de modificar los punteros
    // Nodo siguiente = actual.sig;

    // // Clona el nodo 'veces' veces
    // while (clones < veces) {
    // Nodo clon = new Nodo(actual.dato);
    // // Inserta el clon justo después del nodo actual
    // clon.sig = actual.sig;
    // actual.sig = clon;

    // // Avanza actual al clon recién insertado (para encadenar los siguientes)
    // actual = clon;

    // tamanio++;
    // clones++;
    // }

    // // Al terminar los clones, pasa al siguiente nodo original
    // actual = siguiente;
    // }
    // }

    public String imprimir() {
        String cad = "";
        if (tamanio == 0) {
            System.out.println("Lista vacía");
            return cad;
        } else {
            Nodo temp = primero;
            while (temp != null) {
                cad = "[" + String.valueOf(temp.dato) + "]\n" + cad;
                temp = temp.sig;
            }
        }
        return cad;
    }
}