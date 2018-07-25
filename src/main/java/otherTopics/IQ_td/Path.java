package otherTopics.IQ_td;

import java.util.Arrays;
import java.util.List;

//Write a function that provides change directory (cd) function for an abstract file system.
//
//Notes:
//
//Root path is '/'.
//Path separator is '/'.
//Parent directory is addressable as "..".
//Directory names consist only of English alphabet letters (A-Z and a-z).
//The function should support both relative and absolute paths.
//The function will not be passed any invalid paths.
//Do not use built-in path-related functions.

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
        String[] dirs = newPath.split("/");
        //Stream.of(dirs).forEach(this::adjustPath2);
        adjustPath1(dirs);
    }




    public void cd1(String newPath) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        String[] newP = newPath.split("/");
        String[] oldP = path.split("/");
        int lnCount=0;  //counter for ".." in newPath

        for(String str:newP){
            if(str.equals("..")){
                lnCount++;  //count ".." inorder to skip latter
            }
        }

        int len = oldP.length;
        StringBuilder strOut= new StringBuilder();

        for(int i=0 ; i< len-lnCount ; i++){     //skip count of ".." from newPath, when building strOut from oldPath
            strOut.append(oldP[i]).append("/");
        }

        len = newP.length;
        for(int i=0; i<len ; i++){
            if(!newP[i].equals("..")){
                strOut.append(newP[i]).append("/");
            }
        }

        path = strOut.substring(0, strOut.length()-1);
        System.out.println(path);

    }




    private void adjustPath2(String move){

        List<String> currPath = Arrays.asList(path.split("/"));
        System.out.println("B4");
        currPath.forEach(System.out::println);

        if (move.equals(".")) {
            // stay at the same level
            return;
        } else if (move.equals("..") ) {
            currPath.remove(currPath.get(currPath.size() - 1));
        }else {
            currPath.add(move);
        }

        System.out.println("AFTER");
        currPath.forEach(System.out::println);

        StringBuilder finalPath = new StringBuilder();
        currPath.forEach(c -> finalPath.append("/").append(c));

        path = finalPath.toString();
    }


    private void adjustPath(String[] dirs){
        for (String move : dirs) {
            if (move.equals("..") ) {
                if (!(path.length() < 2)) {
                    path = path.substring(0, getPath().length() - 2);
                }
            }else {
                path = path.concat("/"+move);
            }
            System.out.println("~ " + path);
        }
    }

    private void adjustPath1(String[] dirs){
        for (String part : dirs) {
            if (part.equals(".")) {
                // stay at the same level
            } else if (part.equals("..")) {
                // remove the last element from path
                path = path.substring(0,path.length() -2);
            } else {
                // add the cd part to the path
                path = path.concat("/"+part);
            }
        }
    }



    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd1("../x");
        System.out.println(path.getPath());
    }
}
