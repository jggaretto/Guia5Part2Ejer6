
package guia5part2ejer6;

class Ropa extends Producto {
    private String tipoDeTela;

    public Ropa(String codigo, String descripcion, String marca, double precioLista, int stock, String tipoDeTela) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tipoDeTela = tipoDeTela;
    }

    public String getTipoDeTela() {
        return tipoDeTela;
    }

    @Override
    public double calcularPrecioPublico() {
        return getPrecioLista() * 1.4;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de tela: " + tipoDeTela;
    }
}