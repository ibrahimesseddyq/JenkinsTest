public class Employee{
    public String name;
    public Boolean work;
    public Employee(String name,Boolean work){
        this.name=name;
        this.work=work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", work=" + work +
                '}';
    }
}
