/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author juandavid
 */
public class Asiste {
    String id_persona;
    String codigo_campana;
    char descuento;

    public Asiste(String id_persona, String codigo_campana, char descuento) {
        this.id_persona = id_persona;
        this.codigo_campana = codigo_campana;
        this.descuento = descuento;
    }
    
    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getCodigo_campana() {
        return codigo_campana;
    }

    public void setCodigo_campana(String codigo_campana) {
        this.codigo_campana = codigo_campana;
    }

    public char getDescuento() {
        return descuento;
    }

    public void setDescuento(char descuento) {
        this.descuento = descuento;
    }    
}
