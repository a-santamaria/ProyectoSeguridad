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
public class Activo implements Serializable{
    /**
     * nombre del activo
     */
    private String nombre;
    /**
     * tipos del activo, pude ser mas de uno
     */
    private ArrayList<TipoActivo> tipos;
    
    /**
     * constructor Activo
     * @param nombre
     * @param tipos 
     */
    public Activo(String nombre, ArrayList<TipoActivo> tipos) {
        this.nombre = nombre;
        this.tipos = tipos;
    }
    
    public Activo() {
        this.nombre = "";
        this.tipos = new ArrayList<>();
    }
     
    public String getNombre() {
        return nombre;
    }

    public ArrayList<TipoActivo> getTipos() {
        return tipos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipos(ArrayList<TipoActivo> tipos) {
        this.tipos = tipos;
    }
    
    public void addTipo(TipoActivo nuevo){
        tipos.add(nuevo);
    }
    
    
}
