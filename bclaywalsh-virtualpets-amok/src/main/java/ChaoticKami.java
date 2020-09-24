public abstract class ChaoticKami extends Kami {
    protected Interaction alignedInteraction1;
    protected Interaction alignedInteraction2;
    protected Interaction alignedInteraction3;
    protected Interaction alignedInteraction4;

    public ChaoticKami(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        alignedInteraction1 = new Interaction(2, 1, 0, 1, -10, 0, 0, 0, 0, 1, "Perform acts of civic disruption ", " reveling in the wake of your disruptions", 0, 0, 0);
        alignedInteraction2 = new Interaction(4, 1, -1, 1, -5, 2, 0, 0, 1, 1, "Act as a conduit for the Kamis will ", " delighting in potency of your combined strengths", 0, 0, 0);
        alignedInteraction3 = new Interaction(6, 2, -1, 2, -5, 1, 0, 0, 3, 2, "Sever spiritual wards holding back the unseen realms ", " surging with fresh power", 0, 0, 0);
        alignedInteraction4 = new Interaction(8, 3, -2, 2, -10, 2, 0, 0, 3, 3, "Track and interdict the mandates of Takamagahara ", " growing stronger and more pure in the absence of heavenly mandates", 0, 0, 0);
    }

    public ChaoticKami(String kamiName, String kamiSpecies) {
        super(kamiName, kamiSpecies);
        alignedInteraction1 = new Interaction(2, 1, 0, 1, -10, 0, 0, 0, 0, 1, "Perform acts of civic disruption ", " reveling in the wake of your disruptions", 0, 0, 0);
        alignedInteraction2 = new Interaction(4, 1, -1, 1, -5, 2, 0, 0, 1, 1, "Act as a conduit for the Kamis will ", " delighting in potency of your combined strengths", 0, 0, 0);
        alignedInteraction3 = new Interaction(6, 2, -1, 2, -5, 1, 0, 0, 3, 2, "Sever spiritual wards holding back the unseen realms ", " surging with fresh power", 0, 0, 0);
        alignedInteraction4 = new Interaction(8, 3, -2, 2, -10, 2, 0, 0, 3, 3, "Track and interdict the mandates of Takamagahara ", " growing stronger and more pure in the absence of heavenly mandates", 0, 0, 0);
    }


}
