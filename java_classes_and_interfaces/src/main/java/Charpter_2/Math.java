package Charpter_2;

public class Math {

    public static void main(String[] args) {

    }

    static void performCalculations(){
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] righrVals = {50.0d, 92.0d, 17.0d, 3.0d};

        char[] opcodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opcodes.length];

    }

    static double execute(char opCode, double leftVal, double rigthVal){
        double result;
        switch (opCode){
            case 'a':
                result = leftVal + rigthVal;
                break;
            case 's':
                result = leftVal - rigthVal;
                break;
            case 'm':
                result = leftVal * rigthVal;
                break;
            case 'd':
                result = rigthVal != 0 ? leftVal / rigthVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }

        return result;
    }


}
