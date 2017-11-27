/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;
import java.sql.*;
import Modelo.Area;
/**
 *
 * @author User
 */
public class DaoArea {
    FachadaBD fachada;
    
    public DaoArea(){
        fachada = new FachadaBD();
    }
    
    public String guardarArea(Area a){
        String sql_guardar;
        sql_guardar = "INSERT INTO area VALUES('" + a.getCodigo_area() + "', '" +
                      a.getNombre() + "', '" + a.getDescripcion() + "')";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();             
            if(sentencia.executeUpdate(sql_guardar)==1){
                return "Área creada correctamente";
            }else{
                return "Error: No se insertó el área";
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return "Ya existe un área con ese código";
        }
        catch(Exception e){ 
            System.out.println(e); 
            return "Ha ocurrido un error al crear el área";
        }        
    }
    
    public String[] consultarArea(String codigo){
        String sql_select;  
        String consulta[] = new String[3];
        sql_select = "SELECT * FROM area WHERE codigo_area = '" + codigo + "'";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);            
            if(tabla.next()){
                consulta[0] = tabla.getString(1);
                consulta[1] = tabla.getString(2);
                consulta[2] = tabla.getString(3);              
            }else{
                consulta = null;
            }
            return consulta;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public String modificarArea(Area a){
        String sql_modificar;
        sql_modificar = "UPDATE area SET nombre ='" + a.getNombre() + "', descripcion ='" +
                        a.getDescripcion()+ "' WHERE codigo_area = '" + a.getCodigo_area()+ "'";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Área modificada exitosamente";
            }else{
                return "No existe un área con ese código";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar el área";
        }
    }
    
    public String eliminarArea(String codigo){
        String sql_delete;
        sql_delete = "DELETE FROM area WHERE codigo_area = '" + codigo + "'";
        
        try{
            Connection conn= fachada.getConnetion();       
            Statement sentencia = conn.createStatement();            
            if(sentencia.executeUpdate(sql_delete)==1){
                return "Área eliminada exitosamente";
            }else{
                return "No se eliminó el área";
            }                
        }catch(Exception e){
            System.out.println(e);
            return "Ocurrió un problema al eliminar el área";
        }                             
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }    
}
