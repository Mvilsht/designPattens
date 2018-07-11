package bridge;

//If you ever wanted to build a group of classes that slowly added functionality from one class to the next, this is the design pattern for you.
//There seems to be a lot of confusion in regards to what constitutes a bridge design pattern in both books as well as online.
// In this tutorial I will show you how it was explained to me and the ways in which I have found it is useful.

public class TestTheRemote{

    public static void main(String[] args){

        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));

        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));

        // HOMEWORK --------------

        RemoteButton theDVD = new DVDRemote(new DVDDevice(1,14));

        // -----------------------

        System.out.println("Test TV with Mute");

        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("\nTest TV with Pause");

        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();

        // HOMEWORK

        System.out.println("\nTest DVD");

        theDVD.buttonFivePressed();
        theDVD.buttonSixPressed();
        theDVD.buttonNinePressed();
        theDVD.buttonNinePressed();

    }

}
