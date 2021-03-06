import java.util.*;

public class Garden {
    private int yearsGone = 0; //Increases the difficulty over time.
    private int karma = 0; //Overall game score. Get more points by releasing ascendant or happier Kami.
    private int balance = 0; //Between Order and Chaos. Swayed each tick by the quintessence of relative Kami in your garden.
    private int power = 2; //Used to affect Kami. Increases by two each tick
    private int globalChoiceA = 0;
    private String globalChoiceAString;
    private String globalChoiceBString;
    private int globalChoiceB = 0;
    private int globalChoiceTaken = 0;
    private boolean focusing = false;

    private Scanner inputInteger = new Scanner(System.in);

    Map<String, Kami> gardenKami = new HashMap<>();

    public void generateChoices() {
        globalChoiceA = (int) (Math.random() * 4 + 1);
        do {
            globalChoiceB = (int) (Math.random() * 4 + 1);
        } while (globalChoiceA == globalChoiceB);
        if (globalChoiceA == 1) {
            globalChoiceAString = "Cultivate your garden. Through hard work this realm can be more fruitful and disciplined.";
        } else if (globalChoiceA == 2) {
            globalChoiceAString = "Call to the cleansing rains. Let bodies be purified and spirits be rejuvenated.";
        } else if (globalChoiceA == 3) {
            globalChoiceAString = "Toll the sacred bell. Its echoing ring shall instill vitality in the garden spirits and grant you power, though some may detest its purity...";
        } else if (globalChoiceA == 4) {
            globalChoiceAString = "Fling wide the portals and gateways to neighboring realms so that winds of change may flow freely.";
        } else if (globalChoiceA == 5) {
            globalChoiceAString = "Reap a grand harvest from your garden to nourish the bodies within.";
        }
        if (globalChoiceB == 1) {
            globalChoiceBString = "Cultivate your garden. Through hard work this realm can be more fruitful and disciplined.";
        } else if (globalChoiceB == 2) {
            globalChoiceBString = "Call to the cleansing rains. Let bodies be purified and spirits be rejuvenated.";
        } else if (globalChoiceB == 3) {
            globalChoiceBString = "Toll the sacred bell. Its echoing ring shall instill vitality in the garden spirits and grant you power, though some may detest its purity...";
        } else if (globalChoiceB == 4) {
            globalChoiceBString = "Fling wide the portals and gateways to neighboring realms so that winds of change may flow freely.";
        } else if (globalChoiceB == 5) {
            globalChoiceBString = "Reap a grand harvest from your garden to nourish the bodies within.";
        }
    }

    public void generateStartingKami() {
        Kami thisKamiA;
        Kami thisKamiB;
        Kami thisKamiC;
        double KamiA = Math.random();
        double KamiB = Math.random();
        double KamiC = Math.random();
        if (KamiA < 0.7) {
            thisKamiA = new HearthKami("Pollus", "Hearth Kami");
        } else {
            thisKamiA = new CurseKami("Writhe", "Curse Kami");
        }
        if (KamiB < 0.7) {
            thisKamiB = new NatureKami("Dapple", "Nature Kami");
        } else {
            thisKamiB = new Kirrin("Seto", "Kirrin");
        }
        if (KamiC < 0.7) {
            thisKamiC = new Phoenix("Anthrafel", "Phoenix");
        } else {
            thisKamiC = new Dragon("Relcorr", "Dragon");
        }
        gardenKami.put(thisKamiA.getName(), thisKamiA);
        gardenKami.put(thisKamiB.getName(), thisKamiB);
        gardenKami.put(thisKamiC.getName(), thisKamiC);
    }

    public void summon(Kami kami, String kamiName) {
        gardenKami.put(kamiName, kami);
        changePower(-1);
    }

    public void release(String kamiName) {
        if (gardenKami.containsKey(kamiName)) {
            Kami thisKami = gardenKami.get(kamiName);
            if (thisKami.getQuintessence() >= thisKami.getAscendanceLevel()) {
                karma += (int) (thisKami.getQuintessence() / (thisKami.getAscendanceLevel())) + 3;
            } else {
                karma -= (int) ((thisKami.getAscendanceLevel() - thisKami.getQuintessence()) * 0.5);
            }
            gardenKami.remove(kamiName);
        } else {
            System.out.println("No Kami with that name here resides.");
        }
    }

