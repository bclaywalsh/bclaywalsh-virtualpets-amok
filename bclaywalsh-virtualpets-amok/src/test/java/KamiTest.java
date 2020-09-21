import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KamiTest {
    Garden underTestGarden = new Garden();
    HearthKami underTestHearthKami = new HearthKami("hearthKamiName", "Hearth Kami", 2, 0, 2, 3, 3, 0, 0, 0);
    NatureKami underTestNatureKami = new NatureKami("natureKamiName", "Nature Kami", 3, 1, 0, 1, 0, 0, 0, 0);
    Phoenix underTestPhoenix = new Phoenix("phoenixName", "Phoenix", 3, 1, 0, 1, 0, 0, 0, 10);
    Dragon underTestDragon = new Dragon("dragonName", "Dragon", 3, 1, 0, 1, 0, 0, 0, 10);
    Kirrin underTestKirrin = new Kirrin("kirrinName", "Kirrin", 3, 1, 0, 1, 0, 0, 0, 10);

    Interaction underTestInteraction = new Interaction(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, "Interaction?", "Interaction.", 0, 0, 0);


    @Test
    public void kamiTickShouldIncreaseBoredomAndHungerInCorporealKami() {
        underTestPhoenix.tick();
        assertEquals(1, underTestPhoenix.getBoredom());
        assertEquals(1, underTestPhoenix.getHunger());
    }

    @Test
    public void corporealKamiTickShouldReducePurityFrom10To9() {
        underTestPhoenix.tick();
        assertEquals(9, underTestPhoenix.getPurity());
    }

    @Test
    public void phoenixShouldInitializeWithAPersonalInteractionMapOf4AndAnIntrapersonalInteractionMapOf4() {
        assertEquals(4, underTestPhoenix.getMyPersonalInteractions().size());
        assertEquals(4, underTestPhoenix.getMyIntrapersonalInteractions().size());
    }

    @Test
    public void interactionAFromCorporealInterfaceShouldIncreaseLoyaltyFrom1To2() {
        underTestPhoenix.personalInteraction(1);
        assertEquals(2, underTestPhoenix.getLoyalty());
    }

    @Test
    public void phoenixIntrapersonalInteractionNumber2ShouldIncreaseLoyaltyFrom1To3(){
        underTestPhoenix.intrapersonalInteraction(2);
        assertEquals(3, underTestPhoenix.getLoyalty());
    }

    @Test
    public void phoenixAlignedInteractionNumber3ShouldIncreaseIntelligenceBy2(){
        underTestPhoenix.alignedInteraction(3);
        assertEquals(2, underTestPhoenix.getIntelligence());
    }

    @Test
    public void ascendedKamiWillMaintainAMinimumLevelOfAllDegradingStats(){
        underTestGarden.summon(underTestPhoenix);
        underTestPhoenix.setQuintessence(20);
        underTestPhoenix.setPurity(4);
        underTestPhoenix.setHunger(10);
        underTestGarden.tick();
        assertEquals(8, underTestPhoenix.getPurity());
        assertEquals(3,underTestPhoenix.getHunger());

    }
}
