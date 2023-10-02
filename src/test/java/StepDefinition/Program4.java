package StepDefinition;

import java.util.Arrays;

public class Program4 {


    public static int reversedigit(int a )
    {
        String numdigit = String.valueOf(a);
        char[] chars = numdigit.toCharArray();
        Arrays.sort(chars);
        String s = chars.toString();
    StringBuilder d = new StringBuilder(new StringBuilder(new String(chars)).reverse().toString());

        return Integer.parseInt(String.valueOf(d));
    }

    public static String complement(String DNA)
    {
        String val="";
        for (int i=0;i<=DNA.length()-1;i++)
        {

            char c = DNA.charAt(i);

            if(String.valueOf(c).equals("A"))
            {
                c='T';
            }
            else if(String.valueOf(c).equals("T"))
            {
                c='A';
            }
            else if(String.valueOf(c).equals("C"))
            {
                c='G';
            }
            else if(String.valueOf(c).equals("G"))
            {
                c='C';
            }
            val = val+c;
        }
        System.out.println(val);
        return val;
    }
    public static void main(String[] args) {

        int a = reversedigit(68790);
        System.out.println(a);
String s = complement("ATTGC");
        System.out.print(s);

    }
}
