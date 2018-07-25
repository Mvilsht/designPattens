package otherTopics.IQ_td;

import java.util.ArrayDeque;
import java.util.Deque;

//A TrainComposition is built by attaching and detaching wagons from the left and the right sides.
//For example, if we start by attaching wagon 7 from the left followed by attaching wagon 13, again from the left,
// we get a composition of two wagons (13 and 7 from left to right). Now the first wagon that can be detached from the right is
// 7 and the first that can be detached from the left is 13. Implement a TrainComposition that models this problem.


public class TrainComposition {

    private Deque<Integer> wagons = new ArrayDeque<>();

    public void attachWagonFromLeft(int wagonId) {
      wagons.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        wagons.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        if (wagons.isEmpty())
            return -1;
        return wagons.removeFirst();
    }

    public int detachWagonFromRight() {
        if (wagons.isEmpty())
            return -1;
        return wagons.removeLast();
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        tree.attachWagonFromRight(22);
        System.out.println(tree.detachWagonFromRight()); // 7
        System.out.println(tree.detachWagonFromLeft()); // 13
        System.out.println(tree.detachWagonFromRight()); // 13
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
