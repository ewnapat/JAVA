package pk.dydakt.to.dp.s.gof.adapter;

public class _DP_S_GoF_Adapter {

	   public static void main(String[] args) {
	       TeaCup teaCup = new TeaCup();

	       System.out.println("Steeping tea bag");
	       TeaBag teaBag = new TeaBag();       
	       teaCup.steepTeaBag(teaBag);

	       System.out.println("Steeping loose leaf tea");
	       LooseLeafTea looseLeafTea = new LooseLeafTea();
	       TeaBall teaBall = new TeaBall(looseLeafTea);
	       teaCup.steepTeaBag(teaBall);
	   }
	}      
