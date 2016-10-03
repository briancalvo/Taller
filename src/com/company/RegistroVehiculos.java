package com.company;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Brian on 03/10/2016.
 */
public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();
    
    public void registrarVehiculo(Coche coche){
        coches.add(coche);
    }
    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public  Optional<Coche> obtenerVehiculo(String matricula){
        return coches.stream().filter(coche -> coche.getMatricula().equals(matricula)).findFirst();
    }
    public void eliminarVehiculo(String matricula){
        Coche aux = null;
        for (Coche cocheActual : coches){
            if (cocheActual.getMatricula().equals(matricula)){
                aux = cocheActual;
                break;
            }
        }
        if (aux!=null)coches.remove(aux);
    }
    public Optional<Coche> obtenerVehiculoPrecioMax(){
        return coches.stream().max(Comparator.comparing(Coche::getPrecio));
    }
    public List<Coche> obtenerVehiculosMarca(String marca){
        List<Coche> aux = new ArrayList<>();
        for (Coche cocheActual : coches){
            if(cocheActual.getMarca().equals(marca)){
                aux.add(cocheActual);
                break;
            }
        }
        return aux;
    }
    public List<Coche> obtenerTodos(){
        List<Coche> aux = new ArrayList<>();
        for (Coche cocheActual : coches){
            aux.add(cocheActual);
        }
        return aux;
    }
}
