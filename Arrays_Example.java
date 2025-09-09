public class Arrays_Example {
    static void imprimir(int a[]) {
        System.out.println("Foreach");
        for (int i : a) {
            System.out.print(i + "-");
        }
        System.out.println();
        System.out.println("For");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "-");
        }
        System.out.println();
    }

    static double obtenerPromedio(int a[]) {
        double total = 0;
        for (int i : a) {
            total += i;
        }
        return total / a.length;
    }

    public static void main(String[] args) {
        int edades[] = { 19, 21, 20, 21, 24, 23 };
        imprimir(edades);
        System.out.println("Obtener promedio");
        System.out.println(obtenerPromedio(edades));
    }
}
