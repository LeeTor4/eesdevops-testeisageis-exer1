package com.agiletesting.exer1;

import java.util.List;

public class Regras {

	private boolean ehPrimo(double num) {
		if (num % 2 == 0)
            return false;  
	    return true;	
	}
	public int retornaSomaPrimos(List<Integer> lista) {
		
		int valor = 0;
	    for (double num : lista) {
	        
	    	if(ehPrimo(num)){
	    		valor += num;	
	    	}
	    }
	    return valor;
	
	}
}
