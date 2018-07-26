// Program Name      project3.Java
//Course:            CSE1301J(Java)-section 002
//Student Name:      Juan Aguirre
//Assignment#        Project 3 
//Due Date:          9/21/2014
//Purpose: Code a program to accept any two days in the format of month day and year, in addition also will calculate the difference of days between two dates.

import java.io.*;
import java.util.Scanner;

public class project3 {

public static void main (String args [])throws IOException
   {
    Scanner scan = new Scanner (new File ("Date.txt"));
   for(int i = 1; i <=6;++i)
   {
   
   int total =0;
   int m1 = scan.nextInt();
   int d1 = scan.nextInt();
   int y1 = scan.nextInt();
   int m2 = scan.nextInt();
   int d2 = scan.nextInt();
   int y2 = scan.nextInt();
   Date date1 = new Date(m1,d1,y1);
   Date date2 = new Date(m2,d2,y2);
   total = date1.subtract(date2);
   System.out.println (m1+ "/" +d1+ "/" + y1 + "\t" + m2+ "/" + d2 + "/" + y2 + " Total Days = " + total);
   }
   System.out.println("Coded by Juan Aguirre");
   }
   }
      
      
      

