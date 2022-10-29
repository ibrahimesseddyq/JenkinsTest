import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<Employee> myEmployees = new ArrayList<>();
        myEmployees.add(new Employee("jamal",true));
        myEmployees.add(new Employee("ibrahim",false));
        Employee[] objects = myEmployees.toArray(new Employee[0]);
        for(Employee obj:objects){
            System.out.println(obj);
        }



    }
}
