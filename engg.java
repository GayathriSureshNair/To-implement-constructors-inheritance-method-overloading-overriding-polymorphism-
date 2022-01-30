class Employee
{
    void display()
    {
        System.out.println("Name of class is Employee");
    }
    void calcSalary()
    {
        System.out.println("Salary of employee is 10000");
    }
}
class Engineer extends Employee
{
    void calcSalary()
    {
        super.calcSalary();
        System.out.println("Salary of employee is 20000");
    }
}
class engg
{
    public static void main(String args[])
    {
        Engineer eng=new Engineer();
        eng.display();
        eng.calcSalary();
    }
}
