public class HandsOn {
    public static void main(String[] args) {
        int doubleMeInput = 8;
        System.out.println("this is the initial value: " + doubleMeInput);
        int doubleMeOutput = doubleMe(doubleMeInput);
        System.out.println("This is the value after the doubleMe method: " + doubleMeOutput );
        int quadrupleMeInput = 3;
        System.out.println("this is the initial value: " + quadrupleMeInput);
        int quadrupleMeOutput = quadrupleMe(quadrupleMeInput);
        System.out.println("This is the output: " + quadrupleMeOutput);
        int doubleMeTimesInput = 2;
        int doubleMeTimesCountInput = 3;
        int doubleMeTimesOutput = doubleMeTimes(doubleMeTimesInput,doubleMeTimesCountInput);
        System.out.println("this is the initial value: " + doubleMeTimesInput);
        System.out.println("this is the initial count value: " + doubleMeTimesCountInput);
        System.out.println("this is the initial value: " + doubleMeTimesOutput);


    }
    public static int doubleMe(int val){
       return val * 2;
    }
    public static int quadrupleMe(int val){
        return doubleMe(val)*2;

    }
    public static int doubleMeTimes(int val, int count){
        while(count !=0){
            val = doubleMe(val);
            count--;
        }
        return val;
    }
}

