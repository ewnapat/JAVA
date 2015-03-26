package pk.dydakt.to.dp.s.gof.proxy;

public class PotOfTeaProxy implements PotOfTeaInterface {  
	   PotOfTea potOfTea;
	    
	   public PotOfTeaProxy() {}
	   
	   public void pourTea() {
	       potOfTea = new PotOfTea();
	       potOfTea.pourTea();
	   }
	}
