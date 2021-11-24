package DesignPrinciple.OpenClose.Efficient;

// Registration Number : 2017331059

interface Course {
  public void SubmitAssignment();
}

class TheoryCourse implements Course {
  public String CourseName;
  private int CourseCode;

  public TheoryCourse(String CourseName, int CourseCode) {
    this.CourseName = CourseName;
    this.CourseCode = CourseCode;
  }

  public String getCourseName() {
    return CourseName;
  }

  public void setCourseName(String CourseName) {
    this.CourseName = CourseName;
  }

  public int getCourseCode() {
    return CourseCode;
  }

  public void setCourseCode(int CourseCode) {
    this.CourseCode = CourseCode;
  }

  public void SubmitAssignment() {
    System.out.println("Assignment has been sybmitted for : " + CourseName + " Theory Course");
  }
}

class LabCourse implements Course {
  private int numberofgroup;
  private String LabAssistance;
  public TheoryCourse Coursedata;

  public LabCourse(String CourseName, int CourseCode, int numberofgroup, String LabAssistance) {
    this.Coursedata = new TheoryCourse(CourseName, CourseCode);
    this.numberofgroup = numberofgroup;
    this.LabAssistance = LabAssistance;
  }

  public int getnumberofgroup() {
    return numberofgroup;
  }

  public void setCourseCode(int numberofgroup) {
    this.numberofgroup = numberofgroup;
  }

  public String getLabAssistantName() {
    return LabAssistance;
  }

  public void setLabAssistanceName(String LabAssistance) {
    this.LabAssistance = LabAssistance;
  }

  public void SubmitAssignment() {
    System.out.println("Assignment with code has been sybmitted for : " + Coursedata.CourseName + " Lab Course");
  }
}

final class CourseManager {
  public void SubmitAssignment(Course csname) {
    csname.SubmitAssignment();
  }
}

// Here we go! Going further if we have a new requirement to add different types
// of Assignment
// submission for different Courses we can create a new class, implement the
// Course interface and
// we are done. No need to modify any existing code.

// Main Class
public class OpenCloseEfficient {
  public static void main(String[] args) {
    TheoryCourse theoryCourse = new TheoryCourse("Introduction to Algorithm", 331);
    LabCourse labCourse = new LabCourse("Data Structure ", 201, 50, "Rakkit da");

    CourseManager courseManager = new CourseManager();
    courseManager.SubmitAssignment(theoryCourse);
    courseManager.SubmitAssignment(labCourse);
  }
}
