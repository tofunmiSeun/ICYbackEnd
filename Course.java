package ICY;

/**
 * Created by Tofunmi Seun on 02/10/2015.
 */
public class Course {
    private String courseName;
    private String courseCode;
    private int courseUnit;
    private Enum.Semester semesterTaken;
    //Constructor.
    public Course(String courseName, int unit, Enum.Semester semester)
    {
        this.courseName = courseName;
        this.courseUnit = unit;
        this.semesterTaken = semester;
    }
    public Course(String courseName, String courseCode, int unit, Enum.Semester semester)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseUnit = unit;
        this.semesterTaken = semester;
    }

    //Accessors.
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public int getCourseUnit() {
        return courseUnit;
    }
    public Enum.Semester getSemesterTaken() {
        return semesterTaken;
    }

}
