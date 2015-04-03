/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alfredo
 */
public class Archivos {
    
    private static String nombreArchivo = "Seguridad";
    
    public static void guardarArchivo(ArrayList<Empresa> empresas){
        FileOutputStream fout = null;
        ObjectOutputStream out = null;
        try {
            fout = new FileOutputStream(nombreArchivo);
            out = new ObjectOutputStream(fout);
            out.writeObject(empresas);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        if(out  != null){
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
         } 
}
    }
    
    public static ArrayList<Empresa> cargarArchivo(){
        ObjectInputStream objectinputstream = null;
        FileInputStream streamIn = null;
        ArrayList<Empresa> empresas = new ArrayList<>();
        File f = new File(nombreArchivo);
        if(!f.exists()) return null;
        try {
            streamIn = new FileInputStream(nombreArchivo);
            objectinputstream = new ObjectInputStream(streamIn);
            empresas = (ArrayList<Empresa>) objectinputstream.readObject();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {
        if(objectinputstream != null){
            try {
                objectinputstream .close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
         } 
 }
        return empresas;
    }
}
