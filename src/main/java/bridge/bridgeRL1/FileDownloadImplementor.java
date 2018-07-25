package bridge.bridgeRL1;

//Let’s say you want to add delete feature at implementation layer for all downloaders (an internal feature) which client
// should not know about.

public interface FileDownloadImplementor
{
    public Object downloadFile(String path);

    public boolean storeFile(Object object);

    //public boolean delete2(String object);
}
