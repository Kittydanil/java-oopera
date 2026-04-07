import java.util.Objects;

public class Actor extends Person {

    public Actor(String name, String surname, double height, Gender gender) {
        super(name, surname, height, gender);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() !=  obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                (height == actor.height);
    }

    @Override
    public int hashCode() { return Objects.hash(name, surname, height);}
}
