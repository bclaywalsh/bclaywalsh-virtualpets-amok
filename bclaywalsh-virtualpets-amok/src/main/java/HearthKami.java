public class HearthKami extends AxiomaticKami implements Ethereal {
    private int potence;
    private int omnipresence;
    private Interaction failedInteraction;
    private Interaction ignoredInteraction;
    private int ascendanceLevel = 10;
    private String goal = "maintain a happy and healthy family of mortals.";
    private Interaction interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "patiently awaiting your instructions", 0, 0, 0);



    public HearthKami(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int potence, int omnipresence) {
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

        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 0, 1, -5, 1, 0, 0, 3, 2, "Provide " + name + " with insight into human affairs.", "telling stories of their family to any that will listen", 0, 0, 0));

        myIntrapersonalInteractions.put(2, new Interaction(4, 2, 1, 1, -10, 2, 0, 0, 2, 3, "Grant " + name + " access to the dreams of their family.", "looking ever more calm and insightful", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(7, 2, -1, 0, -10, 3, 0, 0, 3, 2, "Provide divine sanctions to increase the wealth and status of " + name + "'s family.", "dressed sharply, looking confident", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 3, 4, 3, -10, 2, 0, 0, 4, 3, "Inscribe a name of their families ancestor upon the jade walls of Yuu-shan. ", "is being elevated as an ancestral guardian and mentor", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "maintaining a busy household of lesser gods.", 0, 0, 0);
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
        return  "maintain a happy and healthy family of mortals.";
    }
}
