import java.util.*;

public class Speeder {


    public static void main(String[] args) {
        final int FIVE = 5;
        final int TWENTY = 5;
        final int THIRTY = 30;
        final int FIFTY = 50;

        int speedLimit, actualSpeed, constructionFine = 0, baseFine = 0, mph = 0;
        String firstName, lastName;
        boolean violation;
        int age, underageFine = 0, totalFine = 0;

        Scanner infile = new Scanner(System.in);
        System.out.print("First Name : ");
        firstName = infile.next();
        System.out.print("Last Name : ");
        lastName = infile.next();
        System.out.print("Driver Age: ");
        age = infile.nextInt();


        //speedlimit
        System.out.print("Speed Limit: ");
        speedLimit = infile.nextInt();

        System.out.print("Actual Speed : ");
        actualSpeed = infile.nextInt();

        System.out.print("The violation occurred in a construction zone. Enter true or false.  ");
        violation = infile.nextBoolean();
        //IF STATEMENTS 
        if (actualSpeed - speedLimit < 5) {
            mph = actualSpeed - speedLimit;
        }
        if (((actualSpeed - speedLimit) >= FIVE) && ((actualSpeed - speedLimit) < TWENTY)) {
            mph = actualSpeed - speedLimit;
            baseFine = mph / FIVE * THIRTY;
            totalFine += baseFine;



            if (violation == true)

                constructionFine += baseFine;
            totalFine += constructionFine;

        } else if ((actualSpeed - speedLimit) >= TWENTY) {
            mph = actualSpeed - speedLimit;
            baseFine = mph / FIVE * FIFTY;
            totalFine += baseFine;


            if (violation == true)
                constructionFine += baseFine;
            totalFine += constructionFine;
        }


        if ((age < 21 && (actualSpeed - speedLimit) > TWENTY)) {

            underageFine += 300;
            totalFine += underageFine;

        }

        System.out.println("Mph over limit: " + (mph));
        System.out.println("Base Fine: $" + baseFine);
        System.out.println("Construction Zone Fine : $" + constructionFine);
        System.out.println("Underage Fine : $" + underageFine);
        System.out.println("Total Fine : $" + totalFine);

    }
}