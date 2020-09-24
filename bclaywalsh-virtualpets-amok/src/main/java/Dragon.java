public class Dragon extends AxiomaticKami implements Corporeal {
    public Dragon(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int hunger, int purity) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        this.hunger = hunger;
        this.purity = purity;
        this.quintessence = quintessence;
        this.loyalty = loyalty;
        this.intelligence = intelligence;
        this.discipline = discipline;
        this.boredom = boredom;
        this.age = age;
        this.ascendanceLevel = 23;
        goal = "rule over all it sees, and to profit in all ways.";
        this.interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "paying rapt attention to you", 0, 0, 0);
        myPersonalInteractions.put(1, interactionA);
        myPersonalInteractions.put(2, interactionB);
        myPersonalInteractions.put(3, interactionC);
        myPersonalInteractions.put(4, interactionD);
        myAlignmentInteractions.put(1, alignedInteraction1);
        myAlignmentInteractions.put(2, alignedInteraction2);
        myAlignmentInteractions.put(3, alignedInteraction3);
        myAlignmentInteractions.put(4, alignedInteraction4);

        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 0, 0, 0, 1, 0, 2, 0, 0, "Offer " + name + " a token of respect upon each sign of their passing.", "casting their eye favorably upon you", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(7, 3, 2, 2, -5, 1, -2, 2, 0, 0, "Advance the divine rank of " + name + ", placing more lesser Kami beneath them.", "swelling the ranks of their coterie", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(8, 4, 3, 3, -5, 1, -10, 10, 0, 0, "Construct a temple in which " + name + " is followed.", "coiling majestically around the spires of their temple", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 1, 1, 3, -10, 5, -10, 10, 0, 0, "Bind yourself to " + name + "'s will for a year and a day as their celestial agent.", "striding the land and sky with unmatched majesty", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 1, -1, 1, 0, 0, 0, "", "bringing order to all that they see, yet growing frustrated", 0, 0, 0);
    }

    public Dragon(String kamiName, String kamiSpecies) {
        super(kamiName, kamiSpecies);
        this.hunger = 5;
        this.purity = 10;
        this.boredom = 2;
        this.intelligence = 3;
        this.discipline = 3;
        this.loyalty = 0;
        this.quintessence = 5;
        this.age = 5;
        this.ascendanceLevel = 23;
        myPersonalInteractions.put(1, interactionA);
        myPersonalInteractions.put(2, interactionB);
        myPersonalInteractions.put(3, interactionC);
        myPersonalInteractions.put(4, interactionD);
        myAlignmentInteractions.put(1, alignedInteraction1);
        myAlignmentInteractions.put(2, alignedInteraction2);
        myAlignmentInteractions.put(3, alignedInteraction3);
        myAlignmentInteractions.put(4, alignedInteraction4);

        goal = "rule over all it sees, and to profit in all ways.";
        this.interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "paying rapt attention to you", 0, 0, 0);
        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 0, 0, 0, 1, 0, 2, 0, 0, "Offer " + name + " a token of respect upon each sign of their passing.", "casting their eye favorably upon you", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(7, 3, 2, 2, -5, 1, -2, 2, 0, 0, "Advance the divine rank of " + name + ", placing more lesser Kami beneath them.", "swelling the ranks of their coterie", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(8, 4, 3, 3, -5, 1, -10, 10, 0, 0, "Construct a temple in which " + name + " is followed.", "coiling majestically around the spires of their temple", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 1, 1, 3, -10, 5, -10, 10, 0, 0, "Bind yourself to " + name + "'s will for a year and a day as their celestial agent.", "striding the land and sky with unmatched majesty", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 1, -1, 1, 0, 0, 0, "", "bringing order to all that they see, yet growing frustrated", 0, 0, 0);
    }
}
