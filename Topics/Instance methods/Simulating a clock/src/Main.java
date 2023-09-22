class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        minutes++;

        if(minutes >= 60) {
            minutes = 0;
            hours++;

            if(hours > 12) {
                hours = 1;
                }

        }


    }
}

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours = 12;
        clock.minutes = 0;

        System.out.println("Current time: " + clock.hours + ":" + clock.minutes);

        clock.next();

        System.out.println("Updated time: " + clock.hours + ":" + clock.minutes);
    }
}