package Student;

/**
 * Created by Arif Zeeshan on 3/7/2017.
 * Create a class Student

 Problem Statement

 Create a class Student that contains the following fields – name (of type string), marks(of type int[]).
 Define another class TestStudent, where a main method is defined.
 The main method should creates a Student object with name as "Bill" and marks as {88,92,76,81,83} and print it.
 */
class Student
{
    String name;
    int [] marks={88,92,76,81,83};
}
class TestStudent
{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Bill";
        System.out.println(s1.name);
        for (int i=0;i<s1.marks.length;i++)
        {
            System.out.println(s1.marks[i]);

        }
    }
}

/**
 * Student2

 Problem Statement

 Adding to the previous problem, modify the class TestStudent and add a function totalMarks(Student st).
 This function takes a Student as input and returns the total marks of the student.
 */

class TestStudentA
{
    public static int totalMarks(Student st)
    {
        int sum=0;
        for (int i=0;i<st.marks.length;i++)
        {
            sum=sum+st.marks[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.name="Bill";
        totalMarks(s1);
    }
}
/**
 * Student3

 Problem Statement

 Adding to the previous problem, modify the class TestStudent and add a function betterStudent(Student st1, Student st2).
 This function takes two Student's as input and returns the Student with the higher total marks.
 */
class TestStudentB
{
    public static int totalMarks(Student st)
    {
        int sum=0;
        for (int i=0;i<st.marks.length;i++)
        {
            sum=sum+st.marks[i];
        }
        return sum;
    }
    public static Student betterStudent(Student st1,Student st2)
    {
        int sum=0;
        int sum1=0;
        for (int i=0;i<st1.marks.length;i++)
        {
            sum=sum+st1.marks[i];
        }
        for (int i=0;i<st2.marks.length;i++)
        {
            sum1=sum1+st2.marks[i];
        }
        if (sum>sum1)
        {
            return st1;
        }
        else
            return st2;
    }

    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        s2.name="Kill";
        s1.name="Bill";
        totalMarks(s1);
        totalMarks(s2);
        betterStudent(s1,s2);
    }
}
