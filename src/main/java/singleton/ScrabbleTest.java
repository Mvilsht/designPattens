package singleton;
// The Singleton pattern is both easy to understand as well as useful. I’ll demonstrate first how to implement the Singleton pattern.
// Then I’ll provide and example of its usefulness with a Scrabble example.
//Threads can sometimes play havoc with this pattern, so I’ll show you how to avoid those problems. I’ll also review how to use threads, LinkedLists and more.


import java.util.LinkedList;

public class ScrabbleTest {

    public static void main(String[] args){

        // How you create a new instance of Singleton

        Singleton newInstance = Singleton.getInstance();

        // Get unique id for instance object

        System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));

        // Get all of the letters stored in the List

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player 1: " + playerOneTiles);

        System.out.println(newInstance.getLetterList());

        // Try to make another instance of Singleton
        // This doesn't work because the constructor is private

        // Singleton instanceTwo = new Singleton();

        // Try getting a new instance using getInstance

        Singleton instanceTwo = Singleton.getInstance();

        // Get unique id for the new instance object

        System.out.println("2nd Instance ID: " + System.identityHashCode(instanceTwo));

        // This returns the value of the first instance created

        System.out.println(instanceTwo.getLetterList());

        // Player 2 draws 7 tiles

        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);

        System.out.println("Player 2: " + playerTwoTiles);

    }

}
