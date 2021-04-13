

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.agiletesting.exer1.Regras;

public class RegraTest {
	
	@Test
	public void testaRegra() {
		
		 Regras regra = new Regras();
		 List<Integer> lista = new ArrayList<Integer>();
		 for(int i =0; i<50;i++){
			 lista.add(i);
			 
			 //System.out.print(i + " - ");
		 }
		
		 assertEquals(625, regra.retornaSomaPrimos(lista));
	}

}
