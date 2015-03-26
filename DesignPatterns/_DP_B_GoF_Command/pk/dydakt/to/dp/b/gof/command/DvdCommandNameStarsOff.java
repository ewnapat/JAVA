package pk.dydakt.to.dp.b.gof.command;

public class DvdCommandNameStarsOff extends CommandAbstract {  
	   private DvdName dvdName;  
	    
	   public DvdCommandNameStarsOff(DvdName dvdNameIn) {
	       this.dvdName = dvdNameIn;
	   }    
	   public void execute() {
	       this.dvdName.setNameStarsOff();
	   } 
	}
