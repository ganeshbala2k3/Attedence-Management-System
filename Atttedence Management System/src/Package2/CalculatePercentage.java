package Package2;
import Package1.DataEntry;
import java.util.Scanner;

public class CalculatePercentage {
    DataEntry obj[]=new DataEntry[1000];
    int n;
    public CalculatePercentage(int n,DataEntry obj[]){
        this.n=n;
        for(int i=0;i<n;i++)
        {
            this.obj[i]=obj[i];
        }
    }
    public void percentage()
    {
        try {
            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("Id No :" + obj[i].id + " " + "Name :" + obj[i].name + " ");
                System.out.println("OOPS ATTEDENCE PERCENTAGE :" + (((obj[i].oops) * 100) / (obj[i].totaloops)));
                System.out.println("EDCD ATTEDENCE PERCENTAGE :" + (((obj[i].edcd) * 100) / (obj[i].totaledcd)));
                System.out.println("VLSI ATTEDENCE PERCENTAGE :" + (((obj[i].vlsi) * 100) / (obj[i].totalvlsi)));
                System.out.println("OS ATTEDENCE PERCENTAGE :" + (((obj[i].os) * 100) / (obj[i].totalos)));
                System.out.println();

            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("NO ATTEDENCE PERCENTAGES WILL BE SHOWN IF CLASSES WERE NOT CONDUCTED");
        }
    }
    int temp;
    public void IndividualPercentage()
    {
        Scanner scn=new Scanner(System.in);
        try {
            System.out.println("Enter the id Number to Get Attedence :");
            int temp = scn.nextInt();
            for (int i = 0; i < n; i++) {
                if (temp == obj[i].id) {
                    System.out.println();
                    System.out.println("Id No :" + obj[i].id + " " + "Name :" + obj[i].name + " ");
                    System.out.println("OOPS ATTEDENCE PERCENTAGE :" + (((obj[i].oops) * 100) / (obj[i].totaloops)));
                    System.out.println("EDCD ATTEDENCE PERCENTAGE :" + (((obj[i].edcd) * 100) / (obj[i].totaledcd)));
                    System.out.println("VLSI ATTEDENCE PERCENTAGE :" + (((obj[i].vlsi) * 100) / (obj[i].totalvlsi)));
                    System.out.println("OS ATTEDENCE PERCENTAGE :" + (((obj[i].os) * 100) / (obj[i].totalos)));
                    System.out.println();
                }
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("NO ATTEDENCE PERCENTAGES WILL BE SHOWN IF CLASSES WERE NOT CONDUCTED");

        }
    }




}

