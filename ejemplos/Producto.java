package ejemplos;

public class Producto {
    int id;
    String nombre;
    double precio;
    int stock;
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Producto () {
        this.id = 9999;
        this.nombre = "Sin descripción"; 
    }

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return super.toString() + " [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
    }   
}