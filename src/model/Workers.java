package model;

public class Workers extends Human {
    private int weekSalary;
    private int workingHoursPerDay;


    public Workers(String firstName, String lastName, int weekSalary,int workingHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workingHoursPerDay = workingHoursPerDay;
    }

    public void setWorkingHoursPerDay(int workingHoursPerDay) {
        this.workingHoursPerDay = workingHoursPerDay;
    }

    public void setWeekSalary(int weekSalary) {
        this.weekSalary = weekSalary;
    }

    public int getWorkingHoursPerDay() {
        return workingHoursPerDay;
    }

    public int getWeekSalary() {
        return weekSalary;
    }
    public float getMoneyForHours(){
        return (float) weekSalary/ workingHoursPerDay;
    }

    public String toString(){
        return getFirstName() + " " + getLastName() + "- Salary: " + weekSalary +"- working hours:" + workingHoursPerDay;
    }
}

