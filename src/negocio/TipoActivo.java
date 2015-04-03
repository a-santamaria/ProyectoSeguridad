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
 * indica el tipo de activos basado en
 * el capítulo 2 del libro “Catálogo de elementos” 
 * de la metodología Magerit. 
 */
public enum TipoActivo implements Serializable{
    Tipo(null),
        Datos_Personales(Tipo),
            Personales_Alto(Datos_Personales),
            Personales_Medio(Datos_Personales),
            Personales_Bajo(Datos_Personales),
        Nivel_Clasificado(Tipo),
            Confidencial(Nivel_Clasificado),
            Difusion_Limitada(Nivel_Clasificado),
            Sin_Clasificar(Nivel_Clasificado),
            Publico(Nivel_Clasificado),        
        Informacion(Tipo),
            Arquitectura_Sistema(Informacion),
                Punto_de_Servicio(Arquitectura_Sistema),
                Punto_de_Interconexion(Arquitectura_Sistema),
                Proporcionado_por_Terceros(Arquitectura_Sistema),
            Dato_Informacion(Informacion),
                Ficheros(Dato_Informacion),
                Copias(Dato_Informacion),
                Configuracion(Dato_Informacion),
                Gestion_Interna(Dato_Informacion),
                Credenciales(Dato_Informacion),
                Validacion(Dato_Informacion),
                Contro_Acceso(Dato_Informacion),
                Registro_Actividad(Dato_Informacion),
                Codigo_Fuente(Dato_Informacion),
                Ejecualbe(Dato_Informacion),
                Datos_Prueba(Dato_Informacion),
            Clave_Criptografica(Informacion),
                Protecion_Informacion(Clave_Criptografica),
                    Clave_Cifra(Protecion_Informacion),
                        Secreto_Compartido_Cifra(Clave_Cifra),
                        Clave_Publica_Cifra(Clave_Cifra),
                        Clave_Privada_Decifreado(Clave_Cifra),
                    Clave_Firma(Protecion_Informacion),
                        Secreto_Compartido_Firma(Clave_Firma),
                        Clave_Publica_Firma(Clave_Cifra),
                        Clave_Privada_Firma(Clave_Cifra),
                Protecion_Comunicacion(Clave_Criptografica),
                    Clave_Cifra_Canal(Protecion_Comunicacion),
                    Clave_Autienticacion(Protecion_Comunicacion),
                    Clave_Verificacion(Protecion_Comunicacion),
                Cifrado_Soporte_Informacion(Clave_Criptografica),
                Cifrado_Clave_Publica(Clave_Criptografica),
        Servicio(Tipo),
            Anonimo(Servicio),
            Al_Publico(Servicio),
            Al_Usuario(Servicio),
            Interno(Servicio),
            World_Wide_Web(Servicio),
            Acceso_Remoto(Servicio),
            Correo(Servicio),
            Almacenamiento(Servicio),
            Transferencia(Servicio),
            Intercambio_Datos(Servicio),
            Directorio(Servicio),
            Gestion_Identidades(Servicio),
            Gestion_Privilegios(Servicio),
            Infraestructura_Clave_Publica(Servicio),
        Aplicacion(Tipo),
            Desarrollo_Propipo(Aplicacion),
            Desarrollo_A_Medida(Aplicacion),
            Estandar(Aplicacion),
                Navegador(Aplicacion),
                Servidor(Aplicacion),
                Cliente_Correo(Aplicacion),
                Servidor_Correo(Aplicacion),
                Servidor_Ficheros(Aplicacion),
                Gestion_Bases_Datos(Aplicacion),
                Monitor_Transaccional(Aplicacion),
                Ofimatica(Aplicacion),
                AntiVirus(Aplicacion),
                Sistema_Operativo(Aplicacion),
                Servidor_Terminales(Aplicacion),
                Sistema_Backup(Aplicacion),
        Red(Tipo),   
        Hardware(Tipo),
            Equipo_Grande(Hardware),
            Equipo_Mediano(Hardware),
            Equipo_Personal(Hardware),
            Equipo_Movil(Hardware),
            Equipo_Virtual(Hardware),
            Equipo_Respaldo(Hardware),
            Periferico(Hardware),
                Impresora(Periferico),
                Escaner(Periferico),
                Dispositivo_Criptografico(Periferico),
            Dispositivo_Frontera(Hardware),
            Soporte_Red(Hardware),
                Modem(Soporte_Red),
                Hub(Soporte_Red),
                Switch(Soporte_Red),
                Router(Soporte_Red),
                Bridge(Soporte_Red),
                Firewall(Soporte_Red),
                WAP(Soporte_Red),
            Central_Telefonica(Hardware),
            Telefono_IP(Hardware),
        Soporte_Info(Tipo),
            Electronicos(Soporte_Info),
                Discos(Electronicos),
                DiscosVirtuales(Electronicos),
                Almacenamiento_Red(Electronicos),
                CD_ROM(Electronicos),
                DVD(Electronicos),
                USB(Electronicos),
                Tarjeta_Inteligente(Electronicos),
             No_Electronicos(Soporte_Info),
                Material_Impreso(No_Electronicos),
                Microfilm(No_Electronicos),
                Tarjeta_Perforada(No_Electronicos),
        Equipamento_Aux(Tipo),
            Fuentes(Equipamento_Aux),
            Generadores(Equipamento_Aux),
            Equipo_Climatizacion(Equipamento_Aux),
            Cableado(Equipamento_Aux),
            Robot(Equipamento_Aux),
            Supply(Equipamento_Aux),
            Destroy(Equipamento_Aux),
            Mobiliario(Equipamento_Aux),
            Caja_Fuerte(Equipamento_Aux),
        Instalacion(Tipo),
            Recinto(Instalacion),
            Edificio(Instalacion),
            Cuarto(Instalacion),
            Plataforma_Movil(Instalacion),
            Canaliazacion(Instalacion),
            Respalto(Instalacion),
        Personal(Tipo),
            Ususario_Externo(Personal),
            Ususario_Interno(Personal),
            Operador(Personal),
            Admin_Sistema(Personal),
            Admin_Comunicacion(Personal),
            Admin_BBDD(Personal),
            Admin_Seguridad(Personal),
            Desarrollador(Personal),
            Desarrollador_Seguridad(Personal),
            Subcontratas(Personal),
            Proveedor(Personal),
        
    ;
    /**
     * padre del tipo
     */
    private TipoActivo parent = null;
    private ArrayList<TipoActivo> children;
    
    /**
     * constructor de tipo de activo
     * indica el padre para tener una relacion jerarquica
     * 
     * @param parent pader del tipo de activo
     */
    
    private TipoActivo(TipoActivo parent) {
        this.parent = parent;
        if(parent != null)
            this.parent.children.add(this);
        this.children = new ArrayList<>();
    }
    
    public TipoActivo getParent(){
        return parent;
    }
    
    public boolean isLeaf(){
        return children.size() == 0;
    }
    
    public int getChildCount(){
        return children.size();
    }
    
    public TipoActivo getChildAt(int index){
        return children.get(index);
    }
    
    public int getIndexOfChild(TipoActivo child){
        return children.indexOf(child);
    }
}
