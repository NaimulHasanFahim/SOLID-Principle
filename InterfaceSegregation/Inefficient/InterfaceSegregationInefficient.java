package DesignPrinciple.InterfaceSegregation.Inefficient;

// Registration Number : 2017331059
//Robert C. Martin as: “Clients should not be forced to depend upon interfaces that they do not use“.
//The goal of this principle is to reduce the side effects of using larger interfaces by breaking
//application interfaces into smaller ones.

// In this file I implemented a Play interface which has methods for different uses.

interface Play {
  void compete();

  void swimming();

  void longJump();

  void highJump();
}

// I have added the method compete, but also there some extra methods like swim,
// highJump , and longJump.

// Suppose that Fahim want only to join swimming. By implementing the Play
// interface, we have to implement
// methods like highJump and longJump, which Fahim will never participate.

class Fahim implements Play {

  @Override
  public void compete() {
    System.out.println("Fahim started competing");
  }

  @Override
  public void swimming() {
    System.out.println("Fahim started swimming");
  }

  @Override
  public void longJump() {
    // unnecessary methods,which Play interface forcing client to implemet
    // This does not follow Interface Segregation Principle
  }

  @Override
  public void highJump() {
    // unnecessary methods,which Play interface forcing client to implemet
    // This does not follow Interface Segregation Principle
  }

}

public class InterfaceSegregationInefficient {

  public static void main(String[] args) {
    Fahim fahim = new Fahim();
    fahim.compete();
    fahim.swimming();
    fahim.longJump();// Though fahim is not interested in longjump
  }

}

// The same problem will occur for another Player who might be competing in the
// high jump and long jump.
// But as our interface we are forcing him to also implement swim which do not
// follow the
// Interface Segregation Principle

// In the Efficient folder i have proposed a efficient code which follow
// Interface Segregation principle
