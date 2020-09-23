import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GardenTest {

    Garden underTestGarden = new Garden();
    HearthKami underTestHearthKami = new HearthKami("hearthKamiName","Hearth Kami",2,0,2,3,3,0,3,2);
    NatureKami underTestNatureKami = new NatureKami("natureKamiName", "Nature Kami",3,1,0,1,0,0,3,2);
    CurseKami underTestCurseKami = new CurseKami("curseKamiName", "Curse Kami",3,0,0,1,0,0,3,1);

    Phoenix underTestPhoenix = new Phoenix("phoenixName", "Phoenix",3,1,0,1,0,0,0,10);
    Kirrin underTestKirrin = new Kirrin("kirrinName", "Kirrin",3,1,0,1,0,0,0,10);
    Dragon underTestDragon = new Dragon("dragonName", "Dragon",3,1,0,1,0,0,0,10);
    Dragon underTestDragon2 = new Dragon("dragonName2", "Dragon",3,1,0,1,0,0,0,10);
    Dragon underTestDragon3 = new Dragon("dragonName3", "Dragon",3,1,0,1,0,0,0,10);


    @Test
    public void shouldBeAbleToSummonHearthKami(){
        underTestGarden.summon(underTestHearthKami, "heartKamiName");
        Map kamiRoster = underTestGarden.getGardenKami();
        int gardenSize = kamiRoster.size();
        assertEquals(1,gardenSize);
    }


    @Test
    public void shouldBeAbleToSummonHearthKamiANDDRAGON(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestDragon, "Relcorr");
        underTestGarden.summon(underTestDragon3, "Berrylinthranox");
        underTestGarden.summon(underTestDragon2, "Skye");
        assertEquals(4,underTestGarden.gardenKami.size());
    }

    @Test
    public void releaseKamiShouldReduceGardenSizeFrom2To1(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.release("Pollus");
        assertEquals(1,underTestGarden.getGardenKami().size());
    }

    @Test
    public void releasingAnAscendedKamiShouldIncreaseKarmaByOnePointPerAmountOfQuintessenceItIsOverItsAscendanceLevelExponentPlus3(){
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestNatureKami.setQuintessence(18);
        underTestNatureKami.setAscendanceLevel(6);
        underTestGarden.release("Dapple");
        assertEquals(6,underTestGarden.getKarma());
    }

    @Test
    public void getAxiomaticKamiShouldReturnHearthKamiAndDragonOnlyFromAmongOthers(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestPhoenix, "Faulks");
        underTestGarden.summon(underTestDragon, "Relcorr");

        Map<String, Kami> axiomaticKami = underTestGarden.getAxiomaticKami();
        assertEquals(2, axiomaticKami.size());
    }

    @Test
    public void getChaoticKamiShouldReturnNatureKamiAndCurseKamiOnlyFromAmongOthers(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestKirrin, "Seto");
        underTestGarden.summon(underTestPhoenix, "Faulks");

        Map<String, Kami> chaoticKami = underTestGarden.getChaoticKami();
        assertEquals(1, chaoticKami.size());
    }

    @Test
    public void getNeutralKamiShouldReturnPhoenixAndKirrinOnlyFromAmongOthers(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestKirrin, "Seto");
        underTestGarden.summon(underTestPhoenix, "Faulks");

        Map<String, Kami> neutralKami = underTestGarden.getNeutralKami();
        assertEquals(2, neutralKami.size());
    }

    @Test
    public void getCorporealKamiShouldReturnPhoenixAndKirrinAndDragonOnlyFromAmongOthers(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestKirrin, "Seto");
        underTestGarden.summon(underTestPhoenix, "Faulks");
        underTestGarden.summon(underTestDragon, "Relcorr");
        underTestGarden.summon(underTestDragon2,"Skye");

        Map<String, Kami> corporealKami = underTestGarden.getCorporealKami();
        assertEquals(4, corporealKami.size());
    }

    @Test
    public void getEtherealKamiShouldReturnHearthKamiAndNatureKamiAndCurseKamiOnlyFromAmongOthers(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestCurseKami, "Ju-On");
        underTestGarden.summon(underTestKirrin, "Seto");
        underTestGarden.summon(underTestPhoenix, "Faulks");
        underTestGarden.summon(underTestDragon, "Relcorr");
        underTestGarden.summon(underTestDragon2,"Skye");

        Map<String, Kami> etherealKami = underTestGarden.getEtherealKami();
        assertEquals(3, etherealKami.size());
    }

    @Test
    public void gardenTickShouldIncreaseHungerAndReducePurityOfCorporealAndReducePotenceOfEthereal(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestPhoenix, "Faulks");
        underTestGarden.summon(underTestDragon, "Relcorr");

        underTestGarden.tick();
        assertEquals(2, underTestHearthKami.getPotence());
        assertEquals(2, underTestNatureKami.getPotence());
        assertEquals(1, underTestHearthKami.getOmnipresence());
        assertEquals(1, underTestNatureKami.getOmnipresence());
        assertEquals(1,underTestDragon.getHunger());
        assertEquals(1,underTestPhoenix.getHunger());
        assertEquals(9,underTestDragon.getPurity());
        assertEquals(9,underTestPhoenix.getPurity());
    }
    
    @Test
    public void gardenTickShouldIncreaseYearsGone(){
        underTestGarden.tick();
        assertEquals(1,underTestGarden.getYearsGone());
    }

    @Test
    public void gardenTickWhileIncludingUnbalancedKamiWillSwayBalanceOfGarden(){
        underTestGarden.summon(underTestDragon, "Relcorr");
        underTestGarden.summon(underTestDragon2, "Skye");
        underTestGarden.summon(underTestDragon3, "Baryllinthranox");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.tick();
        assertEquals(2,underTestGarden.getBalance());
    }

    @Test
    public void gardenTickWhileAbsoluteValueOfBalanceGreaterThan3WillSubtractFromKarmaByFactor(){
        underTestGarden.setBalance(-9);
        underTestGarden.setKarma(10);
        underTestGarden.tick();
        assertEquals(7,underTestGarden.getKarma());
    }

    @Test
    public void cultivateGardenShouldIncreaseHungerOfAllCorporealKamiBy1AndIncreasePurityOfAllCorporealKamiBy4(){
        underTestGarden.summon(underTestKirrin, "Seto");
        underTestGarden.summon(underTestPhoenix, "Faulks");
        underTestGarden.summon(underTestDragon, "Relcorr");
        underTestKirrin.setHunger(10);
        underTestDragon.setHunger(8);
        underTestPhoenix.setHunger(6);
        underTestKirrin.setPurity(10);
        underTestDragon.setPurity(8);
        underTestPhoenix.setPurity(6);

        underTestGarden.cultivateGarden();
        assertEquals(12, underTestKirrin.getHunger());
        assertEquals(10, underTestDragon.getHunger());
        assertEquals(8, underTestPhoenix.getHunger());
        assertEquals(14, underTestKirrin.getPurity());
        assertEquals(12, underTestDragon.getPurity());
        assertEquals(10, underTestPhoenix.getPurity());
    }

    @Test
    public void callRainShouldIncreasePurityOfAllCorporealKamiBy5ExceptPhoenixWhoIncreasesHungerBy2AndReducesPurityBy2AndIncreaseOmnipresenceOfAllEtherealKamiBy2(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestCurseKami, "Ju-On");
        underTestGarden.summon(underTestKirrin, "Seto");
        underTestGarden.summon(underTestPhoenix, "Faulks");
        underTestGarden.summon(underTestDragon, "Relcorr");
        underTestKirrin.setPurity(10);
        underTestDragon.setPurity(8);
        underTestPhoenix.setPurity(6);
        underTestPhoenix.setHunger(6);
        underTestHearthKami.setOmnipresence(2);

        underTestGarden.callRain();
        assertEquals(15, underTestKirrin.getPurity());
        assertEquals(13, underTestDragon.getPurity());
        assertEquals(4, underTestPhoenix.getPurity());
        assertEquals(8, underTestPhoenix.getHunger());

        assertEquals(4, underTestHearthKami.getOmnipresence());
    }

    @Test
    public void tollBellShouldIncreasePotenceOfAllEtherealKamiBy5ExceptCurseKamiWhichItReducesBy3AndReducesQuintessenceBy1AndResetBalanceTo0(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestCurseKami, "Ju-On");
        underTestHearthKami.setPotence(2);
        underTestNatureKami.setPotence(5);
        underTestCurseKami.setPotence(1256);
        underTestCurseKami.setQuintessence(1);
        underTestGarden.setBalance(30000);

        underTestGarden.tollBell();
        assertEquals(7, underTestHearthKami.getPotence());
        assertEquals(10, underTestNatureKami.getPotence());
        assertEquals(1253, underTestCurseKami.getPotence());
        assertEquals(0, underTestCurseKami.getQuintessence());
        assertEquals(0,underTestGarden.getBalance());
    }

    @Test
    public void openGatesShouldIncreaseOmnipresenceOfAllEtherealKamiBy5AndReduceHungerOfAllCorporealKamiBy2ButReduceDragonPurityBy2(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestCurseKami, "Ju-On");
        underTestGarden.summon(underTestKirrin, "Seto");
        underTestGarden.summon(underTestPhoenix, "Faulks");
        underTestGarden.summon(underTestDragon, "Relcorr");
        underTestKirrin.setHunger(10);
        underTestDragon.setHunger(8);
        underTestDragon.setPurity(8);
        underTestPhoenix.setHunger(6);
        underTestHearthKami.setOmnipresence(2);
        underTestNatureKami.setOmnipresence(5);
        underTestCurseKami.setOmnipresence(1256);

        underTestGarden.openGates();
        assertEquals(8, underTestKirrin.getHunger());
        assertEquals(6, underTestDragon.getHunger());
        assertEquals(6, underTestDragon.getPurity());
        assertEquals(4, underTestPhoenix.getHunger());
        assertEquals(7, underTestHearthKami.getOmnipresence());
        assertEquals(10, underTestNatureKami.getOmnipresence());
        assertEquals(1261, underTestCurseKami.getOmnipresence());
    }


    @Test
    public void harvestGardenShouldReduceHungerOfAllCorporealKamiBy8AndReducePotenceOfNatureKamiBy4AndQuintessenceBy1(){
        underTestGarden.summon(underTestHearthKami, "Pollus");
        underTestGarden.summon(underTestNatureKami, "Dapple");
        underTestGarden.summon(underTestCurseKami, "Ju-On");
        underTestGarden.summon(underTestKirrin, "Seto");
        underTestGarden.summon(underTestPhoenix, "Faulks");
        underTestGarden.summon(underTestDragon, "Relcorr");
        underTestKirrin.setHunger(10);
        underTestDragon.setHunger(8);
        underTestPhoenix.setHunger(6);
        underTestHearthKami.setPotence(2);
        underTestNatureKami.setPotence(5);
        underTestNatureKami.setQuintessence(2);
        underTestCurseKami.setPotence(1256);

        underTestGarden.harvestGarden();
        assertEquals(2, underTestKirrin.getHunger());
        assertEquals(0, underTestDragon.getHunger());
        assertEquals(-2, underTestPhoenix.getHunger());
        assertEquals(2, underTestHearthKami.getPotence());
        assertEquals(1, underTestNatureKami.getPotence());
        assertEquals(1,underTestNatureKami.getQuintessence());
        assertEquals(1256, underTestCurseKami.getPotence());
    }

    @Test
    public void generateChoicesShouldGenerateTwoDifferentRandomNumbersWhichCorrespondToADifferentGlobalAction(){
        underTestGarden.generateChoices();
        assertEquals(false,underTestGarden.getGlobalChoiceA()==0);
        assertEquals(false,underTestGarden.getGlobalChoiceB()==0);
        assertEquals(false,underTestGarden.getGlobalChoiceA()==underTestGarden.getGlobalChoiceB());
    }

    @Test
    public void generateStartingKamiShouldCreate3KamiAndAddToGardenKamiMap(){
        underTestGarden.generateStartingKami();
        System.out.println(underTestGarden.getGardenKami());
        assertEquals(3,underTestGarden.gardenKami.size());
    }
}