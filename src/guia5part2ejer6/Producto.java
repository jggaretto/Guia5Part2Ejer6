
package guia5part2ejer6;

class Producto {
    private String codigo;
    private String descripcion;
    private String marca;
    private double precioLista;
    private int stock;

    public Producto(String codigo, String descripcion, String marca, double precioLista, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precioLista = precioLista;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double calcularPrecioPublico() {
        return precioLista;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion + ", Marca: " + marca +
                ", Precio de lista: " + precioLista + ", Stock: " + stock;
    }
}
