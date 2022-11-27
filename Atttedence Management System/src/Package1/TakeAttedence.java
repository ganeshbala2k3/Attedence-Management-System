package Package1;
import javax.xml.crypto.Data;
import java.util.*;
public class TakeAttedence {
    int n;
    DataEntry obj[]=new DataEntry[1000];
    TakeAttedence(int n,DataEntry obj[])
    {
        this.n=n;
        for(int i=0;i<n;i++)
        {
            this.obj[i]=obj[i];
        }
    }
    Scanner scn=new Scanner(System.in);
    String yesorno;
    String ans="p";
    void attedence(int n)
    {
        for(int i=0;i<n;i++) {
            System.out.print("OOPS for " + obj[i].name + ":");
            yesorno = scn.nextLine();
            if (yesorno.equalsIgnoreCase(ans) == true) {
                obj[i].oops = obj[i].oops + 1;
            }
        }
            System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print("Edcd for " + obj[i].name + ":");
            yesorno = scn.nextLine();
            if (yesorno.equalsIgnoreCase(ans) == true) {
                obj[i].edcd = obj[i].edcd + 1;
            }
        }
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print("VLSI for " + obj[i].name + ":");
            yesorno = scn.nextLine();
            if (yesorno.equalsIgnoreCase(ans) == true) {
                obj[i].vlsi = obj[i].vlsi + 1;
            }
        }
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print("OS for " + obj[i].name + ":");
            yesorno = scn.nextLine();
            if (yesorno.equalsIgnoreCase(ans) == true) {
                obj[i].os = obj[i].os + 1;
            }
        }
        for(int i=0;i<n;i++) {
            obj[i].totaledcd++;
            obj[i].totaloops++;
            obj[i].totalos++;
            obj[i].totalvlsi++;
        }

    }
    void display(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Number of present in Oops for :"+ obj[i].id+":"+obj[i].oops);
            System.out.println("Number of present in Edcd for :"+ obj[i].id+":"+obj[i].edcd);
            System.out.println("Number of present in Vlsi for :"+ obj[i].id+":"+obj[i].vlsi);
            System.out.println("Number of present in OS for   :"+ obj[i].id+":"+obj[i].os);
            System.out.println();
            System.out.println();
            System.out.println("Total Oops :"+ obj[i].id+":"+obj[i].totaloops);
            System.out.println("Total Edcd :"+ obj[i].id+":"+obj[i].totaledcd);
            System.out.println("Total Vlsi :"+ obj[i].id+":"+obj[i].totalvlsi);
            System.out.println("Total OS   :"+ obj[i].id+":"+obj[i].totalos);

        }

    }
}
