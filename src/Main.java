public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOsAndroid = 1;
        int clientOsIOS = 0;
        if (clientOsAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOsIOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

        // Задание 2
        int clientDeviceYear = 2012;
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");


            // Задание 3
            int year = 2020;
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) ;
            System.out.println(" Год високосный");
            {
                // Задание 4
                int deliveryDistance = 90;
                System.out.println("Потребуется 1 день для доставки");

                if (deliveryDistance > 20 && deliveryDistance <= 60) {
                    System.out.println("Потребуется 2 дня для доставки");

                    if (deliveryDistance > 60 && deliveryDistance <= 100)
                        System.out.println("Потребуется 3 дня для доставки");
                }
            }


            // Задание 5
            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    System.out.println(" Это зима");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    System.out.println(" Это весна");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    System.out.println(" Это лето");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    System.out.println(" Это осень");
                    break;
                case 12:
                    System.out.println("Декабрь" + " Это зима");
                    break;
                default:
                    System.out.println("Такого месяца не существует"); }
        }
    }
}


