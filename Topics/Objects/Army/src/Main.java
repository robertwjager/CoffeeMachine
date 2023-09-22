@SuppressWarnings("ALL")
class Army {

    public static void createArmy() {
        // Create all objects here
        Unit[] units = new Unit[5];
        for (int i = 0; i < 5; i++) {
            units[i] = new Unit("Unit " + (i + 1));
        }

        new General("Mark");
        new Doctor("Frank");
        new Knight("Martin");
        new Knight("Rudolph");
        new Knight("Steve");
    }


    // Don't change the code below
    static class Unit {
        String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
