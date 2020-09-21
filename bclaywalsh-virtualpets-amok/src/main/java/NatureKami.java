public class NatureKami extends ChaoticKami implements Ethereal {
    private int potence;
    private int omnipresence;
    private Interaction failedInteraction;
    private Interaction ignoredInteraction;
    private int ascendanceLevel = 9;
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

    public void tick() {
        potence--;
        boredom++;
        omnipresence--;
        if(potence<5){
            if(Math.random()+((10-potence)*0.1)>1) quintessence--;
            if (potence<0) potence=0;
        }
        if(omnipresence<5){
            if(Math.random()+((10-omnipresence)*0.1)>1) quintessence--;
            if(omnipresence<0) omnipresence=0;
        }
        if(intelligence<0) intelligence=0;
        if(discipline<0) discipline=0;
        if(loyalty<0) loyalty=0;
        if(boredom>10) boredom=10;
        if(quintessence>ascendanceLevel){
            if(omnipresence<8) omnipresence = 8;
            if(potence<8) potence = 8;
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
    public String getGoal() {
        return "maintain and expand the natural order of the wilderness.";
    }
}
