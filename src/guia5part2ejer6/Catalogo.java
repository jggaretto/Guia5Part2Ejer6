
package guia5part2ejer6;

import java.util.ArrayList;


class Catalogo {
    private ArrayList<Producto> productos;

    public Catalogo() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public int getCantidadProductosCategoria(String categoria) {
        int cantidad = 0;
        for (Producto producto : productos) {
            if (producto.getClass().getSimpleName().equals(categoria)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public void listarProductosCategoria(String categoria) {
        System.out.println("Productos de la categoría " + categoria + ":");
        for (Producto producto : productos) {
            if (producto.getClass().getSimpleName().equals(categoria)) {
                System.out.println(producto);
            }
        }
    }
}