import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Actor actorOksana = new Actor("Оксана", "Леванович", 164.0, Gender.FEMALE);
        Actor actorAurica = new Actor("Аурика", "Иванькова", 155.0, Gender.FEMALE);
        Actor actorDanil = new Actor("Данил", "Иваньков", 182.5, Gender.MALE);
        Director directorLubov = new Director("Любовь", "Зоя", 154.0, Gender.FEMALE, 30);
        Director directorNikolay = new Director("Николай", "Зоя", 176.5, Gender.MALE, 28);
        Person authorAnton = new Person("Антон", "Иваньков", 187.5, Gender.MALE);
        Person choreographerVladislav = new Person("Владислав", "Иваньков",
                170.0, Gender.MALE);

        Show show = new Show("Вождь краснокожих", 115, directorLubov);
        Ballet ballet = new Ballet("Щелкунчик", 130, directorNikolay, authorAnton,
                "Здесь будет текст либретто.", choreographerVladislav);
        Opera opera = new Opera("Ромео и Джульетта", 90, directorNikolay, authorAnton,
                "Здесь будет текст либретто.", 15);

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                librettoText(scanner, ballet, opera);
            } else if (command == 2) {
                printDirector(scanner, ballet, opera, show);
            } else if (command == 3) {
                printActors(scanner, ballet, opera, show);
            } else if (command == 4) {
                addActor(scanner, ballet, opera, show, actorOksana, actorAurica, actorDanil);
            } else if (command == 5) {
                replaceActor(scanner, ballet, opera, show, actorOksana, actorAurica, actorDanil);
            } else if (command == 0) {
                System.out.println("Выход из программы");
                break;
            } else {
                System.out.println("К сожалению, такой команды пока нет!");
                break;
            }
        }
    }

    static void printMenu() {
        System.out.println("Меню:");
        System.out.println("1 - Распечатать текст либретто.");
        System.out.println("2 - Информация о режиссёре спектакля.");
        System.out.println("3 - Список всех актёров, участвующих в спектакле.");
        System.out.println("4 - Добавить нового актёра в спектакль.");
        System.out.println("5 - Заменить одного актёра в спектакле на другого.");
        System.out.println("0 - Выход.");
    }

    static void librettoText(Scanner scanner, Ballet ballet, Opera opera) {
        System.out.println("Для какого спектакля, Вы хотите распечатать текст либретто?");
        System.out.println("1 - 'Щелкунчик'");
        System.out.println("2 - 'Ромео и Джульетта'");
        int choice = scanner.nextInt();
        if (choice == 1) {
            ballet.printLibrettoText();
        } else if (choice == 2) {
            opera.printLibrettoText();
        } else {
            System.out.println("Такого спектакля нет в программе нашего театра!");
        }
    }

    static void printDirector(Scanner scanner, Ballet ballet, Opera opera, Show show) {
        System.out.println("О режиссёре какого спектакля Вы хотите узнать?");
        System.out.println("1 - 'Щелкунчик'");
        System.out.println("2 - 'Ромео и Джульетта'");
        System.out.println("3 - 'Вождь краснокожих'");
        int choice = scanner.nextInt();
        if (choice == 1) {
            ballet.printDirector();
        } else if (choice == 2) {
            opera.printDirector();
        } else if (choice == 3) {
            show.printDirector();
        } else {
            System.out.println("Такого спектакля нет в программе нашего театра!");
        }
    }

    static void printActors(Scanner scanner, Ballet ballet, Opera opera, Show show) {
        System.out.println("О списке актёров какого спектакля, Вы хотите узнать?");
        System.out.println("1 - 'Щелкунчик'");
        System.out.println("2 - 'Ромео и Джульетта'");
        System.out.println("3 - 'Вождь краснокожих'");
        int choice = scanner.nextInt();
        if (choice == 1) {
            ballet.printActors();
        } else if (choice == 2) {
            opera.printActors();
        } else if (choice == 3) {
            show.printActors();
        } else {
            System.out.println("Такого спектакля нет в программе нашего театра!");
        }
    }

    static void addActor(Scanner scanner, Ballet ballet, Opera opera, Show show, Actor actorOksana,
                         Actor actorAurica, Actor actorDanil) {
        System.out.println("В список актёров какого спектакля Вы хотите добавить нового актёра?");
        System.out.println("1 - 'Щелкунчик'");
        System.out.println("2 - 'Ромео и Джульетта'");
        System.out.println("3 - 'Вождь краснокожих'");
        int add = scanner.nextInt();
        if (add < 1 || add > 3) {
            System.out.println("Такого спектакля нет в программе нашего театра!");
        } else {
            System.out.println("Какого актёра Вы хотите добавить?");
            System.out.println("1 - Оксана Леванович");
            System.out.println("2 - Аурика Иванькова");
            System.out.println("3 - Данил Иваньков");
            int choice = scanner.nextInt();
            if (add == 1) {
                if (choice == 1) {
                    ballet.addNewActor(actorOksana);
                } else if (choice == 2) {
                    ballet.addNewActor(actorAurica);
                } else if (choice == 3) {
                    ballet.addNewActor(actorDanil);
                } else {
                    System.out.println("К сожалению, такого актёра нет в нашем театре!");
                }
            } else if (add == 2) {
                if (choice == 1) {
                    opera.addNewActor(actorOksana);
                } else if (choice == 2) {
                    opera.addNewActor(actorAurica);
                } else if (choice == 3) {
                    opera.addNewActor(actorDanil);
                } else {
                    System.out.println("К сожалению, такого актёра нет в нашем театре!");
                }
            } else {
                if (choice == 1) {
                    show.addNewActor(actorOksana);
                } else if (choice == 2) {
                    show.addNewActor(actorAurica);
                } else if (choice == 3) {
                    show.addNewActor(actorDanil);
                } else {
                    System.out.println("К сожалению, такого актёра нет в нашем театре!");
                }
            }
        }
    }

    static void replaceActor(Scanner scanner, Ballet ballet, Opera opera, Show show,
                             Actor actorOksana, Actor actorAurica, Actor actorDanil) {
        System.out.println("В список актёров какого спектакля Вы хотите заменить актёра?");
        System.out.println("1 - 'Щелкунчик'");
        System.out.println("2 - 'Ромео и Джульетта'");
        System.out.println("3 - 'Вождь краснокожих'");
        int add = scanner.nextInt();
        if (add < 1 || add > 3) {
            System.out.println("Такого спектакля нет в программе нашего театра!");
        } else {
            System.out.println("Какого актёра Вы хотите добавить?");
            System.out.println("1 - Оксана Леванович");
            System.out.println("2 - Аурика Иванькова");
            System.out.println("3 - Данил Иваньков");
            int choice = scanner.nextInt();
            System.out.println("Введите фамилию актёра которого хотите заменить: ");
            String surname = scanner.next();
            if (add == 1) {
                if (choice == 1) {
                    ballet.replaceActor(actorOksana, surname);
                } else if (choice == 2) {
                    ballet.replaceActor(actorAurica, surname);
                } else if (choice == 3) {
                    ballet.replaceActor(actorDanil, surname);
                } else {
                    System.out.println("К сожалению, такого актёра нет в нашем театре!");
                }
            } else if (add == 2) {
                if (choice == 1) {
                    opera.replaceActor(actorOksana, surname);
                } else if (choice == 2) {
                    opera.replaceActor(actorAurica, surname);
                } else if (choice == 3) {
                    opera.replaceActor(actorDanil, surname);
                } else {
                    System.out.println("К сожалению, такого актёра нет в нашем театре!");
                }
            } else {
                if (choice == 1) {
                    show.replaceActor(actorOksana, surname);
                } else if (choice == 2) {
                    show.replaceActor(actorAurica, surname);
                } else if (choice == 3) {
                    show.replaceActor(actorDanil, surname);
                } else {
                    System.out.println("К сожалению, такого актёра нет в нашем театре!");
                }
            }
        }
    }
}