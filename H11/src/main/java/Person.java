public class Person {
    String history[] = new String[10];
    protected int age;
    protected String name;
    protected Gender gender;


    protected enum Gender {
        MALE,
        FEMALE
    }

    //SETTERS


    //GETTERS


    //CONSTRUCTORS
    public Person(String name, int age, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    //MAIN


    static void createPerson() {
        Person leo = new Person("Leo", 26, Gender.MALE);
        Person.HistoryRecord HistoryRecord = new HistoryRecord();
        leo.createHistory(3);
        leo.printHistory();
    }


    public void printHistory() {
        for (String s : history) {
            System.out.println(s);
        }
    }

    public void createHistory(int j) {
        for (int i = 0; i < j+1; i++) {
            this.history[i] = ("This is my description #" + (i+1));

        }
    }


    String greet() {
        return "Hello my name is " + name + ". Nice to meet you!";
    }

    private static class HistoryRecord {

        String description;


        @Override
        public String toString() {
            return "Overridden toString";
        }

        public String description(String describeMe) {

            this.description = describeMe;
            return description;
        }


    }

}






