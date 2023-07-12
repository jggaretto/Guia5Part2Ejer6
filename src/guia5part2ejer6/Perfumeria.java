
package guia5part2ejer6;


class Perfumeria extends Producto {
    private int tamañoEnCC;

    public Perfumeria(String codigo, String descripcion, String marca, double precioLista, int stock, int tamañoEnCC) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tamañoEnCC = tamañoEnCC;
    }

    public int getTamañoEnCC() {
        return tamañoEnCC;
    }

    @Override
    public double calcularPrecioPublico() {
        int incrementoPorCada100CC = tamañoEnCC / 100;
        return getPrecioLista() * (1 + (incrementoPorCada100CC * 0.2));
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamaño en CC: " + tamañoEnCC;
    }
}