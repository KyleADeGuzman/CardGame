AP Computer Science A Name: Kyle Deguzman
ArrayLists




Transferred from Eclipse to Cloud9

   ___   _   ___ ___    ___ _  _  ___ 
  / __| /_\ | _ \   \  | _ \ \| |/ __|
 | (__ / _ \|   / |) | |   / .` | (_ |
  \___/_/ \_\_|_\___/  |_|_\_|\_|\___|




Unit 6 Labs

In this lab you will create a program that:
Generates a complete deck of cards.
Deals cards to a number of players.

Part I: Deck of Cards

Create a Card class that has:
2 instance fields
A String called “suit” (“Clubs”, “Diamonds”, “Spades”, “Hearts”)
An int called “rank” (e.g. “2”, “Ace”, “Jack”, etc.)
A constructor with parameters for suit and rank.
A toString() method that displays rank as a String, displaying face cards and aces
by name. For example “3 of Hearts” and “Jack of Spades”.
Create a class called Deck with:
An instance field of an ArrayList that holds Card objects.
A method that fills the deck with 52 playing cards.
Hint: use a loop within a loop, one loop for suits and one for ranks.
Another method, of your design, that shuffles the cards randomly.
Hint: use the nextInt() method of the Random class.
A public instance method draw() that both removes the first (“top”) card from the deck
and returns it. (Remember that you must remove it!)
Any getters/setters you think you need.
Write a CardGame driver class that tests your code. You decide what is needed to
ensure that it is thoroughly tested.
Part II: Players
Write a Player class that has:
An instance field called “hand” that holds an ArrayList of Card objects.
An instance method draw() that takes a Deck as a parameter and draws one card
from that deck, adding it to its hand.
Modify your CardGame by adding:

Variables for a Deck and an ArrayList of Player objects.
A deal() method that:
Has a parameter for the number of cards to deal to each player.
Has each player take turns drawing cards until they each have the appropriate number
of cards.
Test your CardGame.
Here is an example of what your output might look like:
Deck has 52 cards.
Dealing 5 cards to 3 players.
Aria: [4 of Diamonds, Queen of Diamonds, 8 of Diamonds, 3
of Spades, 2 of Spades]
Bob: [5 of Hearts, King of Spades, 3 of Diamonds, 4 of
Clubs, 8 of Clubs]
Carlos: [9 of Clubs, Queen of Hearts, Jack of Clubs, 4 of
Hearts, Ace of Spades]
Deck has 37 cards.
You may want to write some helper methods, such as toString() and size(), on
some of your classes to make this easier.
