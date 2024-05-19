public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1");

        byte age = 18;

        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        System.out.println("Задача 2");
        // в задаче ошибка
        // условия temperature = 5 в задаче не обрабатывается,
        // но придерживаемся концепции else и не делаем исключения, комментируя момент ТЗ

        byte temperature = 4;
        boolean isTemperatureCold = false; // по умолчанию флаг выключен

        if (temperature < 5) {
            isTemperatureCold = true;
        }

        System.out.printf("На улице %s градусов, ", temperature);
        if (isTemperatureCold) {
            System.out.println("нужно надеть шапку");
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("можно идти без шапки");
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("Задача 3");

        int speed = 1502;
        boolean isSpeedWarning = false;

        if (speed > 60) {
            isSpeedWarning = true;
            System.out.println("Скорость превышена, если она больше 60 км/ч");
        } else {
            System.out.println("Превышения скорости нет, если она меньше 60 км/ч");
        }
        System.out.printf("Если скорость %s км/ч, то ", speed);
        if (isSpeedWarning) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }

        System.out.println("Задача 4");
        // в задаче неточность со словом "до" но из условия видно,
        // что диапазон возрастов должен покрываться полностью, поэтому комментируем это


        int peopleAge = 22;

        System.out.printf("Если возраст человека равен %s, то ему нужно ходить ", peopleAge);
        if (peopleAge >= 2 && peopleAge <= 6) {
            System.out.println("в детский сад");
        }

        if (peopleAge >= 7 && peopleAge <= 17) {
            System.out.println("в школу");
        }

        if (peopleAge >= 18 && peopleAge <= 24) {
            System.out.println("в университет");
        }

        if (peopleAge > 24) {
            System.out.println("на работу");
        }

        System.out.println("Задача 5");

        // по тексту видим неточность с возрастом 5, однако оставляем все как есть
        // по логике аналитики, слишком явно задан критерий, уведомляем заказчика о неточности ТЗ!

        int babyAge = 48;

        System.out.printf("Если возраст ребенка равен %s, то ему ", babyAge);
        if (babyAge < 5) {
            System.out.println("нельзя кататься на аттракционе");
        }

        if (babyAge > 5 && babyAge < 14 ) {
            System.out.println("можно кататья на аттракционе только в сопровождении взрослого");
        }

        if (babyAge >= 14) { // старше 14 лет рассматриваем >= согласно тому что 14 + 1 милисекунда старше 14 лет
            System.out.println("можно кататья на аттракционе без сопровождении взрослого");
        }

        System.out.println("Задача 6");
        // решаем из расчета того, что все любят и обязаны присаживаться как в маршрутке г.Псков

        int wagonCapacity = 102;
        int wagonSitCapacity = 60;
        int passengers = 59;

        if (wagonCapacity - passengers >0 ) {


            if (wagonSitCapacity - passengers > 0) {
                System.out.printf("Есть %s сидячих мест и %s стоячих мест, покупайте сидячее пока есть!\r\n",
                        wagonSitCapacity - passengers, wagonCapacity - wagonSitCapacity);
            }

            if ( passengers >= wagonSitCapacity  ) {
                System.out.printf("Есть %s стоячих мест, придется немного страдать!\r\n",
                        wagonCapacity - passengers );
            }
        } else {
            System.out.println("В вагоне уже нет мест!");
        }

        System.out.println("Задача 7");

        int one = 5;
        int two = 3;
        int three = 4;

        int max = one;
        if ( two > one ) max = two; // удобочитаемые выражения вроде можно без {}
        if ( three > max ) max = three;

        System.out.println("Максимальное число " + max);


    }


}