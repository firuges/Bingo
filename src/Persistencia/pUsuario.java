/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Common.Enums;
import Common.cAdmin;
import Common.cDatosException;
import Common.cJugador;
import Common.cUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxi
 */
public class pUsuario extends pPersistencia {
    @Override
      public void agregar(java.lang.Object o) throws Exception {
        cUsuario unUser = (cUsuario)o;
        if(unUser.getTipoUser().equals(Enums.Gerarquia.ADMIN)){
            try {
                cAdmin unAdmin = (cAdmin)o;
                agregarAdmin(unAdmin);
            } catch (Exception ex) {
                throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregar():" + ex.getMessage());
               
            }
        }else{
            cJugador unJugador = (cJugador)o;
            agregarJugador(unJugador);
        }
    }
      private boolean agregarAdmin(cAdmin pAdmin) throws Exception{
          try{
            
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
               String insertSql="INSERT INTO usuarios(nombre,apellido,email,password,tipouser,fecha)" +
               "VALUES(" + pAdmin.getNombre() + " ,'" + pAdmin.getApellido()+ " ,'" + pAdmin.getEmail()+ " ,'" + pAdmin.getPassword()
                       + " ,'" + pAdmin.getTipoUser()+ " ,'" + pAdmin.getFecha()+ "')";
                // esto es solo para mostrar el sql que se va a ejecutar
               System.out.println(insertSql);
               // ejecuta la sentencia
               st.executeUpdate(insertSql);
               super.cerrarConexion();
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregarAdmin():" + ex.getMessage());
          
        }
         return true;
      }
      
      private boolean agregarJugador(cJugador pJugador) throws Exception{
         try{
            
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
               String insertSql="INSERT INTO usarios(nombre,apellido,email,password,tipouser,fecha)" +
               "VALUES(" + pJugador.getNombre() + " ,'" + pJugador.getApellido()+ " ,'" + pJugador.getEmail()+ " ,'" + pJugador.getPassword()
                       + " ,'" + pJugador.getTipoUser()+ " ,'" + pJugador.getFecha()+ "')";
                // esto es solo para mostrar el sql que se va a ejecutar
               System.out.println(insertSql);
               // ejecuta la sentencia
               st.executeUpdate(insertSql);
               super.cerrarConexion();
        }catch(Exception ex){
            throw new cDatosException("ERROR al Ingresar un Admin /pUsuario/agregarJugador():" + ex.getMessage());
        }
         return true;
      }
           @Override
   public void modificar(java.lang.Object o) throws Exception {
        try{
            cUsuario unUser = (cUsuario)o;
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
                    // arma la sentencia sql
                    String updateSql="UPDATE usuarios SET " +
                    "nombre='" + unUser.getNombre() + "'" +
                    "apellido='" + unUser.getApellido() + "'" +
                    "email='" + unUser.getEmail()+ "'" +
                    "password='" + unUser.getPassword()+ "'"+
                    "tipouser='" + unUser.getTipoUser()+ "'" +
                    "fecha='" + unUser.getFecha()+ "'" +
                    " WHERE id=" +  unUser.getId();
                    System.out.println(updateSql);
                    // ejecuta la sentencia
                    st.executeUpdate(updateSql);
                    super.cerrarConexion();
        }catch(SQLException e){
            throw new cDatosException("ERROR AL INTENTAR MODIFICAR USUARIO:" + e.getMessage());
           
        }
    }

      @Override
   public void eliminar(java.lang.Object o) throws Exception {
        try{
            cUsuario unUser = (cUsuario)o;
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String deleteSql="DELETE FROM usuarios " +
                    " WHERE id=" +  unUser.getId();
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(deleteSql);
            // ejecuta la sentencia
            st.executeUpdate(deleteSql);
            super.cerrarConexion();
        }catch(SQLException e){throw new cDatosException("ERROR AL INTENTAR ELIMINAR USUARIO:" + e.getMessage());}
    }

   public cUsuario buscarUsuario(java.lang.Object o)throws Exception{
        try{
             cUsuario unUser = (cUsuario)o;

             super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String selectSql="SELECT * FROM usuarios ";
            if (unUser.getId() !=0){
                // si pasaron el registro busco solo por eso
                selectSql=selectSql + " WHERE tid=" + unUser.getId();
            }
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs=st.executeQuery(selectSql);
            
            unUser = null;
            
            while(rs.next()){
                unUser = new cUsuario();
                int num;
                // recorre el Resultset y crea un objeto con los datos de
                // cada linea.
                num = rs.getInt("tid");
                unUser.setId(num);
                unUser.setNombre(rs.getString("unombre"));
                unUser.setApellido(rs.getString("uapellido"));
                unUser.setEmail(rs.getString("uemail"));
                unUser.setPassword(rs.getString("upassword"));
                String gerar = rs.getString("utipouser");
                if(gerar.equals(Enums.Gerarquia.ADMIN)){
                    unUser.setTipoUser(Enums.Gerarquia.ADMIN);
                }else{
                    unUser.setTipoUser(Enums.Gerarquia.JUGADOR);
                }
                
            }
            super.cerrarConexion();
            // devuelve el objeto encontrado
            if (unUser != null){
                return unUser;
            }else{
                return null;
            }
        }catch(SQLException e){throw new cDatosException("Error al buscar accion:" + e.getMessage());}
    }

   public int generarId()throws Exception{
        try{
            int num;
            int id;
            num = 100;
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String selectSql="SELECT MAX(tid) FROM ttipo";
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs=st.executeQuery(selectSql);
            while(rs.next()){
                num = rs.getInt("MAX(tid)");
                num = num +1;
            }
            super.cerrarConexion();
            return num;
        }catch(SQLException e){throw new cDatosException("Error al buscar el código:" + e.getMessage());}
    }


   public ArrayList buscarTodos()throws Exception{
        try{
            cUsuario unUser;
            ArrayList coleccion;
            coleccion = new ArrayList();
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String selectSql="SELECT * FROM usuarios";
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs=st.executeQuery(selectSql);
            while(rs.next()){
                unUser = new cUsuario();
                int num;
                // recorre el Resultset y crea un objeto con los datos de
                // cada linea.
                num = rs.getInt("tid");
                unUser.setId(num);
                unUser.setNombre(rs.getString("unombre"));
                unUser.setApellido(rs.getString("uapellido"));
                unUser.setEmail(rs.getString("uemail"));
                unUser.setPassword(rs.getString("upassword"));
                String gerar = rs.getString("utipouser");
                if(gerar.equals(Enums.Gerarquia.ADMIN)){
                    unUser.setTipoUser(Enums.Gerarquia.ADMIN);
                }else{
                    unUser.setTipoUser(Enums.Gerarquia.JUGADOR);
                }
                coleccion.add(unUser);
            }
            super.cerrarConexion();
            // devuelve el objeto encontrado
            if (coleccion != null){
                return coleccion;
            }else{
                return null;
            }
        }catch(SQLException e){throw new cDatosException("Error al buscar accion:" + e.getMessage());}
    }
}
