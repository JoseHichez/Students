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
   import java.util.Arrays;


   public class StudentTest
{

//Creation of student list
private static ArrayList<Student> studentList = new ArrayList<Student>();


   public StudentTest()
{
   Student student1 = new Student(1, "Angel", new ArrayList<String>(Arrays.asList("COP1105", "COP3250"))); 


   Student student2 = new Student(2, "Destiny", new ArrayList<String>(Arrays.asList("COP2250", "COP3250", "COP4250", "COP1210")));


   Student student3 = new Student(3, "Andreas", new ArrayList<String>(Arrays.asList("COP3337", "COP3530", "COP2250")));


   Student student4 = new Student(4, "James", new ArrayList<String>(Arrays.asList("COP3250", "COP4250", "COP1210")));


   Student student5 = new Student(5, "Jamie", new ArrayList<String>(Arrays.asList("COP3337", "COP3530", "COP1210")));


   Student student6 = new Student(6, "Claudia", new ArrayList<String>(Arrays.asList("COP3530", "COP1105", "COP3250")));


   Student student7 = new Student(7, "Denise", new ArrayList<String>(Arrays.asList("COP2210", "COP2250", "COP4569")));


   Student student8 = new Student(8, "Andy", new ArrayList<String>(Arrays.asList("COP2253", "COP3258", "COP3259)));


   Student student9 = new Student(9, "Victor", new ArrayList<String>(Arrays.asList("COP2210", "COP2212", "COP2213")));


   Student student10 = new Student(10, "Kane", new ArrayList<String>(Arrays.asList("COP2210", "TOC2213", "COP5555")));


   Student student11 = new Student(11, "Ginny", new ArrayList<String>(Arrays.asList("COP3240", "COP3204", "COP3280")));


   Student student12 = new Student(12, "Bob", new ArrayList<String>(Arrays.asList("COP3250", "COP8888", "COP3259")));


   Student student13 = new Student(13, "Vicky", new ArrayList<String>(Arrays.asList("COP3250", "COP3350", "COP2250")));


   Student student14 = new Student(14, "Bane", new ArrayList<String>(Arrays.asList("COP2450", "COP3240")));


   Student student15 = new Student(15, "Sammy", new ArrayList<String>(Arrays.asList("COP3222", "COP3015", "COP3555")));

// Add the students records into list


   studentList.add(student1);


   studentList.add(student2);


   studentList.add(student3);


   studentList.add(student4);


   studentList.add(student5);


   studentList.add(student6);


   studentList.add(student7);


   studentList.add(student8);


   studentList.add(student9);


   studentList.add(student10);


   studentList.add(student11);


   studentList.add(student12);


   studentList.add(student13);


   studentList.add(student14);


   studentList.add(student15);
}

   public static void main(String[] args)
{
   StudentTest lab = new StudentTest();


   lab.sortList();


   lab.displayList();
}

// create a method of sortList

public void sortList()

{


   for (int x = 0; x < studentList.size()-1; x++)

{


   for (int y = x+1; y < studentList.size(); y++)

{

// store the student record in the associated location

   Student s1 = studentList.get(x);



   Student s2 = studentList.get(y);



// checking the overlap condition

   if (s1.getLastName().compareTo(s2.getLastName()) > 0)

{

// comparing the student ID availability

   Student temp = s1;

// check the studentList record

   studentList.set(x, s2);


   studentList.set(y, temp);

}

}

}

}

//Sorting the list in ascending order by student last name to display the list

   public void displayList() 
{


   System.out.println("Sorted the student record list in ascending order by student last name: \n");

   for (Student s : studentList) 
{

//adding leading 0s to display

   System.out.printf("%04d, %s\t", s.getID(), s.getLastName());



   ArrayList<String> courses = s.getCourses();

   for (int i = 0; i < courses.size(); i++)
{



   if (i == courses.size() - 1)

{

   System.out.printf("%s\n", courses.get(i));

} 
 

   else
{


   System.out.printf("%s, ", courses.get(i));

}

}

}

}

}

