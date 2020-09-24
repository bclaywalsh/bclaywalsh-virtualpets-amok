public class CurseKami extends ChaoticKami implements Ethereal {
    public CurseKami(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age, int potence, int omnipresence) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        this.potence = potence;
        this.omnipresence = omnipresence;
        this.quintessence = quintessence;
        this.loyalty = loyalty;
        this.intelligence = intelligence;
        this.discipline = discipline;
        this.boredom = boredom;
        this.age = age;
        goal = "spread the misery and anger with which they are infected.";
        this.interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "watching you silently", 0, 0, 0);
        myPersonalInteractions.put(1, interactionA);
        myPersonalInteractions.put(2, interactionB);
        myPersonalInteractions.put(3, interactionC);
        myPersonalInteractions.put(4, interactionD);
        myAlignmentInteractions.put(1, alignedInteraction1);
        myAlignmentInteractions.put(2, alignedInteraction2);
        myAlignmentInteractions.put(3, alignedInteraction3);
        myAlignmentInteractions.put(4, alignedInteraction4);

        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 0, 1, -10, 1, 0, 0, 3, 2, "Listen and lend credence to the laments and tirades of " + name + ".", "staring darkly into the mortal realms", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(4, 2, 2, 1, 0, 1, 0, 0, 4, 2, "Erect a hidden shrine in the deepest shadows in which " + name + " can safely brood.", "coiling in the dark recesses of their shrine", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(7, 2, -2, 0, -10, 2, 0, 0, 5, 10, "Revoke and remove talismans of restraint barring " + name + "'s progress", "spreading virulently", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 3, 5, 3, 0, 3, 0, 0, 10, 10, "Offer up a sacrifice of purity to slake " + name + "'s hunger.", "swelling with malevolent power", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 1, -1, 0, 0, 2, 2, "", "wandering amidst the shadows of its domain, murmuring darkly to itself", 0, 0, 0);

    }

    public CurseKami(String kamiName, String kamiSpecies) {
        super(kamiName, kamiSpecies);
        this.potence = 10;
        this.omnipresence = 8;
        this.boredom = 2;
        this.intelligence = 3;
        this.discipline = 0;
        this.loyalty = 0;
        this.quintessence = 4;
        this.age = 3;
        this.ascendanceLevel = 15;
        this.goal = "spread the misery and anger with which they are infected.";
        this.interactionTaken = new Interaction(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "watching you silently", 0, 0, 0);

        myPersonalInteractions.put(1, interactionA);
        myPersonalInteractions.put(2, interactionB);
        myPersonalInteractions.put(3, interactionC);
        myPersonalInteractions.put(4, interactionD);
        myAlignmentInteractions.put(1, alignedInteraction1);
        myAlignmentInteractions.put(2, alignedInteraction2);
        myAlignmentInteractions.put(3, alignedInteraction3);
        myAlignmentInteractions.put(4, alignedInteraction4);

        myIntrapersonalInteractions.put(1, new Interaction(1, 1, 0, 1, -10, 1, 0, 0, 3, 2, "Listen and lend credence to the laments and tirades of " + name + ".", "staring darkly into the mortal realms", 0, 0, 0));
        myIntrapersonalInteractions.put(2, new Interaction(4, 2, 2, 1, 0, 1, 0, 0, 4, 2, "Erect a hidden shrine in the deepest shadows in which " + name + " can safely brood.", "coiling in the dark recesses of their shrine", 0, 0, 0));
        myIntrapersonalInteractions.put(3, new Interaction(7, 2, -2, 0, -10, 2, 0, 0, 5, 10, "Revoke and remove talismans of restraint barring " + name + "'s progress", "spreading virulently", 0, 0, 0));
        myIntrapersonalInteractions.put(4, new Interaction(10, 3, 5, 3, 0, 3, 0, 0, 10, 10, "Offer up a sacrifice of purity to slake " + name + "'s hunger.", "swelling with malevolent power", 0, 0, 0));
        //Failed to Heed your words
        failedInteraction = new Interaction(0, 0, (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * 1.7), (int) (Math.random() * -1.2), (int) (Math.random() * -1.2), 0, "", "returning diminished from a mysterious absence, having failed to fully take advantage of your aid", 0, 0, 0);
        ignoredInteraction = new Interaction(0, 0, 0, 0, 1, -1, 0, 0, 2, 2, "", "wandering amidst the shadows of its domain, murmuring darkly to itself", 0, 0, 0);
    }
}
