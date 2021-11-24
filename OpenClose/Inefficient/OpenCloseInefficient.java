package DesignPrinciple.OpenClose.Inefficient;

// Registration Number : 2017331059

// The open–closed principle states  Software entities (classes, modules, functions, etc.) should be open for
//extension,but closed for modification.”

// In the below code I have implemented a class named TheoryCourse which store the details of TheoryCourse.
// A CourseManager to give update of Assignment submission

class TheoryCourse {
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
}

final class CourseManager {
  public void SubmitAssignment(TheoryCourse csname) {
    System.out.println("Submitted Theory Assignment of Course : " + csname.getCourseName());
  }
}

// New Case Came up
// Going further we have to implement lab course. Let's add some code to
// accomplish that.
// Lab Course details are although same as TheoryCourse but also extra
// information like
// number of group and Lab Assistance name

class LabCourse extends TheoryCourse {
  private int numberofgroup;
  private String LabAssistance;

  public LabCourse(String CourseName, int CourseCode, int numberofgroup, String LabAssistance) {
    super(CourseName, CourseCode);
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
}

// Now, we have Two types of Courses in place. Let's update our CourseManager
// class to handle new case.
final class CourseManager1 {
  public void SubmitAssignment(TheoryCourse csname) {
    if (csname instanceof LabCourse) {
      System.out.println("Assignment with code has been sybmitted for : " + csname.getCourseName() + " Lab Course");
    } else {
      System.out.println("Assignment has been sybmitted for : " + csname.getCourseName() + " Theory Course");
    }
  }
}

// Main Class
public class OpenCloseInefficient {
  public static void main(String[] args) {

  }
}
// This works!
// But, it violates the OCP since CourseManager class is
// Closed for extension
// Open for modification
// If we want to add online taken course submission then we have to again modify
// CourseManager which is not a good design of code
