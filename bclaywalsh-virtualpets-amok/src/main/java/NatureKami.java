public class NatureKami extends ChaoticKami implements Ethereal {
    private int potence = 10;
    private int omnipresence = 8;
    private int boredom = 3;
    private int intelligence = 1;
    private int discipline = 0;
    private int loyalty = 0;
    private int quintessence = 3;
    private int age = 1;
    private int ascendanceLevel = 11;

    private Interaction failedInteraction;
    private Interaction ignoredInteraction;
    private String goal = "maintain and expand the natural order of the wilderness.";
    private Interaction interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "playing made-up games amidst the sun-dappled grasses", 0, 0, 0);


    public NatureKami(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int potence, int omnipresence) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        this.potence = potence;
        this.omnipresence = omnipresence;

        myPersonalInteractions.put(1, interactionA);
        myPersonalInteractions.put(2, interactionB);
        myPersonalInteractions.put(3, interactionC);
        myPersonalInteractions.put(4, interactionD);
        myAlignmentInteractions.put(1, alignedInteraction1);
        myAlignmentInteractions.put(2, alignedInteraction2);
        myAlignmentInteractions.put(3, alignedInteraction3);
        myAlignmentInteractions.put(4, alignedInteraction4);
        myIntrapersonalInteractions.put(1, new Interaction(1, 1, -1, 1, -10, 2, 0, 0, 2, 1, "Play with " + name + " amidst the sun-dappled splendor of the garden.", "eagerly approaching you with mischief and fun in their eyes", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(4, 2, 2, 2, 0, 1, 0, 0, 2, 2, "Teach " + name + " about the natural cycles of the world.", "striding with purpose and greater clarity", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(7, 2, 1, 0, -2, 2, 0, 0, 5, 2, "Bless off a divine spirit tree within your garden in which " + name + " may reside", "growing vibrantly amidst the boughs of their spirit tree", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 3, 0, 0, -10, 3, 0, 0, 10, 10, "Grant " + name + " a boon of divine Mana.", "spreading roots of vitality deeply into the mortal realms", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to understand or follow your direction", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "Wandering the wilderness, hunting and singing", 0, 0, 0);
    }

    public NatureKami(String kamiName, String kamiSpecies) {
        super(kamiName, kamiSpecies);
        myPersonalInteractions.put(1, interactionA);
        myPersonalInteractions.put(2, interactionB);
        myPersonalInteractions.put(3, interactionC);
        myPersonalInteractions.put(4, interactionD);
        myAlignmentInteractions.put(1, alignedInteraction1);
        myAlignmentInteractions.put(2, alignedInteraction2);
        myAlignmentInteractions.put(3, alignedInteraction3);
        myAlignmentInteractions.put(4, alignedInteraction4);
        myIntrapersonalInteractions.put(1, new Interaction(1, 1, -1, 1, -10, 2, 0, 0, 2, 1, "Play with " + name + " amidst the sun-dappled splendor of the garden.", "eagerly approaching you with mischief and fun in their eyes", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(4, 2, 2, 2, 0, 1, 0, 0, 2, 2, "Teach " + name + " about the natural cycles of the world.", "striding with purpose and greater clarity", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(7, 2, 1, 0, -2, 2, 0, 0, 5, 2, "Bless off a divine spirit tree within your garden in which " + name + " may reside", "growing vibrantly amidst the boughs of their spirit tree", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 3, 0, 0, -10, 3, 0, 0, 10, 10, "Grant " + name + " a boon of divine Mana.", "spreading roots of vitality deeply into the mortal realms", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to understand or follow your direction", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "Wandering the wilderness, hunting and singing", 0, 0, 0);
    }

    public void tick() {
        potence--;
        boredom++;
        omnipresence--;
        if (potence < 5) {
            if (Math.random() + ((10 - potence) * 0.1) > 1) quintessence--;
            if (potence < 0) potence = 0;
        }
        if (omnipresence < 5) {
            if (Math.random() + ((10 - omnipresence) * 0.1) > 1) quintessence--;
            if (omnipresence < 0) omnipresence = 0;
        }
        if (intelligence < 0) intelligence = 0;
        if (discipline < 0) discipline = 0;
        if (loyalty < 0) loyalty = 0;
        if (boredom > 10) boredom = 10;
        if (quintessence > ascendanceLevel) {
            if (omnipresence < 8) omnipresence = 8;
            if (potence < 8) potence = 8;
        }
    }

    @Override
    public void addPersonalInteraction(Interaction thisInteraction) {

    }

    @Override
    public void addIntrapersonalInteraction(Interaction thisInteraction) {

    }

    @Override
    public void personalInteraction(int interactionKeyNumber) {
        if ((2 * loyalty + discipline + intelligence + quintessence + (10 - potence) - (10 - omnipresence) - boredom - age * 0.5) * 10 + (Math.random() - 0.5) * 10 > getPersonalInteraction(interactionKeyNumber).getDifficulty()) {
            //Update Stats And React Properly
            potence += myPersonalInteractions.get(interactionKeyNumber).getPotenceChange();
            omnipresence += myPersonalInteractions.get(interactionKeyNumber).getOmnipresenceChange();
            boredom += myPersonalInteractions.get(interactionKeyNumber).getBoredomChange();
            loyalty += myPersonalInteractions.get(interactionKeyNumber).getLoyaltyChange();
            intelligence += myPersonalInteractions.get(interactionKeyNumber).getIntelligenceChange();
            discipline += myPersonalInteractions.get(interactionKeyNumber).getDisciplineChange();

            //REMEMBER which action was taken last
            interactionTaken = myPersonalInteractions.get(interactionKeyNumber);
        } else {
            potence -= (int) (Math.random() - 0.3) * 2;
            omnipresence -= (int) (Math.random() - 0.3) * 2;
            boredom += (int) (Math.random() - 0.3) * 2;
            loyalty -= (int) (Math.random() - 0.3) * 2;

            interactionTaken = failedInteraction;
        }
    }

    @Override
    public void intrapersonalInteraction(int interactionKeyNumber) {
        if ((2 * loyalty + discipline + intelligence + quintessence + (10 - potence) - (10 - omnipresence) - boredom - age * 0.5) * 10 + (Math.random() - 0.5) * 10 > getPersonalInteraction(interactionKeyNumber).getDifficulty()) {
            //Update Stats And React Properly
            potence += myIntrapersonalInteractions.get(interactionKeyNumber).getPotenceChange();
            omnipresence += myIntrapersonalInteractions.get(interactionKeyNumber).getOmnipresenceChange();
            boredom += myIntrapersonalInteractions.get(interactionKeyNumber).getBoredomChange();
            loyalty += myIntrapersonalInteractions.get(interactionKeyNumber).getLoyaltyChange();
            intelligence += myIntrapersonalInteractions.get(interactionKeyNumber).getIntelligenceChange();
            discipline += myIntrapersonalInteractions.get(interactionKeyNumber).getDisciplineChange();

            //REMEMBER which action was taken last
            interactionTaken = myIntrapersonalInteractions.get(interactionKeyNumber);
        } else {
            potence -= (int) (Math.random() - 0.3) * 2;
            omnipresence -= (int) (Math.random() - 0.3) * 2;
            boredom += (int) (Math.random() - 0.3) * 2;
            loyalty -= (int) (Math.random() - 0.3) * 2;

            interactionTaken = failedInteraction;
        }
    }

    public void alignedInteraction(int interactionKeyNumber) {
        if ((2 * loyalty + discipline + intelligence + quintessence + (10 - potence) - (10 - omnipresence) - boredom - age * 0.5) * 10 + (Math.random() - 0.5) * 10 > getPersonalInteraction(interactionKeyNumber).getDifficulty()) {
            //Update Stats And React Properly
            potence += myAlignmentInteractions.get(interactionKeyNumber).getPotenceChange();
            omnipresence += myAlignmentInteractions.get(interactionKeyNumber).getOmnipresenceChange();
            boredom += myAlignmentInteractions.get(interactionKeyNumber).getBoredomChange();
            loyalty += myAlignmentInteractions.get(interactionKeyNumber).getLoyaltyChange();
            intelligence += myAlignmentInteractions.get(interactionKeyNumber).getIntelligenceChange();
            discipline += myAlignmentInteractions.get(interactionKeyNumber).getDisciplineChange();

            //REMEMBER which action was taken last
            interactionTaken = myAlignmentInteractions.get(interactionKeyNumber);
        } else {
            potence -= (int) (Math.random() - 0.3) * 2;
            omnipresence -= (int) (Math.random() - 0.3) * 2;
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
        return "maintain and expand the natural order of the wilderness.";
    }
}
