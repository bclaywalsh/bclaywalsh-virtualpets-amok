public class Phoenix extends NeutralKami implements Corporeal {
    public Phoenix(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int hunger, int purity) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        this.hunger = hunger;
        this.purity = purity;
        this.quintessence = quintessence;
        this.loyalty = loyalty;
        this.intelligence = intelligence;
        this.discipline = discipline;
        this.boredom = boredom;
        this.age = age;
        ascendanceLevel = 20;
        goal = "bless sacred beginnings and instill them with vitality.";
        interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "pulling itself from a pile of smoldering ashes", 0, 0, 0);
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
        this.hunger = 3;
        this.purity = 10;
        this.boredom = 0;
        this.intelligence = 1;
        this.discipline = 3;
        this.loyalty = 1;
        this.quintessence = 5;
        this.age = 10;
        this.ascendanceLevel = 20;
        this.goal = "bless sacred beginnings and instill them with vitality.";
        interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "pulling itself from a pile of smoldering ashes", 0, 0, 0);
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
}
