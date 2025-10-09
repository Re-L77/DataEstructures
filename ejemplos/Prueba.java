package ejemplos;

public class Prueba {
    public static void main(String[] args) {
        Producto inventario[] = new Producto[4];
        Producto pr1 = new Producto(100, "gansito marinela", 20.00, 50);
        Producto pr2 = new Producto(101, "coca colq 600 ml", 22.00, 100);
        Producto pr3 = new Producto();
        Producto pr4 = new Producto(102, "takis morado", 29.50, 30);
        inventario[0] = pr1;
        inventario[1] = pr2;
        inventario[2] = pr3;
        inventario[3] = pr4;
        double suma = 0;
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(inventario[i]);
            suma+=inventario[i].precio;
        }
        System.out.println("Precio promedio: " + suma / inventario.length);
    }
}
