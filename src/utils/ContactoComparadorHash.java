package utils;

import java.util.Comparator;

import Models.Contacto;

public class ContactoComparadorHash implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {

        int resultadoHashComparacionApellido = o2.getApellido().hashCode() - o1.getApellido().hashCode();
        if (resultadoHashComparacionApellido != 0) {
            return resultadoHashComparacionApellido;
        }
        int resultadoHashComparacionNombre = o1.getNombre().hashCode() - o2.getNombre().hashCode();
        return resultadoHashComparacionNombre;
    }

}
