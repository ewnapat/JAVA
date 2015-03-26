package pk.dydakt.to.dp.s.gof.facade;

public class _DP_S_GoF_Facade {

	   public static void main(String[] args) {
	       FacadeCuppaMaker cuppaMaker = new FacadeCuppaMaker();
	       FacadeTeaCup teaCup = cuppaMaker.makeACuppa();
	       System.out.println(teaCup);
	   }
	}
