//author EgeKorkmaz
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter three values (true or false): \n");
        System.out.print("1-");
        boolean a = sca.nextBoolean();
        System.out.print("2-");
        boolean b = sca.nextBoolean();
        System.out.print("3-");
        boolean c = sca.nextBoolean();
        sca.close();
        boolean allThree = false;
        boolean exactlyOne = false;
        boolean exactlyTwo = false;
        boolean atLeastOne= false;
        boolean atLeastTwo = false;
        if (a && b && c) {
            allThree = true;
        }
        if ((a && !b && !c) || (!a && b && !c) || (!a && !b && c)) {
            exactlyOne = true;
        }
        if ((a && b && !c) || (!a && b && c) || (a && !b && c)) {
            exactlyTwo = true;
        }
        if (a || b || c) {
            atLeastOne = true;
        }
        if ((a && b && !c) || (!a && b && c) || (a && !b && c) || (allThree)) {
            atLeastTwo = true;
        }

        System.out.println("a, b, c = " + a + ", " + b + ", " + c + "\nallThree:   " + "" + allThree + "\nexactlyOne: " + exactlyOne + "\nexactlyTwo: " + "" + exactlyTwo + "\natLeastOne: " + atLeastOne + "\natLeastTwo: " + atLeastTwo);
    }
}