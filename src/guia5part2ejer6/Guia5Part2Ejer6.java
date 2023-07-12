/*
La tienda RopaLinda SA, nos contrata para que armemos una aplicación que permita crear un
Catálogo con los distintos productos que ofrecerá a sus clientes. La tienda posee 3 tipos de tipos
de productos: Ropa, Electrodomesticos y Perfumeria. Todos los Productos tiene código,
descripción, marca, precioLista y stock; la Ropa además posee como atributo: tipoDeTela; los
Electrodomesticos poseen como atributo adicional: consumoEnW y los productos de Perfumería:
tamañoEnCC (Tamaño en centímetros cúbicos). Todos los productos tienen un método
calcularPrecioPublico, pero que cada tipo de producto implementará de la siguiente forma:
Los Electrodomésticos incrementarán un 25% el precioLista.
La Ropa incrementará un 40% el precioLista.
Los artículos de Perfumeria incrementarán un 20% por cada 100cc.

El Catalogo deberá permitir:
a) Agregar productos
b) Informar la cantidad de productos que posee de cada categoría: Ropa, Perfumería y
Electrodomésticos.
c) Listar los productos que son Electrodomesticos.
d) Listar los productos que son Ropa.
e) Listar los productos que son de Perfumería.
Luego desde el main, desde una clase Test se pide:

 Instanciar un Catálogo.
 Crear manualmente 2 productos de cada categoría.
 Agregar los productos creados al Catálogo.
 Solicitar al Catálogo la cantidad de productos por categoría.
 Solicitar al Catálogo un listado de los productos de cada categoría.
Importante: Armar el modelo UML representado las clases necesarias. Implementar en java.
Haciendo uso de la herencia y polimorfismo.
 */
package guia5part2ejer6;


public class Guia5Part2Ejer6 {

   
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Ropa ropa1 = new Ropa("RO001", "Remera", "Nike", 500.0, 10, "Algodón");
        Ropa ropa2 = new Ropa("RO002", "Pantalón", "Adidas", 1000.0, 5, "Denim");

        Electrodomestico electrodomestico1 = new Electrodomestico("ED001", "Lavadora", "Samsung", 20000.0, 3, 1500);
        Electrodomestico electrodomestico2 = new Electrodomestico("ED002", "Refrigerador", "LG", 25000.0, 2, 2000);

        Perfumeria perfumeria1 = new Perfumeria("PE001", "Perfume", "Chanel", 1500.0, 8, 100);
        Perfumeria perfumeria2 = new Perfumeria("PE002", "Colonias", "Hugo Boss", 800.0, 12, 300);

        catalogo.agregarProducto(ropa1);
        catalogo.agregarProducto(ropa2);
        catalogo.agregarProducto(electrodomestico1);
        catalogo.agregarProducto(electrodomestico2);
        catalogo.agregarProducto(perfumeria1);
        catalogo.agregarProducto(perfumeria2);

        System.out.println("Cantidad de productos de cada categoría:");
        System.out.println("Ropa: " + catalogo.getCantidadProductosCategoria("Ropa"));
        System.out.println("Perfumería: " + catalogo.getCantidadProductosCategoria("Perfumeria"));
        System.out.println("Electrodomésticos: " + catalogo.getCantidadProductosCategoria("Electrodomestico"));

        System.out.println();

        catalogo.listarProductosCategoria("Ropa");
        System.out.println();

        catalogo.listarProductosCategoria("Perfumeria");
        System.out.println();

        catalogo.listarProductosCategoria("Electrodomestico");
    }
    
}
