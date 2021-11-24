package DesignPrinciple.LiskovSubstitution.Efficient;

// Registration Number : 2017331059

//Human class has all the basic attribute of Human
class Human {

}

// Swimmer class is for those who are human and can swim
class Swimmer extends Human {
    public void Swimming() {

    }
}

// MichaelPhelps can extend Swimmer as He is a human being and also a good
// swimmer
class MichaelPhelps extends Swimmer {

}

// Two months Old baby is a Human being not a swimmer.
class TwomonthsOldbaby extends Human {
    void eat() {
        System.out.println("Eating chips");
    }
}

public class LiskovSubstitutionEfficient {
    public static void main(String[] args) {

    }
}
