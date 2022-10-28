public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляю с совершенолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать :(");
        }
        System.out.println();

        //  Задание 2
        System.out.println("Задание 2");
        int age1 = 34;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Иди в университет");
        }
        if (age1 >= 24) {
            System.out.println("Ищи работу!");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int occupiedPlaces = 12;
        int seatingPlaces = 60;
        int standingPlaces = 32;
        int train = seatingPlaces + standingPlaces;
        if (occupiedPlaces < 32) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        if (occupiedPlaces >= 32 && occupiedPlaces <= train) {
            System.out.println("В вагоне остались только стоячие места");
        }
        if (occupiedPlaces > train)
            System.out.println("В вагоне нет мест");
        System.out.println();


        // Задание 1
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        int age2 = 19;
        if (age2 >= 18) {
            System.out.println("Поздравляю с совершенолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать :(");
        }
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        int age3 = 24;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age3 >= 18 && age3 < 24) {
            System.out.println("Иди в университет");
        } else {
            System.out.println("Ищи работу!");
        }
        System.out.println();


        // Задание 3
        System.out.println("Задание 3");
        int occupiedPlaces1 = 134;
        ;
        if (occupiedPlaces1 < 32) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else if (occupiedPlaces1 >= 32 && occupiedPlaces1 <= 102) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        System.out.println();


        // Задание 1
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");

        int age4 = 24;
        if (age4 >= 2 && age4 <= 4) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский садик");
        } else if (age4 >= 7 && age4 < 18) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        } else if (age4 >= 18 && age4 < 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить на работу");
        }
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        int age5 = 20;
        if (age5 < 5) {
            System.out.println("Ребенок не может кататься на аттракционе, ему меньше 5 лет");
        } else if (age5 > 5 && age5 < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (age5 < 13 && age5 > 18) {
            System.out.println("Ребенок старше 14 лет, то он может кататься без сопровождения взрослого");
        } else {
            System.out.println("Ты уже серьезный взрослый, можешь кататься без родителей :)");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 4");
        int one = 4;
        int two = 2;
        int free = 10;
        if (free > one && one > two) {
            System.out.println("Третье значение больше");}
        else if (one > two && two > free) {
            System.out.println("Первое значение больше");}
        else {
            System.out.println("Второе значение больше");
        }
    }
}