import java.util.Scanner;

public class GardenOfShinkaiApp {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        String inputStr = "";
        Scanner inputInteger = new Scanner(System.in);
        int inputInt = 0;

        int command = 7;
        String newPetSelection = "";
        String newPetName = "";
        boolean areYouSureA = false;
        boolean areYouSureB = false;
        boolean areYouSureC = false;
        boolean addingAPet = false;

        Garden myGarden = new Garden();
        myGarden.generateStartingKami();

        //GAME INTRO
        System.out.println("\n      (>   -   -   ((> GARDEN OF SHINKAI <))   -   -   <)");
        System.out.println("                     -Benjamin Walsh 9/21/20-\n");
        System.out.println("In a place of timelessness, in a realm of hidden power, the Garden of Shinkai stands.\nThe garden calls to Kami lost, the garden cares for Kami low.\nOnce per year in this shining land, the gates to the Center Kingdom are thrown open and Kami come and go as they please.\n");
        System.out.println("As a spirit guardian, it is your task to assist and guide the Kami under your care.\nOnce per year you can interact with your spirit friends and help them along their path.");
        System.out.println("The day of awakenings has come once more. Extend your will outward into the neighboring realms, shape destiny with your own two hands.");
        System.out.println("\n- - - ->) Three Kami spirits have found themselves within the bounds of your garden. Do as you will. (<- - - -");

        //MAIN LOOP
        while (command != 6 && inputStr != "quit") {
            addingAPet = false;

            // PROGRESS REPORT
            System.out.println("\n-))~------------------------------------------------------------------------------------~~~~~~~~~~~~~~~/~/~/");
            System.out.println("((>=================================================================================================================/");
            System.out.println("Your karma is rank (" + myGarden.getKarma() + ") and in this span you have (" + myGarden.getPower() + ") thaums of power.");
            System.out.println("It is a new year, and new opportunities have emerged to shape destiny.");
            System.out.println("((>=============================================================================================================/");
            System.out.println("-))~------------------------------------------------------------------------------------~~///(\n");

            for (Kami kami : myGarden.getGardenKami().values()) {
                if (kami.getQuintessence() <= 0) {
                    System.out.println("--+x+x+x+---------------------- --- --- -- -- - - -  -  -  -   -   -  -");
                    System.out.println(kami.getName() + "'s quintessence has dissolved, and been lost among the mists.");
                    System.out.println("   ->) Karma: -1");
                    System.out.println("--+x+x+x+---------------------- --- --- -- -- - - -  -  -  -   -   -  -");
                    myGarden.setKarma(myGarden.getKarma() - 1);
                    myGarden.release(kami.getName());
                    break;
                }
                System.out.println("=========================================================================================================================<))");
                System.out.println("Name: " + kami.getName() + "\t\tSpecies: " + kami.getSpecies() + "\t\tGoal: " + kami.getGoal());
                System.out.println(kami.getName() + " is now " + kami.getAge() + " spans old and is a rank " + kami.getQuintessence() + " god.");
                //System.out.println("          " + kami.getName() + " is " + kami.getInteractionTaken().getReactionText() + ".");
                System.out.println("    ~~~~--------------------------------------------------------------------------------------~~~~");
                System.out.println("     Hunger: " + kami.getHunger() + "\t||\tBoredom: " + kami.getBoredom() + "\t\t||\tLoyalty: " + kami.getLoyalty());
                System.out.println("Intelligence: " + kami.getIntelligence() + "\t||\tDiscipline: " + kami.getDiscipline() + "\t||\tQuintessence: " + kami.getQuintessence());
                System.out.println("      ~~~~--------------------------------------------------------------------------------------~~~~");
                if (kami.getQuintessence() < 2) {
                    System.out.println("The Quintessence of " + kami.getName() + " is very low. If the Quintessence of a kami reaches zero, they will fade to nothing.");
                }
                System.out.println("\n-------------------------------------------------------------------------------------------------~~");
            }


            myGarden.generateChoices();
            do {
                command = 7;
                System.out.println("You have ( " + myGarden.getPower() + " ) power remaining for this span.");
                System.out.println("enter 1 to: " + myGarden.getGlobalChoiceAString() + " (1 thaum)");
                System.out.println(" enter 2 to: " + myGarden.getGlobalChoiceBString() + " (1 thaum)");
                System.out.println("  enter 3 to: Focus your powers on a particular kami. (variable thaums)");
                System.out.println("   enter 4 to: Summon forth a new kami into your garden. (1 thaum)");
                System.out.println("    enter 5 to: Release a kami from your care. The happiness of a released kami will add or subtract from your karma.");
                System.out.println("\n_______________________________________________________");
                System.out.println("  enter 6 to end the current span.");
                System.out.println(" enter 0 to escape your divine obligations.");

                command = inputInteger.nextInt();
                if (command == 0) System.exit(0);
                areYouSureA = false;
                areYouSureB = false;
                areYouSureC = false;

                //RANDOM GLOBAL OPTION 1
                if (command == 1) {
                    if (myGarden.getGlobalChoiceA() == 1) myGarden.cultivateGarden();
                    else if (myGarden.getGlobalChoiceA() == 2) myGarden.callRain();
                    else if (myGarden.getGlobalChoiceA() == 3) myGarden.tollBell();
                    else if (myGarden.getGlobalChoiceA() == 4) myGarden.openGates();
                    else if (myGarden.getGlobalChoiceA() == 5) myGarden.harvestGarden();
                    myGarden.setPower(myGarden.getPower()-1);
                }

                //RANDOM GLOBAL OPTION 2
                if (command == 2) {
                    if (myGarden.getGlobalChoiceB() == 1) myGarden.cultivateGarden();
                    else if (myGarden.getGlobalChoiceB() == 2) myGarden.callRain();
                    else if (myGarden.getGlobalChoiceB() == 3) myGarden.tollBell();
                    else if (myGarden.getGlobalChoiceB() == 4) myGarden.openGates();
                    else if (myGarden.getGlobalChoiceB() == 5) myGarden.harvestGarden();
                    myGarden.setPower(myGarden.getPower()-1);
                }

                //FOCUS WILL ON ONE KAMI
                if (command ==3){
                    areYouSureA=false;
                    while (!areYouSureA){
                        System.out.println("Which Kami would you like to approach?\n   ->) enter its name below or enter 'back'");
                        String kamiName = inputString.nextLine().trim();
                        if (kamiName.equals("back")) break;
                        else if (myGarden.getGardenKami().containsKey(kamiName)){
                            myGarden.getGardenKami().get(kamiName).generateChoices();
                            myGarden.focusWill(kamiName);
                            areYouSureA=true;
                        }
                        else {
                            System.out.println("There is no Kami in your garden which answers to that name, \nplease enter a another name below (capitalization matters) or enter 'back'");
                        }
                    }
                }

                //SUMMON NEW KAMI
                if (command==4){
                    areYouSureA=false;
                    areYouSureB=false;
                    while (!areYouSureA){
                        while (!areYouSureB){
                            System.out.println("What manner of Kami are you intent on summoning?");
                            System.out.println("   Hearth Kami\t\tNature Kami\t\tCurse Kami");
                            System.out.println("     Kirrin\t\tPhoenix\t\tDragon");
                            String kamiSpecies = inputString.nextLine();
                        }

                    }

                }


                if (myGarden.getPower() <= 0){
                    System.out.println("Your power has been expended, and whether you wish it or not you must now rest.");
                    break;}
            } while (command != 6 && myGarden.getPower() > 0);
        }
    }
}
