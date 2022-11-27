package Package1;
import Package2.*;
import javax.xml.crypto.Data;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String name;
        int id;
        int n;
        int demo;
        System.out.println("No of Students in a Class");
        n = scn.nextInt();
        DataEntry obj[] = new DataEntry[1000];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of Student");
            name = scn.next();
            System.out.println("Enter the id number");
            id = scn.nextInt();
            obj[i] = new DataEntry(name, id);
        }
        while(true)
        {
            System.out.println("Enter Your Choice");
            System.out.println("1.Display Students");
            System.out.println("2.Take Attendence");
            System.out.println("3.Add New Student");
            System.out.println("4.Display Percentage");
            System.out.println("5.Individual Percentage");
            demo=scn.nextInt();
            switch(demo){
            case 1:
                for (int i = 0; i < n; i++) {
                    obj[i].displayStudents();
                }
                break;
            case 2:
                TakeAttedence ta = new TakeAttedence(n, obj);
                ta.attedence(n);
                ta.display(n);
                break;
                case 3:
                    n++;
                    String demo1=scn.next();
                    int demo2=scn.nextInt();
                    obj[n-1]=new DataEntry(demo1,demo2);
                    break;
                case 4:
                    TakeAttedence ss=new TakeAttedence(n,obj);
                    CalculatePercentage ca=new CalculatePercentage(n,obj);
                    ca.percentage();
                    break;
                case 5:
                    TakeAttedence kk=new TakeAttedence(n,obj);
                    CalculatePercentage pp=new CalculatePercentage(n,obj);
                    pp.IndividualPercentage();
                    break;
            default:
                System.out.println("Wrong input");
                break;
        }
        }
    }
    static {
        System.out.println("*******WELCOME TO ERP*******");
    }
}
