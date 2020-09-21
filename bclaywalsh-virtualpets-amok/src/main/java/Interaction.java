public class Interaction {
    private String text;
    private String reactionText;
    private int difficulty;
    private int powerCost;
    private int disciplineChange = 0;
    private int intelligenceChange = 0;
    private int boredomChange = 0;
    private int loyaltyChange = 0;
    private int hungerChange = 0;
    private int purityChange = 0;
    private int potenceChange = 0;
    private int omnipresenceChange = 0;
    private int requiredDiscipline = 0;
    private int requiredIntelligence = 0;
    private int requiredQuintessence = 0;



    public Interaction(int difficulty, int powerCost, int disciplineChange, int IntelligenceChange, int boredomChange, int loyaltyChange, int hungerChange, int purityChange, int potenceChange, int omnipresenceChange, String interactionString, String reactionString, int requiredDiscipline, int requiredIntelligence, int requiredQuintessence) {
        this.text = interactionString;
        this.reactionText = reactionString;
        this.difficulty = difficulty;
        this.powerCost = powerCost;
        this.disciplineChange = disciplineChange;
        this.intelligenceChange = IntelligenceChange;
        this.boredomChange = boredomChange;
        this.loyaltyChange = loyaltyChange;
        this.hungerChange = hungerChange;
        this.purityChange = purityChange;
        this.potenceChange = potenceChange;
        this.omnipresenceChange = omnipresenceChange;
        this.requiredDiscipline = requiredDiscipline;
        this.requiredIntelligence = requiredIntelligence;
        this.requiredQuintessence = requiredQuintessence;
    }


    public String toString(){
        return text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReactionText() {
        return reactionText;
    }

    public void setReactionText(String reactionText) {
        this.reactionText = reactionText;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getPowerCost() {
        return powerCost;
    }

    public void setPowerCost(int powerCost) {
        this.powerCost = powerCost;
    }

    public int getDisciplineChange() {
        return disciplineChange;
    }

    public void setDisciplineChange(int disciplineChange) {
        this.disciplineChange = disciplineChange;
    }

    public int getIntelligenceChange() {
        return intelligenceChange;
    }

    public void setIntelligenceChange(int intelligenceChange) {
        this.intelligenceChange = intelligenceChange;
    }

    public int getBoredomChange() {
        return boredomChange;
    }

    public void setBoredomChange(int boredomChange) {
        this.boredomChange = boredomChange;
    }

    public int getLoyaltyChange() {
        return loyaltyChange;
    }

    public void setLoyaltyChange(int loyaltyChange) {
        this.loyaltyChange = loyaltyChange;
    }

    public int getHungerChange() {
        return hungerChange;
    }

    public void setHungerChange(int hungerChange) {
        this.hungerChange = hungerChange;
    }

    public int getPurityChange() {
        return purityChange;
    }

    public void setPurityChange(int purityChange) {
        this.purityChange = purityChange;
    }

    public int getPotenceChange() {
        return potenceChange;
    }

    public void setPotenceChange(int potenceChange) {
        this.potenceChange = potenceChange;
    }

    public int getOmnipresenceChange() {
        return omnipresenceChange;
    }

    public void setOmnipresenceChange(int omnipresenceChange) {
        this.omnipresenceChange = omnipresenceChange;
    }

    public int getRequiredDiscipline() {
        return requiredDiscipline;
    }

    public void setRequiredDiscipline(int requiredDiscipline) {
        this.requiredDiscipline = requiredDiscipline;
    }

    public int getRequiredIntelligence() {
        return requiredIntelligence;
    }

    public void setRequiredIntelligence(int requiredIntelligence) {
        this.requiredIntelligence = requiredIntelligence;
    }

    public int getRequiredQuintessence() {
        return requiredQuintessence;
    }

    public void setRequiredQuintessence(int requiredQuintessence) {
        this.requiredQuintessence = requiredQuintessence;
    }
}
