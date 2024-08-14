package String;

public class Method2 {

    public static void main(String[] args) {

        String country = "   My_country_name_is_Bangladesh   ";
        System.out.println(country);

        String s3 = country.trim();
        System.out.println(s3);

        int a = country.indexOf("co");
        System.out.println(" a= " + a);

        int b = country.lastIndexOf("a");
        System.out.println(" b= " + b);

        char c = country.charAt(16);
        System.out.println(" c= " + c);

        int d = country.codePointAt(15);
        System.out.println(" d= " + d);

        String e = country.replace('i', 'e');
        System.out.println(" e= " + e);

        String[] f = country.split("_");
        for (String x : f) {
            System.out.println(x);
        }

    }

}
