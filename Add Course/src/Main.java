import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        Course c = new Course("Database","D1","D123",2);
        Course c2 = new Course("Java","D2","J123",2);
        Course c3 = new Course("Python","D3","P123",2);
        Course c4 = new Course("Oracle","OR1","O123",3);
        Course c5 = new Course("Software Engineering","SE1","SE123",3);

        Student s = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();


        c.studentEntry();
        System.out.println("Select The Course You Want To Assign:\n 1. Database, \n2. Java. \n 3. Python. \n 4. Oracle. \n 5. Software Engineering");
        int choice = read.nextInt();
        switch(choice)
        {
            case 1:
                s.assigningCourses(c);
                break;
            case 2:
                s2.assigningCourses(c2);
                break;
            case 3:
                s3.assigningCourses(c3);
                break;
            case 4:
                s4.assigningCourses(c4);
                break;
            case 5:
                s5.assigningCourses(c5);
                break;
            default:
                System.out.println("Invalid Selection");
        }





    }
}


class Course extends Student{
    String courseName;
    String doctorName;
    String code;
    int hours;

    Course( String n, String dn, String c, int h){

        courseName = n;
        doctorName = dn;
        code = c;
        hours = h;
    }

    String getName(){
        return courseName;
    }
    String getDoctorName(){
        return doctorName;
    }
    String getCode(){
        return code;
    }
    int getHours(){
        return hours;
    }
    List<Student> students = new ArrayList<>();
    void assigninEntry(Course course){
        courses.add( course);
    }



}
class Student{

    String id;
    String studentName;

    //constraction
    //Student(String sn, String sid){
    // studentName = sn;
    // id = sid;

    //}
    //String getSName(){
    //   return studentName;
    //}
    //String getId(){
    //    return id;
    //}


    List<Course> courses = new ArrayList<>();

    void assigningCourses(Course course){
        courses.add( course);
    }

    List<Course> getCourses(){
        return courses;
    }

    void studentEntry(){
        Scanner read = new Scanner(System.in);
        System.out.println("Course Registraion Sysetme ");
        System.out.println("Enter Your Student ID: ");
        id = read.next();
        System.out.println("Enter Your Student Name: ");
        studentName = read.next();



    }


}
