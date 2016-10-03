package com.company;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 * Created by Brian on 03/10/2016.
 */
public class Taller {
    private Map<Persona,Coche> reparaciones =
            new TreeMap<>(Comparator.comparing(Persona::getNum_ss));

    public Coche registrarReparacion(Persona persona, Coche coche){

    }
    public Coche obtenerCoche(Persona persona){

    }
    public Set<Persona> obtenerClientes(){

    }
}
