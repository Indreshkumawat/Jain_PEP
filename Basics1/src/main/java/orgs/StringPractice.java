package orgs;

public class StringPractice {
    public static void main(String[] args){

       String s3 = new String("Indresh");
        String s1 = "Indresh";

        String s2 = "Indresh";


        System.out.println(s1.length());

        System.out.println(s1.indexOf('r'));

        System.out.println(s1.charAt(6));

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String s4 = "INdresh";
        s4 = s4 + "Kumawat";
        System.out.println(s4);

        String s5 = s4.concat(" Hello ").concat("How r u").concat("Fine");

        System.out.println(s5);


        for(int  i = 0;i<s1.length();i++){
            char c = s1.charAt(i);
            System.out.println(c);
        }

        char [] name = s1.toCharArray();

        for(int i = 0;i<name.length;i++){
            System.out.println(name[i]);
        }


        for(char a : s1.toCharArray()){
            System.out.println(a);
        }

        StringBuilder s = new StringBuilder(s1);

        StringBuilder st = new StringBuilder("Indresh");

        System.out.println(st);

        st.append("Kumawat");

        System.out.println(st);

        st.append('H');

        System.out.println(st);

        st.insert(1,"DD");


        System.out.println(st);

        String s8 = "Indresh";

        StringBuilder newString = new StringBuilder();

        for(int i = s8.length() - 1; i>=0;i--){
            char c = s8.charAt(i);
            newString.append(c);
        }

        System.out.println(newString);



    }
}
