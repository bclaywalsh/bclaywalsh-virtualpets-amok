public class HearthKami extends AxiomaticKami implements Ethereal {
    public HearthKami(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int potence, int omnipresence) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        this.potence = potence;
        this.omnipresence = omnipresence;
        this.quintessence = quintessence;
        this.loyalty = loyalty;
        this.intelligence = intelligence;
        this.discipline = discipline;
        this.boredom = boredom;
        this.age = age;
        this.goal = "maintain a happy and healthy family of mortals.";
        this.interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "patiently awaiting your instructions", 0, 0, 0);
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

    public HearthKami(String kamiName, String kamiSpecies) {
        super(kamiName, kamiSpecies);
        this.potence = 8;
        this.omnipresence = 8;
        this.boredom = 2;
        this.intelligence = 3;
        this.discipline = 1;
        this.loyalty = 2;
        this.quintessence = 2;
        this.age = 0;
        this.ascendanceLevel = 8;
        this.goal = "maintain a happy and healthy family of mortals.";
        this.interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "patiently awaiting your instructions", 0, 0, 0);
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
}
