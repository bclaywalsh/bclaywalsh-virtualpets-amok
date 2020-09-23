import java.util.Scanner;

public class GardenOfShinkaiApp {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        String inputStr = "";
        Scanner inputInteger = new Scanner(System.in);
        int inputInt = 0;

        int command = 7;
        int subcommand = 0;
        String newKamiSpecies = "";
        String newKamiName = "";
        boolean areYouSureA = false;
        boolean areYouSureB = false;
        boolean areYouSureC = false;
        boolean addingAPet = false;

        Garden myGarden = new Garden();
        myGarden.generateStartingKami();

        //GAME INTRO
        System.out.println("\n      (>   -   -   ((> GARDEN OF SHINKAI <))   -   -   <)");
        System.out.println("                    -Benjamin Walsh 9/21/20-\n");
        System.out.println("In a place of timelessness, in a realm of hidden power, the Garden of Shinkai stands.\nThe garden calls to Kami lost, the garden cares for Kami low.\nOnce per celestial cycle in this shining land, the gates to the Center Kingdom are thrown open and Kami come and go as they please.\n");
        System.out.println("As a spirit guardian, it is your task to assist and guide the Kami under your care.\nOnce per cycle you can interact with your spirit friends and help them along their path.");
        System.out.println("The day of awakenings has come once more. Extend your will outward into the neighboring realms, shape destiny with your own two hands.");
        System.out.println("\n- - - ->) Three Kami spirits have found themselves within the bounds of your garden. Do as you will. (<- - - -");

        //MAIN LOOP
        while (command != 0 && inputStr != "quit") {
            addingAPet = false;

            // PROGRESS REPORT
            System.out.println("\n-))~------------------------------------------------------------------------------------~~~~~~~~~~~~~~~/~/~/");
            System.out.println("((>=================================================================================================================/");
            System.out.println("Your karma is rank (" + myGarden.getKarma() + ") and in this cycle you have (" + myGarden.getPower() + ") thaums of power.");
            System.out.println("It is a new cycle, and new opportunities have emerged to shape destiny.");
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
                System.out.println(kami.getName() + " is now " + kami.getAge() + " cycles old and is a rank " + kami.getQuintessence() + " god.");
                //System.out.println("          " + kami.getName() + " is " + kami.getInteractionTaken().getReactionText() + ".");          //  InteractionTaken
                System.out.println("    ~~~~--------------------------------------------------------------------------------------~~~~");
                if (kami instanceof Corporeal) {
                    System.out.println(" --->) *Hunger: " + kami.getHunger() + "*\t||\t*Purity: " + kami.getPurity() + "*\t||\t*Boredom: " + kami.getBoredom() + "* (<---");
                } else {
                    System.out.println(" --->) *Potence: " + kami.getPotence() + "*\t||\t*Omnipresence: " + kami.getOmnipresence() + "*\t||\t*Boredom: " + kami.getBoredom() + "* (<---");
                }
                System.out.println("\tIntelligence: " + kami.getIntelligence() + "\t||\tDiscipline: " + kami.getDiscipline() + "\t||\tLoyalty: " + kami.getLoyalty());
                System.out.println("     --->)| Quintessence: " + kami.getQuintessence() + "\t||\tAscension Threshold: " + kami.getAscendanceLevel() + " |(<---");
                System.out.println("      ~~~~--------------------------------------------------------------------------------------~~~~");

                // DIRE WARNINGS OF PERIL
                if (kami.getQuintessence() < 2) {
                    System.out.println("*** " + kami.getName() + " is barely clinging to to their existence and desperately needs attention.");
                }
                if (kami instanceof Corporeal) {
                    if (kami.getHunger() > 4) {
                        System.out.println("* " + kami.getName() + " seems to be more gaunt than usual.");
                    }
                    if (kami.getPurity() < 7) {
                        System.out.println("* " + kami.getName() + " is losing their luster.");
                    }
                } else {
                    if (kami.getPotence() < 7) {
                        System.out.println("* " + kami.getName() + " is struggling to bring their force to bear.");
                    }
                    if (kami.getOmnipresence() < 7) {
                        System.out.println("* " + kami.getName() + " appears smaller, and somehow more closed off than is usual.");
                    }
                }
                System.out.println("\n-------------------------------------------------------------------------------------------------~~");
            }

