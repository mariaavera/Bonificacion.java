package app;

import java.util.ArrayList;
import model.Persona;
    public class App {
        public static void main(String[] args) {
            ArrayList<Persona> lista = new ArrayList<>();
            lista.add(new Persona("Maria", (byte)17, "101"));
            lista.add(new Persona("Ana", (byte)25, "102"));
            lista.add(new Persona("Alex", (byte)46, "103"));
            lista.add(new Persona("Oscar", (byte)32, "104"));
            lista.add(new Persona("Bruno", (byte)28, "106"));
            lista.add(new Persona("Lucia", (byte)22, "107"));
            lista.add(new Persona("Pedro", (byte)30, "108"));
            lista.add(new Persona("Zoe", (byte)19, "109"));
            lista.add(new Persona("Diego", (byte)26, "110"));

            Persona.ordenarPorNombre(lista);

            System.out.println("Lista ordenada por nombre:");
            for (Persona p : lista) {
                System.out.println(p);
            }
        }
    }


