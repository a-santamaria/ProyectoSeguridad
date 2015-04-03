/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author alfredo
 * indica el tipo de activos basado en
 * el capítulo 2 del libro “Catálogo de elementos” 
 * de la metodología Magerit. 
 */
public enum TipoActivo {
    Tipo(null),
        Informacion(Tipo),
            ArquitecturaSistema(Informacion),
            Dato_Informacion(Informacion),
            Clave_Criptografica(Informacion),
        Servicio(Tipo),
            Aplicacion(Servicio),
            Red(Servicio),
        Hardware(Tipo),
            SoporteInfo(Hardware),
            EquipamentoAux(Hardware),
        Instalaciones(Tipo),
            //sub
        Personal(Tipo),
            //sub
        
    ;
    /**
     * padre del tipo
     */
    private TipoActivo parent = null;
    
    /**
     * constructor de tipo de activo
     * indica el padre para tener una relacion jerarquica
     * 
     * @param parent pader del tipo de activo
     */
    private TipoActivo(TipoActivo parent) {
        this.parent = parent;
    }
}
