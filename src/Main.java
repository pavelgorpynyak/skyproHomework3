public class Main {
    public static void main(String[] args) {

        // Задание 1

        int clientOS = 1;

        if ( clientOS != 1) {
            System.out.println( "Please install application for IOS via link" );
        } else if ( clientOS == 1 ){
            System.out.println( "Please install application for Android via link" );
        }


        // Задание 2

        int clientDeviseYear = 2014;

        if (clientOS == 1 && clientDeviseYear >= 2015) {
            System.out.println( "Please install application for Android via link" );
        } else if (clientOS != 1 && clientDeviseYear >=2015) {
            System.out.println( "Please install application for IOS via link" );

        } else if (clientOS == 1 && clientDeviseYear < 2015) {
            System.out.println( "Please install light application for Android via link" );

        } else if ( clientOS != 1 && clientDeviseYear < 2015) {
            System.out.println( "Please install light application for IOS via link" );
        }


        // Задание 3

        int year = 2022;

        if ( year % 4 == 0 ) {
            System.out.println( "There is Leap year");

        } else if ( year % 400 == 0 ) {
            System.out.println( "There is Leap year");

        } else if ( year % 100 == 0 ) {
            System.out.println( "There is NOT Leap year");

        } else {
            System.out.println( "There is NOT Leap year");
        }


        // Задание 4

        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println( "days for delivery needed:" + " 1. ");

        } else if ( deliveryDistance >= 21 && deliveryDistance <= 60) {

            System.out.println( "days for delivery needed:" + " 2. ");

        } else if ( deliveryDistance >= 61 && deliveryDistance <= 100 ) {

            System.out.println( "days for delivery needed:" + " 3. ");

        }

        // Задание 5

        int monthNumber = 1;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println( "Winter" );
                break;
            case 3:
            case 4:
            case 5:
                System.out.println( "Spring" );
                break;
            case 6:
            case 7:
            case 8:
                System.out.println( "Summer!" );
                break;
            case 9:
            case 10:
            case 11:
                System.out.println( "Autumn" );
                break;
            default:
                System.out.println( "No seasons any more" );


        }


    }
}