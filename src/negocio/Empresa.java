/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author alfredo
 */
public class Empresa implements Serializable{
    private String nombre;
    private ArrayList<Activo> activos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.activos = new ArrayList<>();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Activo> getActivos() {
        return activos;
    }
    
    public void addActivo(Activo nuevo){
        activos.add(nuevo);
    }
}
