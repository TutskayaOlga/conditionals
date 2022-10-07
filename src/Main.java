public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }


    private static void task1() {
        System.out.println("PART1");
        System.out.println("ЗАДАЧА №1");
        System.out.println(" ");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравлением Вас с совершеннолетием!");
        }
        if (age < 18){
            System.out.println("Ваш возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        System.out.println(" ");
    }
    private static void task2() {
        System.out.println("ЗАДАЧА №2");
        System.out.println(" ");
        int children = 8;
        int men = 19;
        int woman = 27;
        if (children >= 7 && children <18) {
            System.out.println("Ребенок ходит в школу, так как его возраст достиг необходимого");
        }
        if (men >= 18 && men < 24){
            System.out.println("Человек закончил школу и может поступать в университет");
        }
        if (woman > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println(" ");
    }
    private static void task3() {
        System.out.println("ЗАДАЧА №3");
        System.out.println(" ");
        int allPlase = 102;
        int seatPlase = 60;
        int passengers = 55;
        if (passengers >= allPlase){
            System.out.println("Вот это да, мест в вагоне больше нет!");
        }
        if (passengers >= seatPlase && passengers < allPlase){
            System.out.println("Сидячих мест в вагоне больше нет, но еще остались стоячие, ура!");
        }
        if (passengers < seatPlase && passengers < allPlase){
            System.out.println("В вагоне есть сидячие места, поздравляем!");
        }
        System.out.println(" ");
    }
    private static void task4() {
        System.out.println("PART2");
        System.out.println("ЗАДАЧА №1");
        System.out.println(" ");
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Поздравлением Вас с совершеннолетием!");
        } else {
            System.out.println("Ваш возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        System.out.println(" ");
    }
    private static void task5() {
        System.out.println("ЗАДАЧА №2");
        System.out.println(" ");
        int person = 19;
        if (person >= 7 && person <18) {
            System.out.println("Ребенок ходит в школу, так как его возраст достиг необходимого");
        } else if (person >= 18 && person < 24){
            System.out.println("Человек закончил школу и может поступать в университет");
        } else if (person > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println(" ");
    }
    private static void task6() {
        System.out.println("ЗАДАЧА №3");
        System.out.println(" ");
        int allPlase1 = 102;
        int seatPlase1 = 60;
        int passengers1 = 200;
        if (passengers1 >= allPlase1){
            System.out.println("Вот это да, мест в вагоне больше нет!");
        } else if (passengers1 >= seatPlase1 && passengers1 < allPlase1){
            System.out.println("Сидячих мест в вагоне больше нет, но еще остались стоячие, ура!");
        } else if (passengers1 < seatPlase1 && passengers1 < allPlase1){
            System.out.println("В вагоне есть сидячие места, поздравляем!");
        }
        System.out.println(" ");
    }
    private static void task7() {
        System.out.println("PART3");
        System.out.println("ЗАДАЧА №1");
        System.out.println(" ");
        int age = 21;
        String notToGoSchool = "Детский сад";
        String ToSchool = "Школу";
        String University = "Университет";
        String Work = "Работу";
        boolean cannotToGoSchool = age >= 2 && age <= 6;
        boolean goToSchool = age >= 7 && age <= 18;
        boolean goToUniversity = (age > 18 && age < 24);
        boolean goToWork = (age > 24);
        if (cannotToGoSchool) {
            System.out.printf("Если возраст человека равен %d , то ему нужно ходить в %s \n", age, notToGoSchool);
        } else if (goToSchool) {
            System.out.printf("Если возраст человека равен %d , то ему нужно ходить в %s \n", age, ToSchool);
        } else if (goToUniversity) {
            System.out.printf("Если возраст человека равен %d , то ему нужно ходить в %s \n", age, University);
        } else if (goToWork) {
            System.out.printf("Если возраст человека равен %d , то ему нужно ходить в %s \n", age, Work);
        }
        System.out.println(" ");
    }
    private static void task8() {
        System.out.println("ЗАДАЧА №2");
        System.out.println(" ");
        int childrenAge = 6;
        boolean canNotRide = childrenAge < 5;
        boolean rideWithGrownup = childrenAge > 5 && childrenAge < 14;
        boolean freeRide = (childrenAge > 18 && childrenAge < 24);
        if (canNotRide) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (rideWithGrownup) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (freeRide) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
        System.out.println(" ");
    }
    private static void task9() {
        System.out.println("ЗАДАЧА №3");
        System.out.println(" ");
        int one = 5690;
        int two = 9863;
        int free = 1365;
        boolean first = one > two && one > free;
        boolean second = two > one && two > free;
        boolean third = free > one && free > two;
        if (first)
            System.out.println("Большее число first = " + one);
        else if (second)
            System.out.println("Большее число second = " + two);
        else if (third)
            System.out.println("Большее число third = " + free);
    }
    }
