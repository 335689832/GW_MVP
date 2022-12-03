public class Course {
    
    //Attributes
    private String courseName;
    private int assessNum;

    public Course(){
        this.assessNum = 10;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAssessNum() {
        return assessNum;
    }

    public void setAssessNum(int assessNum) {
        this.assessNum = assessNum;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
