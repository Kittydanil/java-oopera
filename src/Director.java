public class Director extends Person {

    protected int numberOfShows;

    public Director(String name, String surname, double height, Gender gender, int numberOfShows) {
        super(name, surname, height, gender);
        this.numberOfShows = numberOfShows;
    }
}
