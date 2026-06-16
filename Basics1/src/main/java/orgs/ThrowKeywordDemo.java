package orgs;


public class ThrowKeywordDemo {
    public static void checkAge(int age) throws ArithmeticException{
        if(age < 18){
            throw new ArithmeticException("Age is less than 18 come next year");
        }
        System.out.println
                ("Eligible to vote !!");
    }
    public static void main(String[] args){
        int age = 17;

        try{
            checkAge(age);
        }
        catch (ArithmeticException e){
            System.out.println("Exception handled by caller" + e);
        }

        System.out.println("age checked");


    }
}
