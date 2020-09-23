import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class Kami {
    protected String name;
    protected String species;
    protected String goal;
    protected int quintessence;
    protected int loyalty;
    protected int intelligence;
    protected int discipline;
    protected int ascendanceLevel;
    protected int boredom;
    protected int age;
    protected int hunger;
    protected int purity;
    protected int potence;
    protected int omnipresence;

    protected Interaction interactionTaken; //  ALIASING! WOOHOO!
    protected Interaction personalInteraction1;
    protected Interaction personalInteraction2;
    protected Interaction intrapersonalInteraction1;
    protected Interaction intrapersonalInteraction2;
    protected Interaction alignmentInteraction1;
    protected Interaction alignmentInteraction2;
    protected Interaction ignoredInteraction;
    protected Interaction failedInteraction;

    protected int quintessenceLast;
    protected Map<Integer, Interaction> myPersonalInteractions = new HashMap<>();
    protected Map<Integer, Interaction> myIntrapersonalInteractions = new HashMap<>();
    protected Map<Integer, Interaction> myAlignmentInteractions = new HashMap<>();

    public Kami(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age) {
        this.name = kamiName;
        this.species = kamiSpecies;
        this.quintessence = quintessence;
        this.quintessenceLast = quintessence;
        this.loyalty = loyalty;
        this.intelligence = intelligence;
        this.discipline = discipline;
        this.boredom = boredom;
        this.age = age;
    }

    public Kami(String kamiName, String kamiSpecies) {
        this.name = kamiName;
        this.species = kamiSpecies;
    }

    public void tick() {
        if (this instanceof Corporeal) {
            hunger++;
            purity--;
//            if (hunger > 5) {
//                if (Math.random() + ((hunger - 5) * 0.1) > 1) quintessence--;
//                if (hunger > 10) hunger = 10;
//            } else if (hunger < 0) hunger = 0;
//            if (purity < 5) {
//                if (Math.random() + ((5 - purity) * 0.1) > 1) quintessence--;
//                if (purity < 0) purity = 0;
//            } else if (purity > 10) purity = 10;
//
//            if (quintessence > ascendanceLevel) { // ASCENDED CORPOREAL STAT CAPS
//                if (hunger > 3) hunger = 3;
//                if (purity < 8) purity = 8;
//            }
        }
        if (this instanceof Ethereal) {
            potence--;
            omnipresence--;
//            if (potence < 5) {
//                if (Math.random() + ((5 - potence) * 0.1) > 1) quintessence--;
//                if (potence < 0) potence = 0;
//            } else if (potence > 10) potence = 10;
//            if (omnipresence < 5) {
//                if (Math.random() + ((5 - omnipresence) * 0.1) > 1) quintessence--;
//                if (omnipresence < 0) omnipresence = 0;
//            } else if (omnipresence > 10) omnipresence = 10;
//
//            if (quintessence > ascendanceLevel) {  // ASCENDED ETHEREAL STAT CAPS
//                if (potence < 8) potence = 8;
//                if (omnipresence < 8) omnipresence = 8;
//            }
        }
        //COMMON STAT CHANGES
        boredom++;
//        if (intelligence < 0) intelligence = 0;
//        if (discipline < 0) discipline = 0;
//        if (loyalty < 0) loyalty = 0;
//        if (boredom > 10) boredom = 10;
//        if (boredom<0) boredom = 0;
    }

    public void generateChoices() {
        //randomly select two different interactions from each sort of list to offer the player
        personalInteraction1 = myPersonalInteractions.get((int) (Math.ceil(Math.random() * myPersonalInteractions.size())));
        do {
            personalInteraction2 = myPersonalInteractions.get((int) (Math.ceil(Math.random() * myPersonalInteractions.size())));
        } while (personalInteraction1 == personalInteraction2);

        intrapersonalInteraction1 = myIntrapersonalInteractions.get((int) (Math.ceil(Math.random() * myIntrapersonalInteractions.size())));
        do {
            intrapersonalInteraction2 = myIntrapersonalInteractions.get((int) (Math.ceil(Math.random() * myIntrapersonalInteractions.size())));
        } while (intrapersonalInteraction1 == intrapersonalInteraction2);

        alignmentInteraction1 = myAlignmentInteractions.get((int) (Math.ceil(Math.random() * myAlignmentInteractions.size())));
        do {
            alignmentInteraction2 = myAlignmentInteractions.get((int) (Math.ceil(Math.random() * myAlignmentInteractions.size())));
        } while (alignmentInteraction1 == alignmentInteraction2);
    }

    public String toString() {
        return name + " the " + species;
    }


    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getPurity() {
        return purity;
    }

    public void setPurity(int purity) {
        this.purity = purity;
    }

    public int getPotence() {
        return potence;
    }

    public void setPotence(int potence) {
        this.potence = potence;
    }

    public int getOmnipresence() {
        return omnipresence;
    }

    public void setOmnipresence(int omnipresence) {
        this.omnipresence = omnipresence;
    }

    public Interaction getPersonalInteraction1() {
        return personalInteraction1;
    }

    public void setPersonalInteraction1(Interaction personalInteraction1) {
        this.personalInteraction1 = personalInteraction1;
    }

    public Interaction getPersonalInteraction2() {
        return personalInteraction2;
    }

    public void setPersonalInteraction2(Interaction personalInteraction2) {
        this.personalInteraction2 = personalInteraction2;
    }

    public Interaction getIntrapersonalInteraction1() {
        return intrapersonalInteraction1;
    }

    public void setIntrapersonalInteraction1(Interaction intrapersonalInteraction1) {
        this.intrapersonalInteraction1 = intrapersonalInteraction1;
    }

    public Interaction getIntrapersonalInteraction2() {
        return intrapersonalInteraction2;
    }

    public void setIntrapersonalInteraction2(Interaction intrapersonalInteraction2) {
        this.intrapersonalInteraction2 = intrapersonalInteraction2;
    }

    public Interaction getAlignmentInteraction1() {
        return alignmentInteraction1;
    }

    public void setAlignmentInteraction1(Interaction alignmentInteraction1) {
        this.alignmentInteraction1 = alignmentInteraction1;
    }

    public Interaction getAlignmentInteraction2() {
        return alignmentInteraction2;
    }

    public void setAlignmentInteraction2(Interaction alignmentInteraction2) {
        this.alignmentInteraction2 = alignmentInteraction2;
    }

    public void setMyPersonalInteractions(Map<Integer, Interaction> myPersonalInteractions) {
        this.myPersonalInteractions = myPersonalInteractions;
    }

    public void setMyIntrapersonalInteractions(Map<Integer, Interaction> myIntrapersonalInteractions) {
        this.myIntrapersonalInteractions = myIntrapersonalInteractions;
    }

    public Map<Integer, Interaction> getMyAlignmentInteractions() {
        return myAlignmentInteractions;
    }

    public void setMyAlignmentInteractions(Map<Integer, Interaction> myAlignmentInteractions) {
        this.myAlignmentInteractions = myAlignmentInteractions;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getQuintessence() {
        return quintessence;
    }

    public void setQuintessence(int quintessence) {
        this.quintessence = quintessence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDiscipline() {
        return discipline;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    public int getAscendanceLevel() {
        return ascendanceLevel;
    }

    public void setAscendanceLevel(int ascendanceLevel) {
        this.ascendanceLevel = ascendanceLevel;
    }

    public int getQuintessenceLast() {
        return quintessenceLast;
    }

    public void setQuintessenceLast(int quintessenceLast) {
        this.quintessenceLast = quintessenceLast;
    }


    public Map<Integer, Interaction> getMyPersonalInteractions() {
        return myPersonalInteractions;
    }

    public Map<Integer, Interaction> getMyIntrapersonalInteractions() {
        return myIntrapersonalInteractions;
    }

    public void setMyInteractions(Map<Integer, Interaction> myInteractions) {
        this.myPersonalInteractions = myInteractions;
    }

    public abstract void addPersonalInteraction(Interaction thisInteraction);

    public abstract void addIntrapersonalInteraction(Interaction thisInteraction);

    public abstract void personalInteraction(int interactionKeyNumber);

    public abstract void intrapersonalInteraction(int interactionKeyNumber);

    public abstract void alignedInteraction(int interactionKeyNumber);

    public abstract Interaction getAlignedInteraction(int interactionKeyNumber);

    public abstract Interaction getPersonalInteraction(int interactionKey);

    public abstract Interaction getIntrapersonalInteraction(int interactionKey);

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Interaction getInteractionTaken() {
        return interactionTaken;
    }

    public void setInteractionTaken(Interaction interactionTaken) {
        this.interactionTaken = interactionTaken;
    }

    public Interaction getIgnoredInteraction() {
        return ignoredInteraction;
    }

    public void setIgnoredInteraction(Interaction ignoredInteraction) {
        this.ignoredInteraction = ignoredInteraction;
    }

    public Interaction getFailedInteraction() {
        return failedInteraction;
    }

    public void setFailedInteraction(Interaction failedInteraction) {
        this.failedInteraction = failedInteraction;
    }
}
