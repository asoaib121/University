package String;

public class StringB {

    public static void main(String[] args) {

        //String Buffer
        StringBuffer a = new StringBuffer("Shoaib");
        System.out.println(a);

        a.append(" Ahmed");
        System.out.println(a);

        

        a.delete(0, 6);
        System.out.println(a);
        
        a.setLength(6);
        System.out.println(a);
        
        a.reverse();
        System.out.println(a);
        
    }
}
