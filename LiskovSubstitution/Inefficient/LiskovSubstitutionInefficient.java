package DesignPrinciple.LiskovSubstitution.Inefficient;

// Registration Number : 2017331059
// As per the Liskov Substitution Principle,functions that use references to base classes must be able to use
// objects of the derived class without knowing it. In simple words, derived classes must be substitutable for
// the base class

class Human {
  public void Swimming() {
    System.out.println(
        "Swimmer can swim. it's mandatory for any swimmer to know how to swim otherwise he or she cannot be a swimmer");
  }
}

// abstract class Human {
// abstract public void Swimming();

// }

// Michael Phelps is a renownded Swimmer. Michael Phelps (United States) now
// holds the overall record with eight titles.
// Obviously He can swim so we can extend Swimmingmethod from Human class for
// MichaelPhelps class
class MichaelPhelps extends Human {

  @Override
  public void Swimming() {
    System.out.println(
        "Swimmer can swim. it's mandatory for any swimmer to know how to swim otherwise he or she cannot be a swimmer");

  }

}

// Two months Old baby cannot swim though he or she is a human being
class TwomonthsOldbaby extends Human {
  void eat() {
    System.out.println("Eating chips");
  }

  @Override
  public void Swimming() {
    System.out.println("Hey I'm swimming right now!!!");

  }
}

// Two months Old baby is Human but it can't Swim,TwomonthsOldbaby class is a
// subtype of class Human, but
// it shouldn't be able to use the Swimming method, that means we are breaking
// the LSP principle.
public class LiskovSubstitutionInefficient {
  public static void main(String[] args) {
    Human human1 = new MichaelPhelps();
    Human human2 = new TwomonthsOldbaby();
    human1.Swimming();
    human2.Swimming();
  }
}

// In the Efficient folder i have proposed a efficient code which follow liskov
// Substitution principle
