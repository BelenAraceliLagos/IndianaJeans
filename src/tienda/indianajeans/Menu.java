package tienda.indianajeans;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public void mostrarMenu(ProductoServicio nuevoProducto, ExportadorTxt txt) throws IOException {

        int opcion = 0;
        do {

            System.out.println("Ingrese una opcion: \n" +
                    "....................\n" +
                    "1) Listar Productos\n" +
                    "2) Agregar Producto\n" +
                    "3) Exportar Productos\n" +
                    "4) Salir");

            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    nuevoProducto.listarProductos();
                    break;
                case 2:
                    nuevoProducto.agregarProductos();
                    break;
                case 3:
                    txt.exportar(nuevoProducto.getListaProductos());
                    break;
                case 4:
                    System.out.println("Ha salido del programa.");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!");

            }
        }
            while (opcion != 4) ;

    }
}



