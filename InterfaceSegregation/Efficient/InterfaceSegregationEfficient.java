package DesignPrinciple.InterfaceSegregation.Efficient;

// Registration Number : 2017331059

// For the Solution We will follow the interface segregation principle and segment the original interface
//we will create two other interfaces — one for Jumping and one for Swimming.
//Therefore Fahim will not have to implement actions that he is not capable of performing

interface Play {

    void compete();
    // This only contain compete() method, we can extends this interface to other
    // necessary
    // interface as per the requirement
}

interface Swimming extends Play {

    void swim();
    // This interface is only for the player who only want to join swimming
}

interface Jumping extends Play {

    void highJump();

    void longJump();

    // This interface is only for the player who only want to join jumping
}

class Fahim implements Swimming {

    // Fahim is competing and only joinning swimming
    @Override
    public void compete() {
        System.out.println("Fahim started competing");
    }

    @Override
    public void swim() {
        System.out.println("Fahim started swimming");
    }

}

// Any player want to join Jumping can implemet Jumping interface as per the
// requirements

public class InterfaceSegregationEfficient {
    public static void main(String[] args) {
        Fahim fahim = new Fahim();
        fahim.compete();
        fahim.swim();
    }
}
