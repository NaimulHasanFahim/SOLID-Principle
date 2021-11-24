package DesignPrinciple.DependencyInversion.Efficient;

// High-level classes shouldn’t depend on low-level classes.Both should depend on abstractions.Abstractions shouldn’t depend on details.

// Details should depend on abstractions. High Level Classes --> Abstraction Layer --> Low Level Classes

interface Iworker {
    public void work();
}

class Worker implements Iworker {

    @Override
    public void work() {
        System.out.println("Working as normal employee.");
    }

}

class Accountant implements Iworker {

    @Override
    public void work() {
        System.out.println("Working as a Accountant.");
    }

    public void doSomething() {
        System.out.println("Doing somethings.");
    }

}

class Manager {
    Iworker iworker;

    public void setWorker(Iworker iworker) {
        this.iworker = iworker;
    }

    public void manage() {
        iworker.work();
    }
}

public class DependencyInversionEfficient {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        manager.setWorker(accountant);
        manager.manage();

        manager.setWorker(worker);
        manager.manage();
    }
}
