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

    public String peek() {
        if (tamanio == 0) {
            System.err.println("No hay elementos.");
            return null;
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

    public String imprimir() {
        String cad = "";
        if (tamanio == 0) {
            System.out.println("Pila vacía");
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

    // public boolean esBalanceado(String s) {
    // if (s == null)
    // return true;

    // for (int i = 0; i < s.length(); i++) {
    // char c = s.charAt(i);
    // if (c == '(') {
    // this.push(new Nodo(String.valueOf(c)));
    // } else if (c == ')') {
    // if (this.isEmpty()) {
    // return false;
    // }
    // this.pop();
    // }
    // }

    // return this.isEmpty();
    // }

}