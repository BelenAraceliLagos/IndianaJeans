package tienda.indianajeans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductoServicio {

    ArrayList<Object> listaProductos = new ArrayList<>();

    public ProductoServicio(){
    }

    public ProductoServicio(ArrayList listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Producto agregarProductos(){

        System.out.println("Ingrese el nombre del producto: ");
        Scanner a = new Scanner(System.in);
        String articulo = a.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        Scanner p = new Scanner(System.in);
        String precio = p.nextLine();

        System.out.println("Ingrese la descripcion del producto: ");
        Scanner d = new Scanner(System.in);
        String descripcion = d.nextLine();

        System.out.println("Ingrese el codigo del producto: ");
        Scanner c = new Scanner(System.in);
        String codigo = c.nextLine();

        System.out.println("Ingrese la talla del producto: ");
        Scanner t = new Scanner(System.in);
        String talla = t.nextLine();

        System.out.println("Ingrese la marca del producto: ");
        Scanner m = new Scanner(System.in);
        String marca = m.nextLine();

        System.out.println("Ingrese el color del producto: ");
        Scanner co = new Scanner(System.in);
        String color = co.nextLine();

        Producto nuevoProducto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
        listaProductos.add(nuevoProducto);

        System.out.println("Producto agregado correctamente!");

        return nuevoProducto;
    }

    public void listarProductos(){

        Iterator<Object> it = listaProductos.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
