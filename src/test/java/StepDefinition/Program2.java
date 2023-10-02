package StepDefinition;

public class Program2 {

    public static void main(String[] args) {
        String s = "toJadenCase hkjh jhjh hjh";
String[] vals=s.split(" ");
String t="";
for(int i=0;i<vals.length-1;i++)
{
    String value = vals[i];
    System.out.println("value is :"+value);
    char c = value.charAt(0);
    String s1 = String.valueOf(c).toUpperCase();
    String s2 =value.substring(1);
    String s3 = s1+s2;
    System.out.println("changed value is "+s3);
    t = t +s3 + " ";

}
        System.out.println(t);


    }
}
