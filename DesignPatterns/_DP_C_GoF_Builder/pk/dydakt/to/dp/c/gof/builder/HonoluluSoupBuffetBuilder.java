package pk.dydakt.to.dp.c.gof.builder;

import pk.dydakt.to.dp.c.gof.soups.HonoluluClamChowder;
import pk.dydakt.to.dp.c.gof.soups.HonoluluFishChowder;

class HonoluluSoupBuffetBuilder extends SoupBuffetBuilder {
    public void buildClamChowder() {
        soupBuffet.clamChowder = new HonoluluClamChowder();
    }
    public void buildFishChowder() {
        soupBuffet.fishChowder = new HonoluluFishChowder();
    }
    
    public void setSoupBuffetName() {
        soupBuffet.soupBuffetName = "Honolulu Soup Buffet";
    }
}
