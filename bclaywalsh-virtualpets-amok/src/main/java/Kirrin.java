public class Kirrin extends NeutralKami implements Corporeal {
    public Kirrin(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int hunger, int purity) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        this.hunger = hunger;
        this.purity = purity;
        this.boredom = boredom;
        this.intelligence = intelligence;
        this.discipline = discipline;
        this.loyalty = loyalty;
        this.quintessence = quintessence;
        this.age = age;
        ascendanceLevel = 18;
        goal = "witness and channel profound acts of destiny in this world.";
        interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "watching intently the realm about them", 0, 0, 0);

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
        this.hunger = 3;
        this.purity = 9;
        this.boredom = 2;
        this.intelligence = 2;
        this.discipline = 3;
        this.loyalty = 2;
        this.quintessence = 2;
        this.age = 5;
        this.goal = "witness and channel profound acts of destiny in this world.";
        interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "watching intently the realm about them", 0, 0, 0);
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
}
