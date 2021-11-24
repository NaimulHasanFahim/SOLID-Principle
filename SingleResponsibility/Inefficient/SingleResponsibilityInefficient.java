package DesignPrinciple.SingleResponsibility.Inefficient;

import java.util.ArrayList;
// Registration Number : 2017331059
// As the name suggests, this principle states that each class should have one responsibility, one single purpose
// Single Responsibility Principle was defined by Robert C. Martin as –
// →A class should have only one reason to change.

// i have made this class to help a library to track of the books taken by student. The age is taken to see the to track which age of people taking which book
// Here Student class keeps a list which track the number of books and their names taken by a particular student
class Student {
  private int regId;
  private String name;
  private String address;
  private int age;
  private ArrayList<String> list;

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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // keeping track of taken books should not be responsibility of student
  public void takenBook() {
    for (String x : list) {
      System.out.println(x);
    }
  }

  public void addBook(String str) {
    list.add(str);
  }

  public void removeBook(String str) {
    int count = -1;
    int found = 0;
    for (String x : list) {
      count++;
      if (x.equals(str)) {
        found++;
        break;
      }
    }
    if (count != -1 && found == 1) {
      list.remove(str);
    }
  }

  // To Show the Attendence
  public String markAttendance() {
    return String.format("%s is present", name);
  }
}

public class SingleResponsibilityInefficient {
  public static void main(String[] args) {
    Student student = new Student(2017331059, "Naimul Hasan", "Akhaliya,Surma", 29);
    student.addBook("Data Science");
    student.addBook("Algorithm");
    System.out.println(student.getAddress());
    System.out.println(student.getAge());
    student.takenBook();
    student.removeBook("Data Science");
    student.takenBook();
  }
}
// This Code do not follow Single responsibility principle as Student class not
// only deals with Student
// details but it is also concerned with the implementation about
// books,markAttendence method. It has
// now three reasons to change. In the efficient folder I proposed a solution
// which follow SRP