            myGarden.generateChoices();
            for (Kami kami : myGarden.getGardenKami().values()) {
                kami.setInteractionTaken(kami.getIgnoredInteraction());
            }
            do {
                command = 7;
                System.out.println("You have ( " + myGarden.getPower() + " ) power remaining for this cycle.");
                System.out.println("enter 1 to: " + myGarden.getGlobalChoiceAString() + " (1 thaum)");
                System.out.println(" enter 2 to: " + myGarden.getGlobalChoiceBString() + " (1 thaum)");
                System.out.println("  enter 3 to: Focus your powers on a particular kami. (variable thaums)");
                System.out.println("   enter 4 to: Summon forth a new kami into your garden. (1 thaum)");
                System.out.println("    enter 5 to: Release a kami from your care. The happiness of a released kami will add or subtract from your karma.");
                System.out.println("\n_______________________________________________________");
                System.out.println("  enter 6 to end the current cycle.");
                System.out.println(" enter 0 to escape your divine obligations.");

                command = inputInteger.nextInt();
                if (command == 0) System.exit(0);

                //RANDOM GLOBAL OPTION 1
                if (command == 1) {
                    if (myGarden.getGlobalChoiceA() == 1) myGarden.cultivateGarden();
                    else if (myGarden.getGlobalChoiceA() == 2) myGarden.callRain();
                    else if (myGarden.getGlobalChoiceA() == 3) myGarden.tollBell();
                    else if (myGarden.getGlobalChoiceA() == 4) myGarden.openGates();
                    else if (myGarden.getGlobalChoiceA() == 5) myGarden.harvestGarden();
                    myGarden.changePower(-1);
                }

                //RANDOM GLOBAL OPTION 2
                if (command == 2) {
                    if (myGarden.getGlobalChoiceB() == 1) myGarden.cultivateGarden();
                    else if (myGarden.getGlobalChoiceB() == 2) myGarden.callRain();
                    else if (myGarden.getGlobalChoiceB() == 3) myGarden.tollBell();
                    else if (myGarden.getGlobalChoiceB() == 4) myGarden.openGates();
                    else if (myGarden.getGlobalChoiceB() == 5) myGarden.harvestGarden();
                    myGarden.changePower(-1);
                }

                //FOCUS WILL ON ONE KAMI
                if (command == 3) {
                    areYouSureA = false;
                    areYouSureB = false;
                    areYouSureC = false;
                    while (!areYouSureA) {
                        System.out.println(myGarden.getGardenKami());
                        System.out.println("Which Kami would you like to approach?\n   ->) enter its name below or enter 'back'");
                        String kamiName = inputString.nextLine().trim();
                        if (kamiName.equals("back")) break;
                        else if (myGarden.getGardenKami().containsKey(kamiName)) {
                            myGarden.getGardenKami().get(kamiName).generateChoices();
                            myGarden.focusWill(kamiName);
                            areYouSureA = true;
                        } else {
                            System.out.println("There is no Kami in your garden which answers to that name, \nplease enter a another name below (capitalization matters) or enter 'back'");
                        }
                    }
                }

                //SUMMON NEW KAMI
                if (command == 4 && !addingAPet) {
                    areYouSureA = false;
                    areYouSureB = false;
                    areYouSureC = false;
                    while (!areYouSureA) {
                        while (!areYouSureB) {
                            System.out.println("What manner of Kami are you intent on summoning?");
                            System.out.println("   Hearth Kami\t\tNature Kami\t\tCurse Kami");
                            System.out.println("     Kirrin\t\t\tPhoenix\t\tDragon");
                            String kamiSpecies = inputString.nextLine().toLowerCase().trim();
                            areYouSureB = true;
                            if (kamiSpecies.equals("hearth") || kamiSpecies.equals("hearth kami")) {
                                System.out.println("The Hearth Kami is an orderly and ethereal spirit whose overriding reason for existing is it's drive to ensure that the home and family over which it watches is healthy, happy, and prosperous.");
                                newKamiSpecies = "Hearth Kami";
                            } else if (kamiSpecies.equals("nature") || kamiSpecies.equals("nature kami")) {
                                System.out.println("The Nature Kami is an ethereal and chaotic spirit which watches over the natural world and its cycles, which grow and thrive with it.");
                                newKamiSpecies = "Nature Kami";
                            } else if (kamiSpecies.equals("curse") || kamiSpecies.equals("curse kami")) {
                                System.out.println("The Curse Kami is a malevolent and chaotic ethereal spirit of anger and frustration, ever seeking to spread it's curse and misery.");
                                newKamiSpecies = "Curse Kami";
                            } else if (kamiSpecies.equals("dragon")) {
                                System.out.println("The Dragon is a corporeal kami of ultimate order. Its everlasting goal is to destroy chaos in all forms and dominate all it sees before it.");
                                newKamiSpecies = "Dragon";
                            } else if (kamiSpecies.equals("kirrin")) {
                                System.out.println("The Kirrin is a mysterious and majestic corporeal beast. Lesser Kirrin serve as scribes and witnesses to the divine implementations of fate. Greater Kirrin seek to bring balance to the world under their own volition.");
                                newKamiSpecies = "Kirrin";
                            } else if (kamiSpecies.equals("phoenix")) {
                                System.out.println("The Phoenix is an elegant bird of eternally renewing life. The Phoenix is born at the start of something great, blessing each portentous beginning it witnesses.");
                                newKamiSpecies = "Phoenix";
                            } else {
                                System.out.println("That particular variety of Kami is unknown, please try again.");
                                areYouSureB = false;
                            }
                        }
                        System.out.println("Is this the Kami which you seek to summon into your garden? 1 = Yes, 2 = No");
                        subcommand = inputInteger.nextInt();

                        // YES I WANT THAT KAMI!
                        if (subcommand == 1) {
                            areYouSureA = true;
                            if (Math.random() == 0.7 || newKamiSpecies.equals("Curse Kami")) {
                                myGarden.summon(new CurseKami("nameless", "Curse Kami"), "nameless");
                            } else if (newKamiSpecies.equals("Hearth Kami")) {
                                myGarden.summon(new HearthKami("nameless", "Hearth Kami"), "nameless");
                            } else if (newKamiSpecies.equals("Nature Kami")) {
                                myGarden.summon(new NatureKami("nameless", "Nature Kami"), "nameless");
                            } else if (newKamiSpecies.equals("Kirrin")) {
                                myGarden.summon(new Kirrin("nameless", "kirrin"), "nameless");
                            } else if (newKamiSpecies.equals("Dragon")) {
                                myGarden.summon(new Dragon("nameless", "Dragon"), "nameless");
                            } else if (newKamiSpecies.equals("Phoenix")) {
                                myGarden.summon(new Phoenix("nameless", "Phoenix"), "nameless");
                            }
                        } else {
                            areYouSureA = false;
                            System.out.println("take your time, this is a fateful decision.");
                        }

                        //AND I SHALL NAME IT....BOB
                        areYouSureC = false;
                        while (!areYouSureC) {
                            System.out.println("What shall you name this " + newKamiSpecies + "?");
                            newKamiName = inputString.nextLine().trim();
                            System.out.println(newKamiName + ". Are you sure? (enter 1 to continue or any other input to enter something else)");
                            inputInt = inputInteger.nextInt();
                            if (inputInt == 1) {
                                areYouSureC = true;
                                Kami newKami = myGarden.getKami("nameless");
                                newKami.setName(newKamiName);
                                System.out.println("\nKami of your garden: " + myGarden.getGardenKami() + "\n");
                            }
                        }
                    }
                } else if (command == 4 && addingAPet) {
                    System.out.println("You can only summon One Kami per cycle");
                }

                //RELEASE A KAMI
                if (command == 5) {
                    areYouSureA = false;
                    areYouSureB = false;
                    areYouSureC = false;
                    inputStr = "";
                    String kamiToRelease;
                    while (!areYouSureA) {
                        System.out.println("Which Kami shall you release from your garden?");
                        System.out.println(myGarden.getGardenKami());
                        kamiToRelease = inputString.nextLine();
                        Kami thisKami = myGarden.getKami(kamiToRelease);
                        if (myGarden.getGardenKami().containsKey(kamiToRelease)) {
                            System.out.println(kamiToRelease + ", Quintessence: " + thisKami.getQuintessence());
                            System.out.println("Are you sure? (1 = Yes, 2 = No)");
                            inputInt = inputInteger.nextInt();

                            // RELEASE THE KAMI!!!  ...and determine how much karma you get for it.
                            if (inputInt == 1) {
                                areYouSureA = true;
                                myGarden.release(kamiToRelease);
                                int karmaChange = (int) ((thisKami.getQuintessence() * 2 / (thisKami.getAge() + 2 * (Math.random() - 1))));
                                myGarden.setKarma(myGarden.getKarma() + karmaChange);
                                if (karmaChange > 1)
                                    System.out.println("The " + thisKami.getSpecies() + " " + thisKami.getName() + " has moved on to other realms, and blesses you bounteously for your help.");
                                else if (karmaChange > 0)
                                    System.out.println("The " + thisKami.getSpecies() + " " + thisKami.getName() + " has moved on to other realms, and thanks you courteously for your help.");
                                else if (karmaChange == 0)
                                    System.out.println("The " + thisKami.getSpecies() + " " + thisKami.getName() + " has moved on to other realms.");
                                else if (karmaChange < -1)
                                    System.out.println("The " + thisKami.getSpecies() + " " + thisKami.getName() + " has moved on to other realms, cursing you as it's essence fades from sight, never to return.");
                                else if (karmaChange < 0)
                                    System.out.println("The " + thisKami.getSpecies() + " " + thisKami.getName() + " has moved on to other realms, glad to leave.");
                                System.out.println("\nKami which remain in your garden: " + myGarden.getGardenKami());

                                //Neverminds and Wherefores
                            } else
                                System.out.println("Very well, " + kamiToRelease + " shall remain in your garden for now.");
                        } else if (kamiToRelease.equals("back")) {
                            areYouSureA = true;
                        } else
                            System.out.println("There is no Kami in your garden that answers to that name, please try again or enter 'back'.");
                    }
                }

                if (myGarden.getPower() <= 0) {
                    System.out.println("Your power has been expended, and whether you wish it or not you must now rest.");
                    break;
                }
                myGarden.tick();
            } while (command != 6 && myGarden.getPower() > 0);
        }
    }
}
