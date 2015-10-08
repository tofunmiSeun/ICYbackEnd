package ICY;

/**
 * Created by Tofunmi Seun on 02/10/2015.
 */

public class Student {
    //Personal details
    private String firstName;
    private String lastName;
    private Enum.Gender studentGender;
    private int studentAge;
    //School details
    private University studentSchool;
    private CourseOfStudy courseOfStudy;
    private Enum.Year studentYear;
    private double cgpa;
    CourseDetails courseDetails;

    //Constructor.
    public Student (String firstName, String lastName, Enum.Gender gender, int age, University university, CourseOfStudy courseOfStudy,
                    Enum.Year schoolYear)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAge = age;
        this.studentGender = gender;
        this.studentSchool = university;
        this.courseOfStudy = courseOfStudy;
        this.studentYear = schoolYear;
    }

    //Accessors.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Enum.Gender getStudentGender() {
        return studentGender;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void IncreaseStudentAge() {
        this.studentAge = this.studentAge + 1;
    }

    public University getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(University studentSchool) {
        this.studentSchool = studentSchool;
    }

    public CourseOfStudy getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(CourseOfStudy courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public Enum.Year getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(Enum.Year studentYear) {
        this.studentYear = studentYear;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

}
