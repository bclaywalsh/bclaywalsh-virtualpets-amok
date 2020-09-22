public class Phoenix extends NeutralKami implements Corporeal {
    private int hunger = 3;
    private int purity = 10;
    private int boredom = 0;
    private int intelligence = 1;
    private int discipline = 3;
    private int loyalty = 1;
    private int quintessence = 5;
    private int age = 10;
    private int ascendanceLevel = 20;

    private int personalInteractionNumber = 5;
    private int intrapersonalInteractionNumber = 5;
    private Interaction failedInteraction;
    private Interaction ignoredInteraction;
    private String goal = "bless sacred beginnings and instill them with vitality.";
    private Interaction interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "pulling itself from a pile of smoldering ashes", 0, 0, 0);


    public Phoenix(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int hunger, int purity) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        this.hunger = hunger;
        this.purity = purity;
        myPersonalInteractions.put(1, interactionA);
        myPersonalInteractions.put(2, interactionB);
        myPersonalInteractions.put(3, interactionC);
        myPersonalInteractions.put(4, interactionD);
        myAlignmentInteractions.put(1, alignedInteraction1);
        myAlignmentInteractions.put(2, alignedInteraction2);
        myAlignmentInteractions.put(3, alignedInteraction3);
        myAlignmentInteractions.put(4, alignedInteraction4);
        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 0, 0, 0, 1, 0, 0, 0, 0, "Burn sacred incense at the dawn of each solstice", "glowing with fragrant embers", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(4, 2, 1, 1, -6, 2, 0, 1, 0, 0, "Create a new work of masterful art", "trilling a heart-breakingly beautiful song", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(7, 2, 0, 0, 0, 1, 0, 0, 0, 0, "Plant and Reap a harvest for " + name + " to bless", "nesting amidst the twilight cedars", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 3, 0, 0, 0, 1, 0, 0, 0, 0, "Raise and burn an effigy of sacred timber and sacrifices", "swelling with fiery power", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "ever searching for new roosts", 0, 0, 0);
    }

    public Phoenix(String kamiName, String kamiSpecies) {
        super(kamiName, kamiSpecies);
        myPersonalInteractions.put(1, interactionA);
        myPersonalInteractions.put(2, interactionB);
        myPersonalInteractions.put(3, interactionC);
        myPersonalInteractions.put(4, interactionD);
        myAlignmentInteractions.put(1, alignedInteraction1);
        myAlignmentInteractions.put(2, alignedInteraction2);
        myAlignmentInteractions.put(3, alignedInteraction3);
        myAlignmentInteractions.put(4, alignedInteraction4);
        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 0, 0, 0, 1, 0, 0, 0, 0, "Burn sacred incense at the dawn of each solstice", "glowing with fragrant embers", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(4, 2, 1, 1, -6, 2, 0, 1, 0, 0, "Create a new work of masterful art", "trilling a heart-breakingly beautiful song", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(7, 2, 0, 0, 0, 1, 0, 0, 0, 0, "Plant and Reap a harvest for " + name + " to bless", "nesting amidst the twilight cedars", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 3, 0, 0, 0, 1, 0, 0, 0, 0, "Raise and burn an effigy of sacred timber and sacrifices", "swelling with fiery power", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "ever searching for new roosts", 0, 0, 0);
    }

    public void tick() {
        hunger++;
        boredom++;
        purity--;
        if (hunger > 5) {
            if (Math.random() + (hunger * 0.1) > 1) quintessence--;
            if (hunger > 10) hunger = 10;
        }
        if (purity < 5) {
            if (Math.random() + ((10 - purity) * 0.1) > 1) quintessence--;
            if (purity < 0) purity = 0;
        }
        if (intelligence < 0) intelligence = 0;
        if (discipline < 0) discipline = 0;
        if (loyalty < 0) loyalty = 0;
        if (boredom > 10) boredom = 10;
        if (boredom<0) boredom = 0;
        if (quintessence > ascendanceLevel) {
            if (hunger > 3) hunger = 3;
            if (purity < 8) purity = 8;
        }
    }

    @Override
    public void addPersonalInteraction(Interaction thisInteraction) {
        myPersonalInteractions.put(personalInteractionNumber, thisInteraction);
        personalInteractionNumber++;
    }

    @Override
    public void addIntrapersonalInteraction(Interaction thisInteraction) {
        myPersonalInteractions.put(intrapersonalInteractionNumber + 10, thisInteraction);
        intrapersonalInteractionNumber++;
    }

    @Override
    public void personalInteraction(int interactionKeyNumber) {
        if ((2 * loyalty + discipline + intelligence + quintessence + (10 - purity) - hunger - boredom - age * 0.5) * 10 + (Math.random() - 0.5) * 10 > getPersonalInteraction(interactionKeyNumber).getDifficulty()) {
            //Update Stats And React Properly
            hunger += myPersonalInteractions.get(interactionKeyNumber).getHungerChange();
            purity += myPersonalInteractions.get(interactionKeyNumber).getPurityChange();
            boredom += myPersonalInteractions.get(interactionKeyNumber).getBoredomChange();
            loyalty += myPersonalInteractions.get(interactionKeyNumber).getLoyaltyChange();
            intelligence += myPersonalInteractions.get(interactionKeyNumber).getIntelligenceChange();
            discipline += myPersonalInteractions.get(interactionKeyNumber).getDisciplineChange();

            //REMEMBER which action was taken last
            interactionTaken = myPersonalInteractions.get(interactionKeyNumber);
        } else {
            hunger += (int) (Math.random() - 0.3) * 2;
            purity -= (int) (Math.random() - 0.3) * 2;
            boredom += (int) (Math.random() - 0.3) * 2;
            loyalty -= (int) (Math.random() - 0.3) * 2;

            interactionTaken = failedInteraction;
        }
    }

    @Override
    public void intrapersonalInteraction(int interactionKeyNumber) {
        if ((2 * loyalty + discipline + intelligence + quintessence + (10 - purity) - hunger - boredom - age * 0.5) * 10 + (Math.random() - 0.5) * 10 > getPersonalInteraction(interactionKeyNumber).getDifficulty()) {
            //Update Stats And React Properly
            hunger += myIntrapersonalInteractions.get(interactionKeyNumber).getHungerChange();
            purity += myIntrapersonalInteractions.get(interactionKeyNumber).getPurityChange();
            boredom += myIntrapersonalInteractions.get(interactionKeyNumber).getBoredomChange();
            loyalty += myIntrapersonalInteractions.get(interactionKeyNumber).getLoyaltyChange();
            intelligence += myIntrapersonalInteractions.get(interactionKeyNumber).getIntelligenceChange();
            discipline += myIntrapersonalInteractions.get(interactionKeyNumber).getDisciplineChange();

            //REMEMBER which action was taken last
            interactionTaken = myIntrapersonalInteractions.get(interactionKeyNumber);
        } else {
            hunger += (int) (Math.random() - 0.3) * 2;
            purity -= (int) (Math.random() - 0.3) * 2;
            boredom += (int) (Math.random() - 0.3) * 2;
            loyalty -= (int) (Math.random() - 0.3) * 2;

            interactionTaken = failedInteraction;
        }
    }

    public void alignedInteraction(int interactionKeyNumber) {
        if ((2 * loyalty + discipline + intelligence + quintessence + (10 - purity) - hunger - boredom - age * 0.5) * 10 + (Math.random() - 0.5) * 10 > getPersonalInteraction(interactionKeyNumber).getDifficulty()) {
            //Update Stats And React Properly
            hunger += myAlignmentInteractions.get(interactionKeyNumber).getHungerChange();
            purity += myAlignmentInteractions.get(interactionKeyNumber).getPurityChange();
            boredom += myAlignmentInteractions.get(interactionKeyNumber).getBoredomChange();
            loyalty += myAlignmentInteractions.get(interactionKeyNumber).getLoyaltyChange();
            intelligence += myAlignmentInteractions.get(interactionKeyNumber).getIntelligenceChange();
            discipline += myAlignmentInteractions.get(interactionKeyNumber).getDisciplineChange();

            //REMEMBER which action was taken last
            interactionTaken = myAlignmentInteractions.get(interactionKeyNumber);
        } else {
            hunger += (int) (Math.random() - 0.3) * 2;
            purity -= (int) (Math.random() - 0.3) * 2;
            boredom += (int) (Math.random() - 0.3) * 2;
            loyalty -= (int) (Math.random() - 0.3) * 2;

            interactionTaken = failedInteraction;
        }
    }

    @Override
    public Interaction getAlignedInteraction(int interactionKeyNumber) {
        return myAlignmentInteractions.get(interactionKeyNumber);
    }

    @Override
    public Interaction getPersonalInteraction(int interactionKey) {
        return myPersonalInteractions.get(interactionKey);
    }

    @Override
    public Interaction getIntrapersonalInteraction(int interactionKey) {
        return myIntrapersonalInteractions.get(interactionKey);
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

    @Override
    public Interaction getInteractionTaken() {
        return interactionTaken;
    }

    @Override
    public void setInteractionTaken(Interaction interactionTaken) {
        this.interactionTaken = interactionTaken;
    }

    @Override
    public String getGoal() {
        return "bless sacred beginnings and instill them with vitality.";
    }
}
