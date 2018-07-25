package bridge.bridgeRL1;

//Now let’s say you want to add one more capability (i.e. delete) at abstraction layer.
// It must not force a change in existing implementers and client as well.

public interface FileDownloaderAbstraction
{
    public Object download(String path);

    public boolean store(Object object);

    //public boolean delete(String object);
}