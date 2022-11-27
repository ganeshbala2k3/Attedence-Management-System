package Package1;
import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;
public class DataEntry implements  Allmethods {
    public String name;
    public int id;
    public int oops=0;
    public int totaloops=0;
    public int vlsi=0;
    public int totalvlsi=0;
    public int edcd=0;
    public int totaledcd=0;
    public int os=0;
    public int totalos=0;
    DataEntry()
    {
        
    }
    DataEntry(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public void displayStudents()
    {
        System.out.println("Name of the Student :" +name+"\n"+"Id no of Student :"+id+"\n");

    }

}

