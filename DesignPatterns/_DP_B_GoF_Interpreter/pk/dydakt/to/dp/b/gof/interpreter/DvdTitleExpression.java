package pk.dydakt.to.dp.b.gof.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdTitleExpression extends DvdAbstractExpression {  
   public String interpret(DvdInterpreterContext 
                           dvdInterpreterContext) {
       ArrayList<String> titles = dvdInterpreterContext.getAllTitles();
       ListIterator titlesIterator = titles.listIterator();
       StringBuffer titleBuffer = new StringBuffer("");
       boolean first = true;
       while (titlesIterator.hasNext()) {
           if (!first) {
               titleBuffer.append(", ");
           } else {
               first = false;
           }    
           titleBuffer.append((String)titlesIterator.next());
       }
       return titleBuffer.toString();
   }
}
