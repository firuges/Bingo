/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author PERSONAL
 */
public class Utilidades {

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    //metodo para validar si la fecha es correcta
    public static boolean validarFecha(String fechax) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formatoFecha.parse(fechax);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public static boolean passLengthTrust(String pass, String pass2){
        if(pass.length() < 6 || pass2.length() < 6){
            return false;
        }
        return true;
    }
    public static boolean pass1pass2Trust(String pass1, String pass2){
        if(pass1.equals(pass2)){
            return true;
        }
        return false;
    }
    public static boolean camposCompletos(String nombre, String apellido, String Email, String Password, String Password2){
        if(nombre.equals("") ||apellido.equals("") ||Email.equals("") ||Password.equals("") ||Password2.equals("")){
            return false;
        }
         return true;
    }
    public static String FormatearFechaToString(Date fecha) {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        String FechaString = formatoFecha.format(fecha);
        return FechaString;
    }
    public static Date FormatearFechaToDate(String fecha) throws ParseException {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        Date Fecha = formatoFecha.parse(fecha);
        return Fecha;
    }
    public static String FormatearFechaToStringSQL(Date fecha) throws ParseException {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String FechaString = formatoFecha.format(fecha);
        return FechaString;
    }
}
