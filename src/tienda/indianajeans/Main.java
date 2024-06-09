package tienda.indianajeans;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ProductoServicio nuevoProducto = new ProductoServicio();

        ExportadorTxt txt = new ExportadorTxt();

        Menu menu = new Menu();
        menu.mostrarMenu(nuevoProducto, txt);

    }
}