/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import java.util.Observable;

/**
 *
 * @author Maxi
 */
public class ClaseObservador extends Observable{
	
	private String accion;
	
	public ClaseObservador(){
		
	}
	// <editor-fold defaultstate="collapsed" desc=" Inctancia ">
    private static ClaseObservador instancia;

    public static ClaseObservador getInstancia() {
        if (instancia == null) {
            instancia = new ClaseObservador();
        }
        return instancia;
    }
// </editor-fold>
	public void setChang(String action) {
            setAccion(action);
		setChanged();
	    notifyObservers();
	}

    /**
     * @return the accion
     */
    public String getAccion() {
        return accion;
    }

    /**
     * @param accion the accion to set
     */
    public void setAccion(String accion) {
        this.accion = accion;
    }

}
