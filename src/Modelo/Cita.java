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
public class Cita {
    String id_medico;
    String id_paciente;
    String fecha;
    String hora;
    int precio;
    char completada;
   

    public Cita(String id_medico, String id_paciente, String fecha, String hora, int precio, char completada) {
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.completada = completada;
    }    
    
    public String getId_medico() {
        return id_medico;
    }

    public void setId_medico(String id_medico) {
        this.id_medico = id_medico;
    }

    public String getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }   

    public char getCompletada() {
        return completada;
    }   
}
