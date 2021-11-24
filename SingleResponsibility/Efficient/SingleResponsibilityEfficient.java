package DesignPrinciple.SingleResponsibility.Efficient;

import java.util.ArrayList;
// Registration Number : 2017331059

// In the Inefficient Folder the code does not follow Single Responsibility Principle, as Studet is not only
// handaling student details but also taken books and Attendence which violate the SRP.So I proposed this
// code below to solve the problem

//Student class now keep only track of Student details
class Student {
  private int regId;
  private String name;
  private String address;
  private int age;
  public ArrayList<String> list;

  public Student(int regId, String name, String address, int age) {
    this.regId = regId;
    this.name = name;
    this.address = address;
    this.age = age;
    this.list = new ArrayList<String>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRegId() {
    return regId;
  }

  public void setRegId(int regId) {
    this.regId = regId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getmyAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
// Every class now take responsibility of one.Attendence is
// handled by a single class and Taken book is handled by another class.

// separate class has been declared to handle Book record
class BookRecord {
  private Student st;

  public BookRecord(Student st) {
    this.st = st;
  }

  public void takenBook() {
    for (String x : st.list) {
      System.out.println(x);
    }
  }

  public void addBook(String str) {
    st.list.add(str);
  }

  public void removeBook(String str) {
    int count = -1;
    int found = 0;
    for (String x : st.list) {
      count++;
      if (x.equals(str)) {
        found++;
        break;
      }
    }
    if (count != -1 && found == 1) {
      st.list.remove(str);
    }
  }

}

// separate class hes been declared to handle Attendence count
class AttendanceTracker {
  private Student st;

  public AttendanceTracker(Student st) {
    this.st = st;
  }

  public String markAttendance() {
    return String.format("%s is present", st.getName());
  }
}

// Main Class
public class SingleResponsibilityEfficient {
  public static void main(String[] args) {

  }
}
