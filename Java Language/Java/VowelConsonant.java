

package javacode1.vowelconsonant;

import java.util.Scanner;


public class VowelConsonant {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter:");
        ch=input.next().charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')
        {
        System.out.println("Vowel");
        }
        else if(ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U')
        {
        System.out.println("Vowel");
        }
        else
        {
        System.out.println("Consonant");
        }
    }
}
