package Question_2;
import java.util.Scanner;

import javax.rmi.CORBA.StubDelegate;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter roll no");
        int roll = Integer.parseInt(sc.nextLine());


        System.out.println("Stdent name");
        String name = sc.nextLine();


        System.out.println("Student marks");
        int marks = Integer.parseInt(sc.nextLine());


        Student s1 = new Student();

        s1.DisplayDetails(int roll, name, marks);

        Student s2 = new Student();


        System.out.println("Enter manual-----");
        s2.DisplayDetails(21,"raman",600);


        sc.close();
    }
    
}
