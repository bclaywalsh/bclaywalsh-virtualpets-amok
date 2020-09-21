public class Dragon extends AxiomaticKami implements Corporeal {
    private int hunger;
    private int purity;
    private Interaction failedInteraction;
    private Interaction ignoredInteraction;
    private int ascendanceLevel = 23;
    private String goal = "rule over all it sees, and to profit in all ways.";
    private Interaction interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "paying rapt attention to you", 0, 0, 0);




    public Dragon(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int hunger, int purity) {
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

        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 0, 0, 0, 1, 0, 2, 0, 0, "Offer " +name + " a token of respect upon each sign of their passing.", "casting their eye favorably upon you", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(7, 3, 2, 2, -5, 1, -2, 2, 0, 0, "Advance the divine rank of " + name + ", placing more lesser Kami beneath them.", "swelling the ranks of their coterie", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(8, 4, 3, 3, -5, 1, -10, 10, 0, 0, "Construct a temple in which " + name + " is followed.", "coiling majestically around the spires of their temple", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 1, 1, 3, -10, 5, -10, 10, 0, 0, "Bind yourself to " + name + "'s will for a year and a day as their celestial agent.", "striding the land and sky with unmatched majesty", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 1, -1, 1, 0, 0, 0, "", "bringing order to all that they see, yet growing frustrated", 0, 0, 0);
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
        return "rule over all it sees, and to profit in all ways.";
    }
}
