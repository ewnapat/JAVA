package pk.dydakt.to.dp.b.gof.visitor;

public class GameInfo extends AbstractTitleInfo {  
	   public GameInfo(String titleName) {
	       this.setTitleName(titleName);
	   }    
	   
	   public void accept(TitleBlurbVisitor titleBlurbVisitor) {
	       titleBlurbVisitor.visit(this);
	   }
	}
