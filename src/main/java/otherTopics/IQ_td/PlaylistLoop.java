package otherTopics.IQ_td;

//A playlist is considered a repeating playlist if any of the songs contain a reference to a previous song in the playlist.
// Otherwise, the playlist will end with the last song which points to null.
//Implement a function isRepeatingPlaylist that returns true if a playlist is repeating or false if it is not.
//For example, the following code prints "true" as both songs point to each other.

//Song first = new Song("Hello");
//Song second = new Song("Eye of the tiger");

//first.setNextSong(second);
//second.setNextSong(first);

//System.out.println(first.isRepeatingPlaylist());

public class PlaylistLoop {

    public static class Song {
        private String name;
        private Song nextSong;

        public Song(String name) {
            this.name = name;
        }

        public void setNextSong(Song nextSong) {
            this.nextSong = nextSong;
        }

        public boolean isRepeatingPlaylist() {

            Song slow_p = this, fast_p = this;
            while (slow_p != null && fast_p != null && fast_p.nextSong != null) {
                slow_p = slow_p.nextSong;
                fast_p = fast_p.nextSong.nextSong;
                if (slow_p == fast_p) {
                    System.out.println("Found loop");
                    return true;
                }
            }
            return false;

        }
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
