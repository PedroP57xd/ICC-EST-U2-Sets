package Controller;

import java.util.Set;
import java.util.TreeSet;

import Models.Contacto;
import utils.ContactoComparador;
import utils.ContactoComparadorHash;
import utils.ContactoComparadorTelefono;

public class ContactoController {
    public ContactoController() {
        runTreeContacto();
        runTreeContactoNumeros();
        runTreeContactoHash();
    }

    public void runTreeContacto() {
        ContactoComparador comparador = new ContactoComparador();
        Set<Contacto> agenda = new TreeSet<>(comparador);
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("==========TreeSet con Comparador==========");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
        System.out.println(" ");

    }
    public void runTreeContactoNumeros() {
        ContactoComparadorTelefono comparador = new ContactoComparadorTelefono();
        Set<Contacto> agenda = new TreeSet<>(comparador);
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("==========TreeSet con Comparador de Telefonos==========");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
        System.out.println(" ");

    }
    public void runTreeContactoHash() {
        ContactoComparadorHash comparador = new ContactoComparadorHash();
        Set<Contacto> agenda = new TreeSet<>(comparador);
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("==========TreeSet con Comparador de HashCode==========");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
        System.out.println(" ");

    }

}
