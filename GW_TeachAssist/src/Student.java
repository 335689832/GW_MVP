public class Student {
    
    //Attributes
    String firstName;
    String lastName;
    String studentNumber; 
    int mark1,mark2,mark3,mark4,average; 

    //Constructor
    public Student(){
    }

    //Getters/Setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public void setMark4(int mark4) {
        this.mark4 = mark4;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public int getMark4() {
        return mark4;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int getAverage() {
        return average;
    }
}
