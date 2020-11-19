package _8_string_format;

public class SimpleStringFormat {
    public static void main(String[] args) {

        int david = 17, dawson = 15, dillon = 8, gordan = 6;
        String s1 = "My nephews are "+ david +"," + dawson +","
                + dillon + ", and " + gordan +" years old";
        String s2 =String.format("My nephews are %d, %d ,%d, and %d years old",david,dawson,dillon,gordan);
        System.out.println(s1);
        System.out.println(s2);

        //
        double avgDiff = (david - gordan) / 3.0d;
        String s4 = String.format("The average age between each is %.1f years" , avgDiff);
        System.out.println(s4);

        //format flag
        int iVal = 32;
        String flag1 = String.format("%d", iVal);
        String flag2 = String.format("%#x", iVal);
        System.out.println(flag1);
        System.out.println(flag2);

        //
        int w = 5, x = 235, y = 481, z = 12;
        String s5 = String.format("W:%d X:%d",w,x);
        System.out.println(s5);

    }
}
