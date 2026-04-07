public class Ballet extends MusicalShow {

    Choreographer choreographer;

    public Ballet(String title, int duration, Director director, MusicAuthor musicAuthor,
                      String librettoText, Choreographer choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}