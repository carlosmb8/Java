package com.bosonit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {

        File doc = new File("C:\\Users\\carlos.martos\\IdeaProjects\\Java\\1.1-stream-process-file\\src\\main\\java\\com\\bosonit\\gente.txt");
        BufferedReader obj = new BufferedReader(new FileReader(doc));

        String fila;
        List<Persona> listapersonas = new ArrayList<>();

        while ((fila = obj.readLine()) != null) {

            String nombre=fila.split(":")[0];
            String poblacion=fila.split(":")[1];
            Integer edad=(fila.split(":")).length>2?Integer.parseInt(fila.split(":")[2]):0;

            Persona p = new Persona(nombre, poblacion, edad);
            listapersonas.add(p);
        }

        listapersonas.stream().filter( pe -> pe.getEdad()<25)
                    .forEach(pe -> System.out.println("Nombre: "+pe.getNombre()+", Pobalción: "+pe.getPoblacion()+", Edad: "+pe.getEdad()));
    }
}