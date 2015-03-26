package pk.dydakt.to.dp.s.gof.proxy;

public class _DP_S_GoF_Proxy {

	   public static void main(String[] args) {
	       System.out.println("TestProxy: instantiating PotOfTeaProxy");
	       PotOfTeaInterface potOfTea = new PotOfTeaProxy();
	       System.out.println(" ");
	       System.out.println("TestProxy: pouring tea");
	       potOfTea.pourTea();
	   }
	}
