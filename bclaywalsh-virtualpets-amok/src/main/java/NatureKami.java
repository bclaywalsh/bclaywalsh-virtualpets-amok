public class NatureKami extends ChaoticKami implements Ethereal {
    public NatureKami(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int potence, int omnipresence) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        this.potence = potence;
        this.omnipresence = omnipresence;
        this.quintessence = quintessence;
        this.loyalty = loyalty;
        this.intelligence = intelligence;
        this.discipline = discipline;
        this.boredom = boredom;
        this.age = age;
        this.alignment = "Chaotic";
        goal = "maintain and expand the natural order of the wilderness.";
        ascendanceLevel = 11;
        interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "playing made-up games amidst the sun-dappled grasses", 0, 0, 0);
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
        this.potence = 10;
        this.omnipresence = 8;
        this.boredom = 3;
        this.intelligence = 1;
        this.discipline = 0;
        this.loyalty = 0;
        this.quintessence = 3;
        this.age = 1;
        this.alignment = "Chaotic";
        this.goal = "maintain and expand the natural order of the wilderness.";
        interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "playing made-up games amidst the sun-dappled grasses", 0, 0, 0);
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
}
