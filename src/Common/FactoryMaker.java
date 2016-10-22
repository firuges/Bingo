/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author Maxi
 */
public class FactoryMaker {
    private  AbstractFactory pf=null;
	
        public  AbstractFactory getFactory(String choice){
		
            if(choice.toUpperCase().equals(Enums.FactorySelection.PERSONAS)){
			pf=new ConcreteFactoryPersonas();
		}else if(choice.toUpperCase().equals(Enums.FactorySelection.JUEGO)){
			//pf=new ConcreteFactory2();
		} 
                
                return pf;
	}   
}
