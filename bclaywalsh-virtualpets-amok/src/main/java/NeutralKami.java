public abstract class NeutralKami extends Kami{
    protected Interaction alignedInteraction1;
    protected Interaction alignedInteraction2;
    protected Interaction alignedInteraction3;
    protected Interaction alignedInteraction4;

    public NeutralKami(String kamiName, String kamiSpecies, int quintessence, int loyalty, int intelligence, int discipline, int boredom, int age) {
        super(kamiName, kamiSpecies, quintessence, loyalty, intelligence, discipline, boredom, age);
        alignedInteraction1 = new Interaction(2,0,0,0,0,0,0,0,0,0,"Retreat into a period of meditation "," adopting a state of peaceful seclusion ",0,0,0);
        alignedInteraction2 = new Interaction(4,0,0,0,0,0,0,0,0,0,"Mediate conflicts wherever you see them "," watching your efforts and reflecting them within their own realms",0,0,0);
        alignedInteraction3 = new Interaction(6,1,1,2,-10,2,0,0,0,0,"Bolster the strength of the a lowly challenger of established dominance"," shadowing your path and blessing your endeavors",0,0,0);
        alignedInteraction4 = new Interaction(8,2,0,0,0,0,0,0,0,0,"Balance the scales of power by any means necessary "," aiding your cause directly with their divine intercession",0,0,0);
    }
}
