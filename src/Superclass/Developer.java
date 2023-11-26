package Superclass;

public class Developer extends Person {
    private double salary;
    private String company;

    public Developer(String name, int age, double salary, String company){
        super(name, age); //LLamada a la clase Person ya que coge la infromación de la clase para añadir la información a esta clase.
        this.salary = salary;
        this.company = company;
    }

    public void showInfo() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge() +
                "\nSalary: " + salary + "\nCompany: " + company);
    }

}