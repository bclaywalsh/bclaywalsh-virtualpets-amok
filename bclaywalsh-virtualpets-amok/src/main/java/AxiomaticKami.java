public abstract class AxiomaticKami extends Kami {
    protected Interaction alignedInteraction1;
    protected Interaction alignedInteraction2;
    protected Interaction alignedInteraction3;
    protected Interaction alignedInteraction4;

    public AxiomaticKami(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        alignedInteraction1 = new Interaction(2, 1, 0, 1, -10, 0, 0, 0, 0, 0, "Aid the makers or enforcers of law within your realm ", " enjoying watching your efforts on behalf of the gods", 0, 0, 0);
        alignedInteraction2 = new Interaction(4, 1, 1, 0, -3, 0, 0, 0, 0, 0, "Take on a position of power and authority", " working in tandem with your efforts", 0, 0, 0);
        alignedInteraction3 = new Interaction(6, 2, 1, 2, -5, 2, 0, 0, 0, 0, "Inscribe the strictures of your Kami upon the walls of your temple ", " intermittently dwelling within your temples and acting as de-facto guardian", 0, 0, 0);
        alignedInteraction4 = new Interaction(8, 3, 3, 3, -10, 3, 0, 0, 0, 0, "Align your holdings and ventures in cadence with the celestial cogs of fate ", " aligning their ventures within their own realms with yours ", 0, 0, 0);
    }

    public AxiomaticKami(String kamiName, String kamiSpecies) {
        super(kamiName, kamiSpecies);
        alignedInteraction1 = new Interaction(2, 1, 0, 1, -10, 0, 0, 0, 0, 0, "Aid the makers or enforcers of law within your realm ", " enjoying watching your efforts on behalf of the gods", 0, 0, 0);
        alignedInteraction2 = new Interaction(4, 1, 1, 0, -3, 0, 0, 0, 0, 0, "Take on a position of power and authority", " working in tandem with your efforts", 0, 0, 0);
        alignedInteraction3 = new Interaction(6, 2, 1, 2, -5, 2, 0, 0, 0, 0, "Inscribe the strictures of your Kami upon the walls of your temple ", " intermittently dwelling within your temples and acting as de-facto guardian", 0, 0, 0);
        alignedInteraction4 = new Interaction(8, 3, 3, 3, -10, 3, 0, 0, 0, 0, "Align your holdings and ventures in cadence with the celestial cogs of fate ", " aligning their ventures within their own realms with yours ", 0, 0, 0);
    }
}
