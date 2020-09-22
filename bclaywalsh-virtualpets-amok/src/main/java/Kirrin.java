public class Kirrin extends NeutralKami implements Corporeal {
    private int hunger = 3;
    private int purity = 9;
    private int boredom = 2;
    private int intelligence = 2;
    private int discipline = 3;
    private int loyalty = 2;
    private int quintessence = 2;
    private int age = 5;
    private int ascendanceLevel = 18;
    private Interaction failedInteraction;
    private Interaction ignoredInteraction;
    private String goal = "witness and channel profound acts of destiny in this world.";
    private Interaction interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "watching intently the realm about them", 0, 0, 0);


    public Kirrin(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int hunger, int purity) {
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
        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 1, 1, -3, 0, 0, 0, 0, 0, "Offer advice about the mortal realms", "watching with keen interest the interplay of gods and men", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(4, 1, 1, 3, -10, 1, 0, 2, 0, 0, "Speak with " + name + " at length about a powerful moment in your existence, and the impacts it had.", "silently trailing your steps from a distance", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(7, 2, 2, 1, -10, 2, 0, 5, 0, 0, "Secure a divine contract for " + name + " to fulfill", "traveling the realms with strength and purpose", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 4, 2, 1, -10, 4, -10, 10, 0, 0, "Grant " + name + "  a divine spark of destiny for them to carry into the world of mortals.", "witnessing and recording the impact of your divine spark upon their chosen one", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "silently wandering beyond the edges of vision", 0, 0, 0);
    }

    public Kirrin(String kamiName, String kamiSpecies) {
        super(kamiName, kamiSpecies);
        myPersonalInteractions.put(1, interactionA);
        myPersonalInteractions.put(2, interactionB);
        myPersonalInteractions.put(3, interactionC);
        myPersonalInteractions.put(4, interactionD);
        myAlignmentInteractions.put(1, alignedInteraction1);
        myAlignmentInteractions.put(2, alignedInteraction2);
        myAlignmentInteractions.put(3, alignedInteraction3);
        myAlignmentInteractions.put(4, alignedInteraction4);
        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 1, 1, -3, 0, 0, 0, 0, 0, "Offer advice about the mortal realms", "watching with keen interest the interplay of gods and men", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(4, 1, 1, 3, -10, 1, 0, 2, 0, 0, "Speak with " + name + " at length about a powerful moment in your existence, and the impacts it had.", "silently trailing your steps from a distance", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(7, 2, 2, 1, -10, 2, 0, 5, 0, 0, "Secure a divine contract for " + name + " to fulfill", "traveling the realms with strength and purpose", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 4, 2, 1, -10, 4, -10, 10, 0, 0, "Grant " + name + "  a divine spark of destiny for them to carry into the world of mortals.", "witnessing and recording the impact of your divine spark upon their chosen one", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "silently wandering beyond the edges of vision", 0, 0, 0);
    }

    public void tick() {
        this.hunger++;
        this.boredom++;
        this.purity--;
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
        if (quintessence > ascendanceLevel) {
            if (hunger > 3) hunger = 3;
            if (purity < 8) purity = 8;
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

    }

    @Override
    public void intrapersonalInteraction(int interactionKeyNumber) {

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
        return "witness and channel profound acts of destiny in this world.";
    }
}
