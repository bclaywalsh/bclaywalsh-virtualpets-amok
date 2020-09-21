#Garden Of Shinkai
1 Game Overview
2 Production Process
3 Grading Rubric Parallels

1.  Game Overview
    Garden of Shinkai is a spiritual realm simulator. You play the role of a gardener god, shepherding and guiding lesser Kami through your garden between realms.

As a diety in a realm of distorted time and space, you measure your actions in terms of years. Year, you may devote some of your energy to one or more persuits pertaining to your Kami and garden. Through careful tending, you can incur positive or negative karma. Occasionally you will even be able to gain additional mortal followers, who will provide you with more power to devote to your goals.

Different sorts of Kami have different sorts of needs and attitudes. Kami are categorized in two different ways, a spiritual alignment somewhere between Chaos and Order, and their corporeal state; whether physical or ethereal.

Axiomatic Kami - These spirits are spirits of law, order, and discipline.
Neutral Kami - These spirits either take no part in the balance of Chaos and Order or act as mediators or watchers in the great war.
Chaotic Kami - These spirits are creatures of action and a never ending hunger to be doing...something.

Corporeal Kami - These creatures often manifest physical bodies, and must constrains to the limits of the flesh. Corporeal Kami must manage Hunger and Purity (cleanliness of body).

Ethereal Kami - These spirits have no physical form in the mortal realms, but can inhabit vast stretches of land or encompase something as intangible as an idea. Ethereal Kami are challenged constantly to maintain their potence and omnipresence.

2. Production Process
   I began by writing a test for adding a kami to the gardenKami list, and produced the required functions and constructors to do so. I then moved on to establishing different variables for the Kami and the Shelter to manipulate and test through a variety of means.

At this point I made the tick method for the individual Kami. At this level, the tick method would degrade two stats of each Kami and increase their age, which will affect their mood later on.

I then built the tick method for the garden itself, passing on the Tick function to each individual Kami and changing some of its own variables ()

I created a new class called Interaction to hold an array of information pertaining to how it would affect the Kami it was being acted upon.

I then began designing Interactions to be individual to each of the 6 varieties of Kami. I then moved on to making interactions that would be dependent on the physical state of the Kami (its interface), and then I made interactions that would depend on the Kamis alignment. All in all I created a list of 12 possible interactions per Kami, 4 for each level of abstration.

I decided that only three interactions would be available (chosen randomly) for each Kami during each year, though you can only access these if you choose to focus on a Kami individually.

I went on to build global interactions that would affect all Kamis at once, though it would be an uneven effect based on the classification of each Kami.

3. Grading Rubric Parallels
   I took a somewhat different approach to this project, but I made every effort to use all the skills that were being tested in the base project. Some requirements for the passing grade are present exactly as presented (encapsulated variables, appropriate visibility modifiers, clean code etc.), but as for a few other functions this is what I did in spirit of each requirement:

- Organic and Robotic pets - Instead of Organic and Robotic, I chose to name these categories Corporeal and Ethereal. Corporeal Kami and Ethereal Kami had a set of unique statistics; Hunger and Purity(cleanliness) for the corporeal, and potence and omnipresence for the ethereal.

- Health variable - The key word I used in place of health is Quintessence, which better represents a Shinto spirit. If the quintessence ever reaches zero, the Kami dissapears from the roster just as if a pet had died or become sick. Furthermore if the Quintessence reaches or surpasses the Kamis Ascension Level, that Kami becomes self sufficient and can be released for an ever increasing amount of Karma.

- Walk all dogs / clean dog cages / clean shelter litterbox - It seemed to me that the purpose of these required methods was to show that I could modify all creatures of a specific level of abstraction separately. To this end I made 4 global methods that would affect Corporeal and Ethereal Kami differently. It would have been no issue to make my functions affect ONLY one category at all, but I elected to make minor adjustments to the opposite categories at the same time. I did this to make the interplay between species and effects more interesting, as some global effects impact some Kami negatively.
