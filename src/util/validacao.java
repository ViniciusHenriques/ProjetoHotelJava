/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Vinicius
 */
public class validacao {
    public static boolean  validarData(String v){
        try {
             DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
            df.setLenient (false); // aqui o pulo do gato
            df.parse(v);
            return true;
        } catch (ParseException e) {
            return false;
        }

    }
    public static boolean  validarNumero(String v){
        String exp = "^[0-9]{8,15}$";
        return v.matches(exp);
    }
    
    public static boolean  validarCPF(String v){
        String exp = "^[0-9 -]{8,15}$";
        return v.matches(exp);
    }
    public static boolean  validarSalario(String v){
        String exp = "^[0-9,.]{1,15}$";
        return v.matches(exp);
    }
    public static boolean  validarString(String v){
        String exp = "^[A-zÀ-ú ]{2,15}$";
        return v.matches(exp);
    }
    

    
}
