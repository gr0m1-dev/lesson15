package lesson15;

public class Main {
    public static void main(String[] args) {
        Advisor advisor = new DayAdvisor();

        advisor.advise(Day.MONDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SUNDAY);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

interface Advisor {
    void advise(Day day);
}

class DayAdvisor implements Advisor {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Порада: Будьте продуктивні на роботі.");
            case FRIDAY ->
                    System.out.println("Happy Friday!");
            case SATURDAY, SUNDAY ->
                    System.out.println("Рекомендуємо відвідати парк або музей.");
        }
    }
}