    public void tick() {
        yearsGone++;
        if (power < 0) power = 0;

        //REGENERATE POWER AT A HIGHER RATE WHEN AT LOWER POWER, AND WITH HIGHER KARMA
        if (power < Math.abs(karma) * 0.5) {
            power += 3;
        } else if (power < Math.abs(karma) + 2) {
            power += 2;
        } else power++;

        if (Math.abs(balance) > 2) {
            karma -= (int) (Math.abs(balance) / 3);
        }
        //SWING the balance of the garden in favor of the dominant alignment.
        if (getAxiomaticKami().size() - getChaoticKami().size() > getNeutralKami().size()) {
            balance += getAxiomaticKami().size() - getChaoticKami().size();
        } else if (getChaoticKami().size() - getNeutralKami().size() > (getAxiomaticKami().size())) {
            balance -= getAxiomaticKami().size() - getChaoticKami().size();
        }

        for (Kami kami : gardenKami.values()) {// THE TICK IS PASSED ON TO EACH KAMI IN MAP
            kami.tick();
        }
    }

    public void focusWill(String kamiName) {
        focusing = true;
        int thisCommand = 0;
        Kami thisKami = gardenKami.get(kamiName);
        System.out.println("\nYou currently have -<(" + power + ")>- thaums of power");
        System.out.println("1: (" + thisKami.getPersonalInteraction1().getPowerCost() + "thaums, Difficulty: " + thisKami.getPersonalInteraction1().getDifficulty() + ") " + thisKami.getPersonalInteraction1().getText());
        System.out.println("2: (" + thisKami.getAlignmentInteraction1().getPowerCost() + "thaums, Difficulty: " + thisKami.getAlignmentInteraction1().getDifficulty() + ") " + thisKami.getAlignmentInteraction1().getText());
        System.out.println("3: (" + thisKami.getIntrapersonalInteraction1().getPowerCost() + "thaums, Difficulty: " + thisKami.getIntrapersonalInteraction1().getDifficulty() + ") " + thisKami.getIntrapersonalInteraction1().getText());
        System.out.println("4: <-back");
        boolean ok = false;
        while (!ok) {
            thisCommand = inputInteger.nextInt();
            if (thisCommand == 1 && power >= thisKami.getPersonalInteraction1().getPowerCost()) {
                thisKami.personalInteraction(1);
                power -= thisKami.getPersonalInteraction1().getPowerCost();
                ok = true;
            } else if (thisCommand == 2 && power >= thisKami.getAlignmentInteraction1().getPowerCost()) {
                thisKami.alignedInteraction(1);
                power -= thisKami.getAlignmentInteraction1().getPowerCost();
                ok = true;
            } else if (thisCommand == 3 && power >= thisKami.getIntrapersonalInteraction1().getPowerCost()) {
                thisKami.intrapersonalInteraction(1);
                power -= thisKami.getIntrapersonalInteraction1().getPowerCost();
                ok = true;
            } else if (thisCommand == 4) {
                ok = true;
            } else {
                System.out.println("You lack sufficient power to proceed with that action.");
            }
        }
    }

