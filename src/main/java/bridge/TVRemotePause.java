package bridge;

// RefinedAbstraction (normal class)
//It extends the interface defined by Abstraction.

// If I decide I want to further extend the remote I can

public class TVRemotePause extends RemoteButton{

    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        System.out.println("TV was Paused");

    }

}
