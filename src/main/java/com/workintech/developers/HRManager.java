package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println(getName() + " (HR Manager) starts to working");
        setSalary(getSalary() + 1500);
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Gecersiz index: " + index);
            return;
        }
        if (juniorDevelopers[index] == null) {
            juniorDevelopers[index] = juniorDeveloper;
        } else {
            System.out.println(index + ". index zaten dolu.");
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Gecersiz index: " + index);
            return;
        }
        if (midDevelopers[index] == null) {
            midDevelopers[index] = midDeveloper;
        } else {
            System.out.println(index + ". index zaten dolu.");
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Gecersiz index: " + index);
            return;
        }
        if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = seniorDeveloper;
        } else {
            System.out.println(index + ". index zaten dolu.");
        }
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }
}