package pk.dydakt.to.dp.b.gof.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdInterpreterContext {
   private ArrayList<String> titles = new ArrayList<String>(); 
   private ArrayList<String> actors = new ArrayList<String>();
   private ArrayList<TitleAndActor> titlesAndActors = new ArrayList<TitleAndActor>();
   
   public void addTitle(String title) {
       titles.add(title);
   }
   public void addActor(String actor) {
       actors.add(actor);
   }
   public void addTitleAndActor(TitleAndActor titleAndActor) {
       titlesAndActors.add(titleAndActor);
   }
   
   public ArrayList<String> getAllTitles() {
       return titles;
   }
   public ArrayList<String> getAllActors() {
       return actors;
   }
   public ArrayList<String> getActorsForTitle(String titleIn) {
       ArrayList<String> actorsForTitle = new ArrayList<String>();
       TitleAndActor tempTitleAndActor;
       ListIterator titlesAndActorsIterator = 
         titlesAndActors.listIterator();
       while (titlesAndActorsIterator.hasNext()) {
           tempTitleAndActor = 
             (TitleAndActor)titlesAndActorsIterator.next();
           if (titleIn.equals(tempTitleAndActor.getTitle())) {
               actorsForTitle.add(tempTitleAndActor.getActor());
           }
       }
       return actorsForTitle;
   }
   public ArrayList<String> getTitlesForActor(String actorIn) {
       ArrayList<String> titlesForActor = new ArrayList<String>();
       TitleAndActor tempTitleAndActor;
       ListIterator actorsAndTitlesIterator = 
         titlesAndActors.listIterator();
       while (actorsAndTitlesIterator.hasNext()) {
           tempTitleAndActor = 
             (TitleAndActor)actorsAndTitlesIterator.next();
           if (actorIn.equals(tempTitleAndActor.getActor())) {
               titlesForActor.add(tempTitleAndActor.getTitle());
           }
       }
       return titlesForActor;
   }   
}
