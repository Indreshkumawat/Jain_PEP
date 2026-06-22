package DSA;

public class SringsDemo {
    public static void main(String[] args){
        String s1 = "Indresh";
        String s2 = "Indresh";
        String s3 = new String("Indresh");

       // System.out.println(s1 +" " + s2        + " " +s3 );


        System.out.println(s1.equals(s3));

        for(int i = 0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
        for(char c : s1.toCharArray()){
            System.out.println(c);
        }

        char[] arr = s1.toCharArray();

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        String str = "I am a good Boy";

        int count = 0;
        for(int i = 0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                count++;
            }
        }

        System.out.println(count);

        StringBuilder st = new StringBuilder("Indresh");
       st.append("Kumawat");
        System.out.println(st);
//        st.insert(11," Hello ");
        st.insert(11,'a');
        System.out.println(st);


    }
}
