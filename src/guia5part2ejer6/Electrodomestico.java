
package guia5part2ejer6;


class Electrodomestico extends Producto {
    private int consumoEnW;

    public Electrodomestico(String codigo, String descripcion, String marca, double precioLista, int stock, int consumoEnW) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.consumoEnW = consumoEnW;
    }

    public int getConsumoEnW() {
        return consumoEnW;
    }

    @Override
    public double calcularPrecioPublico() {
        return getPrecioLista() * 1.25;
    }

    @Override
    public String toString() {
        return super.toString() + ", Consumo en W: " + consumoEnW;
    }
}
