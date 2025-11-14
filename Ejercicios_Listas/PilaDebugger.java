package Ejercicios_Listas;

import java.util.Scanner;

public class PilaDebugger {

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void mostrarVertical(Pila pila) {
        String salida = pila.imprimir();
        if (salida != null && !salida.isEmpty()) {
            System.out.println(salida);
        }
    }

    public static boolean esBalanceadoPasoAPaso(Pila pila, String s) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (s == null)
                return true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    pila.push(new Nodo(String.valueOf(c)));
                    clearConsole();
                    System.out.println("Paso " + (i) + ": se encontró '(' -> push ");
                    mostrarVertical(pila);
                    System.out.println("Presiona ENTER para continuar...");
                    scanner.nextLine();
                } else if (c == ')') {
                    if (pila.isEmpty()) {
                        clearConsole();
                        System.out.println("Paso " + (i) + ": se encontró ')' pero la pila está vacía -> falso");
                        return false;
                    }
                    pila.pop();
                    clearConsole();
                    System.out.println("Paso " + (i) + ": se encontró ')' -> pop");
                    mostrarVertical(pila);
                    System.out.println("Presiona ENTER para continuar...");
                    scanner.nextLine();
                }
            }
        }
        clearConsole();
        boolean resultado = pila.isEmpty();
        System.out.println("Resultado final: " + (resultado ? "balanceado" : "no balanceado"));
        // No cerramos scanner porque cerrarlo cierra System.in del proceso
        return resultado;
    }
}
