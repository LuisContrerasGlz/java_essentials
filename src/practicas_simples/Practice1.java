package practicas_simples;

public class Practice1 {

    public static void main(String[] args) {

      // Single
      String str = "Payment $100 paid";
        System.out.println(str.charAt(8));

       //Multiple
        String str1="Payments $100 paid";
        System.out.println(str1.indexOf("$"));
        System.out.println(str1.substring(9));


        //Inverting a String

        String s = "Luis";
        String t = "";

        for (int i=s.length()-1; i>=0;i--)
        {

            t = t + s.charAt(i);

        }

        System.out.println(t);

    }
}
