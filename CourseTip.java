package ICY;

/**
 * Created by Tofunmi Seun on 02/10/2015.
 */

public class CourseTip {
    Student tipGiver;
    Course theCourse;
    double rating;
    int userCount;
    int totalRating;
    String tip;

    //Constructor
    public CourseTip(String theTip, Student tipGiver)
    {
        this.tip = theTip;
        this.tipGiver = tipGiver;
        this.userCount = 0;
        this.totalRating = 0;
        this.rating = 0;
    }

    //Accessors.
    public void rateTip(int rating)
    {
        this.totalRating += rating;
        this.userCount++;
        this.setRating();
    }

    public double getRating() {
        return rating;
    }

    void setRating() {
        this.rating = totalRating / userCount;
    }

    public String getTip()
    {
        return this.tip.toUpperCase();
    }

    public String getTipGiverName()
    {
        return tipGiver.getFirstName() + " " + tipGiver.getLastName();
    }
}
