public class Kirrin extends NeutralKami implements Corporeal {
    private int hunger;
    private int purity;
    private Interaction failedInteraction;
    private Interaction ignoredInteraction;
    private int ascendanceLevel = 13;
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
        myIntrapersonalInteractions.put(4, new Interaction(10, 4, 2, 1,-10, 4, -10, 10, 0, 0, "Grant " + name + "  a divine spark of destiny for them to carry into the world of mortals.", "witnessing and recording the impact of your divine spark upon their chosen one", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "silently wandering beyond the edges of vision", 0, 0, 0);
    }

    public void tick() {
        hunger++;
        boredom++;
        purity--;
        if(hunger>5){
            if(Math.random()+(hunger*0.1)>1) quintessence--;
            if (hunger>10) hunger=10;
        }
        if(purity<5){
            if(Math.random()+((10-purity)*0.1)>1) quintessence--;
            if(purity<0) purity=0;
        }
        if(intelligence<0) intelligence=0;
        if(discipline<0) discipline=0;
        if(loyalty<0) loyalty=0;
        if(boredom>10) boredom=10;
        if(quintessence>ascendanceLevel){
            if(hunger>3) hunger = 3;
            if(purity<8) purity = 8;
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

    @Override
    public void alignedInteraction(int interactionKeyNumber) {

    }

    @Override
    public Interaction getPersonalInteraction(int interactionKey) {
        return null;
    }

    @Override
    public Interaction getIntrapersonalInteraction(int interactionKey) {
        return null;
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
    public String getGoal() {
        return "witness and channel profound acts of destiny in this world.";
    }
}
