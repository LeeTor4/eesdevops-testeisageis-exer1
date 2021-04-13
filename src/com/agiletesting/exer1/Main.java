package com.agiletesting.exer1;

import java.util.ArrayList;
import java.util.List;

public class Main {
 
	 public static void main(String[] args) {
		
		 Regras regra = new Regras();
		 List<Integer> lista = new ArrayList<Integer>();
		 for(int i =0; i<50;i++){
			 lista.add(i);
			 
			 System.out.print(i + " - ");
		 }
		 System.out.println();
		 int res = regra.retornaSomaPrimos(lista);
		 System.out.println(res);
	}
}
