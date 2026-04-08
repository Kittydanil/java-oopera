import java.util.ArrayList;

public class Show {

    public String title;
    public int duration;
    protected Director director;
    public ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector() {
        System.out.println("Режиссёр постановки: " + director.name + " " + director.surname +".");
    }

    public void printActors() {
        System.out.println("Список всех актёров спектакля '" + title + "': ");
        for (Actor actors : listOfActors) {
            System.out.println(actors.name + " " + actors.surname + " (" + actors.height + " см)" );
        }
    }

    public void addNewActor(Actor actor) {
        for (Actor actors : listOfActors) {
            if (actors.equals(actor)) {
                System.out.println("Такой актёр уже есть в списке!");
                break;
            }
        }
        listOfActors.add(actor);
        System.out.println("Актёр успешно добавлен в список!");
    }

    public void replaceActor(Actor actors, String surname) {
        Actor person = null;
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(surname)) {
                person = actor;
            }
        }
        if (person == null) {
            System.out.println("Такого актёра нет в списке!");
        } else {
            listOfActors.remove(person);
            listOfActors.add(actors);
            System.out.println("Актёр успешно заменён!");
        }
    }
}