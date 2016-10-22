/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.Date;

/**
 *
 * @author Maxi
 */
public class cAdmin extends cUsuario {
    public cAdmin(int pId, String pNombre,String pApellido,String pEmail,String pPassword, Enums.Gerarquia pTipoUser, Date pFecha){
        super(pId, pNombre,pApellido,pEmail,pPassword, pTipoUser, pFecha);
    }
}
