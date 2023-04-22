package practice.patterns;


import java.util.Scanner;
public class Studentdetails {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email ");
        s.setEmail(sc.nextLine());

        System.out.println("Enter add ");
        s.setAdd(sc.nextLine());

        System.out.println("Email : "+ s.getEmail());
        System.out.println("add : "+ s.getAdd());
    }

}
