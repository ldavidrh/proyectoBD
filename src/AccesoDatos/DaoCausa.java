/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Causa;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;/**
 *
 * @author juandavid
 */
public class DaoCausa {
    FachadaBD fachada;

    public DaoCausa() {
        fachada = new FachadaBD();
    }

    public String guardarCausa(Causa causa) {
        String sql_guardar;
        sql_guardar = "INSERT INTO causa VALUES('" + causa.getCodigo_causa() + "', '" + causa.getNombre() + "', '" + causa.getDescripcion() + "');";

        try {
            Connection conexion = fachada.getConnetion();
            Statement sentencia = conexion.createStatement();
            if (sentencia.executeUpdate(sql_guardar)==1) {
                return "Causa guardada exitosamente";
            } else {
                return "No se pudo guardar la causa";
            }
        } catch (SQLException ex) {
            return "Ya existe una causa con el codigo "+causa.getCodigo_causa();
        }catch(Exception ex){ 
            System.out.println(ex); 
            return "Ha ocurrido un error al crear la causa";
        }
    }
    
    
    
    
    public String[] consultarCausa(String codigo_causa) {
        String sql_consultar;
        String[] consulta = new String[3];

        sql_consultar = "SELECT * FROM causa WHERE codigo_causa = '" + codigo_causa + "';";

        try {
            Connection conexion = fachada.getConnetion();
            Statement sentencia = conexion.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_consultar);

            if (tabla.next()) {
                consulta[0] = tabla.getString(1);
                consulta[1] = tabla.getString(2);
                consulta[2] = tabla.getString(3);
            } else {
                consulta = null;
            }
            return consulta;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }

    }

    public String eliminarCausa(String codigo_causa) {
        String sql_eliminar;
        sql_eliminar = "DELETE FROM causa WHERE codigo_causa = '" + codigo_causa + "';";

        try {
            Connection conexion = fachada.getConnetion();
            Statement sentencia = conexion.createStatement();
            if (sentencia.executeUpdate(sql_eliminar)==1) {
                return "Causa eliminada existosa";
            } else {
                return "No existe una causa con el numero: " + codigo_causa;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgenda.class.getName()).log(Level.SEVERE, null, ex);
            return "Error al eliminar causa";
        }
    }

    public String modificarCausa(Causa causa) {
        String sql_modificar;
        sql_modificar = "UPDATE causa SET nombre ='" + causa.getNombre() + "', descripcion ='"
                + causa.getDescripcion() + "' WHERE codigo_causa = '" + causa.getCodigo_causa() + "';";
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if (sentencia.executeUpdate(sql_modificar)==1) {
                return "Causa modificada exitosamente";
            } else {
                return "No existe una causa con ese numero";
            }
        } catch (Exception ex) {
            System.out.println(ex);
            return "Ha ocurrido un error al modificar la causa";
        }

    }
    
    public String obtenerCodigo(String nombre){
        String sql_consultar;
        String codigo_causa = "";
        sql_consultar = "SELECT * FROM causa WHERE nombre = '" + nombre + "';";

        try {
            Connection conexion = fachada.getConnetion();
            Statement sentencia = conexion.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_consultar);
            if(tabla.next()){
                codigo_causa = (String)tabla.getString(1);
            }
            System.out.println(codigo_causa);
            return codigo_causa;
            
        
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }
    
    public ArrayList consultarCausas() {
        String sql_select;
        ArrayList causas = new ArrayList();
        sql_select = "SELECT codigo_causa, nombre FROM causa";
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);           
            
            while (tabla.next()) {
                causas.add(tabla.getString(1) + " - " + tabla.getString(2));
            }
            return causas;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

   

    public void cerrarConexionBD() {
        fachada.closeConection(fachada.getConnetion());
    }
    
}
