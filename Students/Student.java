/*********************************************************************
Author : Jose Hichez
Course : COP4814
Professor : Caryl Rahn
Program : 1
Purpose : This program is meant to take a list of courses and student names and sort in order as the output.
Due Date : 09/06/2020
Certification:
I hereby certify that this work is my own and none of it is the work of any other person.
..........{ Jose Hichez }..........
*********************************************************************/
   import java.util.ArrayList;


   public class Student

{
   private int ID;


   private String lastName;


   private ArrayList<String> courses;


   public Student(int id, String lastName, ArrayList<String> courses)

{

   ID = id;


   this.lastName = lastName;


   this.courses = courses;

}

   public ArrayList<String> getCourses() 
{


   return courses;

}

// create method to set the course

   public void setCourses(ArrayList<String> courses) 
{



   this.courses = courses;

}

// create method to get the ID

   public int getID() 
{

   return ID;

}

// create method to set the student ID

   public void setID(int id) 
{


   ID = id;

}

// create method to get the last name

   public String getLastName() 
{

   return lastName;

}

// create method to set the last name

   public void setLastName(String lastName)
{

   this.lastName = lastName;

}

}