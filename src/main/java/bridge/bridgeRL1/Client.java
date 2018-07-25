package bridge.bridgeRL1;
//final notes
//Bridge pattern decouple an abstraction from its implementation so that the two can vary independently.
//It is used mainly for implementing platform independence feature.
//It adds one more method level redirection to achieve the objective.
//Publish abstraction interface in separate inheritance hierarchy, and put implementation in its own inheritance hierarchy.
//Use bridge pattern to run-time binding of the implementation.
//Use bridge pattern to map orthogonal class hierarchies
//Bridge is designed up-front to let the abstraction and the implementation vary independently.


public class Client
{
    public static void main(String[] args)
    {
        String os = "linux";
        FileDownloaderAbstraction downloader = null;

        switch (os)
        {
            case "windows":
                downloader = new FileDownloaderAbstractionImpl( new WindowsFileDownloadImplementor() );
                break;

            case "linux":
                downloader = new FileDownloaderAbstractionImpl( new LinuxFileDownloadImplementor() );
                break;

            default:
                System.out.println("OS not supported !!");
        }

        Object fileContent = downloader.download("some path");
        downloader.store(fileContent);
    }
}
