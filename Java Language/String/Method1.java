package String;

public class Method1 {

    public static void main(String[] args) {
        String s1 = "Shoaib ahmed";
        String s2 = new String("Shoaib Ahmed");

        System.out.println("s1= " + s1);
        System.out.println("s2= " + s2);

        int len = s1.length();
        System.out.println("len= " + len);

        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        boolean con = s1.contains(s2);//check s1 and s2 equal or not equal
        System.out.println("con = " + con);

        boolean result = s1.isEmpty();
        System.out.println("result = " + result);

        String fullname = s1.toUpperCase();
        System.out.println("fullname of UpperCase= " + fullname);

        String fullname1 = s1.toLowerCase();
        System.out.println("fullname of LowerCase " + fullname1);

        boolean a = s2.startsWith("Sh");
        System.out.println("a = " + a);

        boolean b = s2.endsWith("ad");
        System.out.println("b = " + b);

    }

}