    public void cultivateGarden() {
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof Corporeal) {
                thisKami.setHunger(thisKami.getHunger() + 2);
                thisKami.setPurity(thisKami.getPurity() + 4);
            }
            thisKami.setDiscipline(thisKami.getDiscipline() + 1);
        }
        karma++;
    }

    public void callRain() {
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof Corporeal) {
                thisKami.setPurity(thisKami.getPurity() + 5);
                if (thisKami instanceof Phoenix) {
                    thisKami.setHunger(thisKami.getHunger() + 2);
                    thisKami.setPurity(thisKami.getPurity() - 7);
                }
            }
            if (thisKami instanceof Ethereal) {
                thisKami.setOmnipresence(thisKami.getOmnipresence() + 2);
            }
        }
    }

    public void tollBell() {
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof Ethereal) {
                if (thisKami instanceof CurseKami) {
                    thisKami.setPotence(thisKami.getPotence() - 3);
                    thisKami.setQuintessence(thisKami.getQuintessence() - 1);
                } else thisKami.setPotence(thisKami.getPotence() + 5);
            }
        }
        balance = 0;
    }

    public void openGates() {
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof Corporeal) {
                thisKami.setHunger(thisKami.getHunger() - 2);
                if (thisKami instanceof Dragon) {
                    thisKami.setPurity(thisKami.getPurity() - 2);
                }
            }
            if (thisKami instanceof Ethereal) {
                thisKami.setOmnipresence(thisKami.getOmnipresence() + 5);
            }
        }
    }

    public void harvestGarden() {
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof Corporeal) {
                thisKami.setHunger(thisKami.getHunger() - 8);
            }
            if (thisKami instanceof NatureKami) {
                thisKami.setPotence(thisKami.getPotence() - 4);
                thisKami.setQuintessence(thisKami.getQuintessence() - 1);
            }
        }
    }

    public Map<String, Kami> getAxiomaticKami() {
        Map<String, Kami> axiomaticKami = new HashMap<>();
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof AxiomaticKami) {
                axiomaticKami.put(thisKami.getName(), thisKami);
            }
        }
        return axiomaticKami;
    }

    public Map<String, Kami> getChaoticKami() {
        Map<String, Kami> chaoticKami = new HashMap<>();
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof ChaoticKami) {
                chaoticKami.put(thisKami.getName(), thisKami);
            }
        }
        return chaoticKami;
    }

    public Map<String, Kami> getNeutralKami() {
        Map<String, Kami> neutralKami = new HashMap<>();
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof NeutralKami) {
                neutralKami.put(thisKami.getName(), thisKami);
            }
        }
        return neutralKami;
    }

    public Map<String, Kami> getCorporealKami() {
        Map<String, Kami> corporealKami = new HashMap<>();
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof Corporeal) {
                corporealKami.put(thisKami.getName(), thisKami);
            }
        }
        return corporealKami;
    }

    public Map<String, Kami> getEtherealKami() {
        Map<String, Kami> etherealKami = new HashMap<>();
        for (Kami thisKami : gardenKami.values()) {
            if (thisKami instanceof Ethereal) {
                etherealKami.put(thisKami.getName(), thisKami);
            }
        }
        return etherealKami;
    }

    public void changePower(int numberOfPower) {
        power += numberOfPower;
    }

    public int getGlobalChoiceA() {
        return globalChoiceA;
    }

    public void setGlobalChoiceA(int globalChoiceA) {
        this.globalChoiceA = globalChoiceA;
    }

    public int getGlobalChoiceB() {
        return globalChoiceB;
    }

    public void setGlobalChoiceB(int globalChoiceB) {
        this.globalChoiceB = globalChoiceB;
    }

    public int getGlobalChoiceTaken() {
        return globalChoiceTaken;
    }

    public void setGlobalChoiceTaken(int globalChoiceTaken) {
        this.globalChoiceTaken = globalChoiceTaken;
    }

    public String getGlobalChoiceAString() {
        return globalChoiceAString;
    }

    public void setGlobalChoiceAString(String globalChoiceAString) {
        this.globalChoiceAString = globalChoiceAString;
    }

    public String getGlobalChoiceBString() {
        return globalChoiceBString;
    }

    public void setGlobalChoiceBString(String globalChoiceBString) {
        this.globalChoiceBString = globalChoiceBString;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int getYearsGone() {
        return yearsGone;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setYearsGone(int yearsGone) {
        this.yearsGone = yearsGone;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public Map<String, Kami> getGardenKami() {
        return gardenKami;
    }

    public void setGardenKami(Map<String, Kami> gardenKami) {
        this.gardenKami = gardenKami;
    }

    public boolean isFocusing() {
        return focusing;
    }

    public void setFocusing(boolean focusing) {
        this.focusing = focusing;
    }

    public Kami getKami(String kamiToRelease) {
        return gardenKami.get(kamiToRelease);
    }
}
