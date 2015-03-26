package pk.dydakt.to.dp.s.gof.decorator;

public class _DP_S_GoF_Decorator {

	   public static void main(String[] args) {
	       Tea teaLeaves = new TeaLeaves();
	       Tea chaiDecorator = new ChaiDecorator(teaLeaves);
	       chaiDecorator.steepTea();
	   }
	}
