package pk.dydakt.to.dp.c.gof.builder;

import pk.dydakt.to.dp.c.gof.soups.BostonClamChowder;
import pk.dydakt.to.dp.c.gof.soups.BostonFishChowder;

class BostonSoupBuffetBuilder extends SoupBuffetBuilder {
    public void buildClamChowder() {
       soupBuffet.clamChowder = new BostonClamChowder();
    }
    public void buildFishChowder() {
       soupBuffet.fishChowder = new BostonFishChowder();
    }    
    
    public void setSoupBuffetName() {
       soupBuffet.soupBuffetName = "Boston Soup Buffet";
    }
}
