package model;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private byte edad;
    private String id;

    public Persona(String nombre, byte edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public String getId(){
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre + " - " + edad + " años";
    }
    //METODO BURBUJA
    public static void ordenarPorNombre(ArrayList<Persona> personas) {
        int n = personas.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Persona persona1 = personas.get(j);
                Persona persona2 = personas.get(j + 1);
                if (persona1.getNombre().compareTo(persona2.getNombre()) > 0) {
                    personas.set(j, persona2);
                    personas.set(j + 1, persona1);
                }
            }
        }
    }

}
