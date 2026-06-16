package orgs;

public class FinallyBlock {
    public static void main(String[] args){
        try{
            int ans = 25/0;

        } catch (NullPointerException e) {
            System.out.println("Handled");
        }
        finally {
            System.out.println("Inside finally ");
        }
        System.out.println("Executed properly");

        String s = null;


    }
}
