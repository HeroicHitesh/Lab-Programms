/** Design a superclass called Staff with details as StaffId, Name, Phone, Salary.
Extend this class by writing three subclasses namely Teaching (domain,
publications), Technical (skills), and Contract (period). Write a Java program to
read and display at least 3 staff objects of all three categories. */

package staff;
import java.util.*;
class Staff {
    int staffId;
    String name;
    long phone;
    float salary;
    void getSdetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the staff ID: ");
        staffId = in.nextInt();
        System.out.println("Enter the staff name: ");
        name = in.next();
        System.out.println("Enter the staff phone no.: ");
        phone = in.nextLong();
        System.out.println("Enter the staff salary: ");
        salary = in.nextFloat();
    }
    void putSdetails() {
        System.out.println("Staff Id: " + staffId);
        System.out.println("Staff Name: " + name);
        System.out.println("Staff Phone no.: " + phone);
        System.out.println("Staff Salary: " + salary);
        System.out.println();
    }
}

class Teaching extends Staff {
    String domain;
    String publication;
    void getTdetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the domain: ");
        domain = in.nextLine();
        System.out.println("Enter the publication: ");
        publication = in.nextLine();
    }
    void putTdetails() {
        System.out.println("Domain: " + domain);
        System.out.println("Publication: " + publication);
        System.out.println();
    }
}

class Technical extends Staff {
    String skills;
    void getT1details() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the skills: ");
        skills = in.nextLine();
    }
    void putT1details() {
        System.out.println("Skills: " + skills);
        System.out.println();
    }
}

class Contract extends Staff {
    String period;
    void getCdetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the period: ");
        period = in.nextLine();
    }
    void putCdetails() {
        System.out.println("Period: " + period);
        System.out.println();
    }
}

class Inheritance {
    public static void main(String[] args) {
        System.out.println("Enter the no of staff: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Staff sf[] = new Staff[n];
        Teaching t[] = new Teaching[n];
        Technical t1[] = new Technical[n];
        Contract c[] = new Contract[n];
        for (int i = 0; i < n; i++) {
            sf[i] = new Staff();
            t[i] = new Teaching();
            t1[i] = new Technical();
            c[i] = new Contract();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of Staff " + (i+1));
            sf[i].getSdetails();
            t[i].getTdetails();
            t1[i].getT1details();
            c[i].getCdetails();
        }
        System.out.println("..............................");
        for (int i = 0; i < n; i++) {
            System.out.println("The details of staff " + (i + 1));
            sf[i].putSdetails();
            t[i].putTdetails();
            t1[i].putT1details();
            c[i].putCdetails();
            System.out.println("...............................");
        }
    }
}
