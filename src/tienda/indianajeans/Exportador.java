package tienda.indianajeans;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Exportador {

    public abstract void exportar();

    public abstract void exportar(ArrayList<Producto> productos) throws IOException;
}
