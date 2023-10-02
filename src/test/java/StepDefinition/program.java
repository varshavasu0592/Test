package StepDefinition;

import java.util.ArrayList;

public class program {

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        int countpeoplein=0;
        int countpeopleout=0;
        int finalout=0;
        for(int[] a :list)
        {


                countpeoplein = countpeoplein+a[0];
                countpeopleout = (countpeopleout+a[1]);
                finalout= countpeoplein-countpeopleout;

            System.out.println(countpeoplein);;
            System.out.println(finalout);;

        }
       // System.out.println(countpeoplein);;

        // second program

        String s = "My name is varsha";
        String[] arr = s.split(" ");
        String v="";
        String d="";
        for(int i=0;i<=arr.length-1;i++)
        {

            String value  = arr[i];
            System.out.println(value);
            for(int j=value.length()-1;j>=0;j--)
            {
                v = v + value.charAt(j);

            }
            System.out.println(v);
            d=d + v + "  ";

        }
        System.out.println(d);
        }

    }






