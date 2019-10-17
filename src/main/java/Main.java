public class Main {
    public static void main(String[] args) {//        System.out.println("Hello world");
        if(!existsNumberArgument(args)){
            System.out.println("No numeric arguments");
            getPrimeNumbers(2L, 100L);
            return;
        } else {
            if(args.length < 3){
                System.out.println("Not enough arguments");
                getPrimeNumbers(2L, 100L);
                return;
            }
            System.out.println("Enough attributes:");
            double[] numbers = new double[3];
            boolean badArguments = false;
            for(int i = 0; i < 3 ; i++){
                try {
                    numbers[i] = Double.valueOf(args[i]);
                    System.out.println(args[i] + " - is number"); //e.printStackTrace();
                } catch (NumberFormatException e) {
                    System.out.println(args[i] + " - is not number"); //e.printStackTrace();
                    badArguments = true;
                }
            }
            if(badArguments){
                getPrimeNumbers(2L, 100L);
                return;
            }else{
                System.out.println("Middle number is " + getMathMiddle(numbers));
            }
        }
    }

    static double getMathMiddle(double[] numbers){
        double sum = 0d;
        int count = numbers.length;
        for(int i = 0; i < count; i++){
            sum+=numbers[i];
        }
        return sum/(double) count;
    }

    static void getPrimeNumbers(long beginNumber, long endNumber){
        System.out.println("Getting Primal numbers from " + beginNumber + " to " + endNumber);
        boolean thisIsPrime;
        for(long currentNumber = beginNumber; currentNumber <= endNumber; currentNumber++){
            thisIsPrime = true;
            for(long someNumber = 2; someNumber < currentNumber; someNumber++){
                if(currentNumber % someNumber == 0d) {
                    thisIsPrime = false;
                    continue;
                }
            }
            if(thisIsPrime){
                System.out.print(currentNumber + " ");
            }
        }
    }

    static boolean existsNumberArgument(String[] args) {
        boolean numberExists = false;
        for(int i = 0; i < args.length; i++){
            if(args[i].chars().allMatch(Character::isDigit)){
                return(true);
            };
        }
        return(false);
    }
}
