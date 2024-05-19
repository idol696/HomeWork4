public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1");

        byte age = 18;

        System.out.printf("Если возраст человека равен %s то он ",age);
        if (age >= 18) {
            System.out.println("совершеннолентний");
        } else {
            System.out.println("не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");

        byte temperature = 6;
        boolean isTemperatureCold = false;

        if (temperature < 5) {
            isTemperatureCold = true;
        }

        if ( isTemperatureCold ) {
            System.out.println("На улице холодно, нужно надеть шапку");
            System.out.printf("На улице %s градусов, нужно надеть шапку\r\n", temperature);
        }

        if ( !isTemperatureCold && temperature != 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
            System.out.printf("На улице %s градусов, можно идти без шапки\r\n", temperature);
        }

        if (  temperature == 5 ) {
            System.out.println("Условиями задачи не предусмотрено решение для 5 градусов");
        }

        System.out.println("Задача 3");

        int speed = 1502;
        boolean isSpeedWarning = false;

        if (speed > 60) {
            isSpeedWarning = true;
        }

        if (isSpeedWarning) {
            System.out.printf("Если скорость %s км/ч, то придется заплатить штраф\r\n", speed);
        } else {
            System.out.printf("Если скорость %s км/ч, то можно ездить спокойно\r\n", speed);
        }

        System.out.println("Задача 4");


        int peopleAge = 24;
        boolean isAgeDetected = false;

        if (peopleAge >= 2 && peopleAge <= 6) {
            isAgeDetected = true;
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в детский сад\r\n", peopleAge);
        }

        if (!isAgeDetected && peopleAge >= 7 && peopleAge <= 17) {
            isAgeDetected = true;
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу\r\n", peopleAge);
        }

        if (!isAgeDetected && peopleAge >= 18 && peopleAge <= 24) {
            isAgeDetected = true;
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в университет\r\n", peopleAge);
        }

        if (!isAgeDetected && peopleAge > 24) {
            isAgeDetected = true;
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить на работу\r\n", peopleAge);
        }

        System.out.println("Задача 5");
        // по условию задачи мы имеем право применить оптимизацию вывода!
        int babyAge = 6;
        boolean isBabyAgeDetected = false;

        if (babyAge == 5) {
            isBabyAgeDetected = true;
            System.out.println("Условие задачи некорректно для возраста 5 лет");
        }


        if ( !isBabyAgeDetected ) {
            System.out.printf("Если возраст ребенка равен %s, то ему ", babyAge);
        }

        if (!isBabyAgeDetected && babyAge < 5) {
            isBabyAgeDetected = true;
            System.out.println("нельзя кататься на аттракционе");
        }

        if (!isBabyAgeDetected && babyAge > 5 && babyAge < 14) {
            isBabyAgeDetected = true;
            System.out.println("можно кататья на аттракционе только в сопровождении взрослого");
        }

        if (!isBabyAgeDetected && babyAge >= 14) {
            isBabyAgeDetected = true;
            System.out.println("можно кататья на аттракционе без сопровождении взрослого");
        }

        System.out.println("Задача 6");

        // обращаю внимание что мы применяем вложенный цикл проверки мест
        // первый для определения наличия свободных мест, именно при условии наличия мест вообще
        // мы будем делать вложенные if - это упрощает нам необходимость дописывания лишних проверок
        // также моя концепция предусматривает распределение по сидячим местам, а потом по стоячим
        // с информированием пасажира о необходимости сидеть и при отсутсвии сид.мест - стоять
        // если Java или в самой концепции стиля нельзя использовать вложенные логические конструкции,
        // то я перепишу. Для понимания ввел две переменные во вложенном условии

        int wagonCapacity = 102;
        int wagonSitCapacity = 60;
        int wagonStayCapacity = wagonCapacity - wagonSitCapacity;
        int passengers = 60;

        if (wagonCapacity - passengers > 0) {



            if (wagonSitCapacity - passengers > 0) {

                int wagonFreeSitCapacity = wagonSitCapacity - passengers;

                System.out.printf("Есть %s сидячих мест и %s стоячих мест, покупайте сидячее пока есть!\r\n",
                        wagonFreeSitCapacity, wagonStayCapacity);
            }

            if (passengers >= wagonSitCapacity) {
                int wagonFreeStayCapacity = wagonCapacity - passengers;
                System.out.printf("Есть %s стоячих мест, придется немного страдать!\r\n",
                        wagonFreeStayCapacity );
            }

        } else {
            System.out.println("В вагоне уже нет мест!");
        }

        System.out.println("Задача 7");

        int one = 5;
        int two = 3;
        int three = 4;

        int max = one;

        if (two > one) {
            max = two;
        }

        if (three > max) {
            max = three;
        }

        System.out.println("Максимальное число " + max);


    }


}