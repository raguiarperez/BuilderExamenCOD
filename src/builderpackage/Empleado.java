
package builderpackage;

/**
 * @author raguiarperez
 */
public class Empleado {
    public static void main(String[] args) {
        Employee miEmpleado;
        miEmpleado= new EmployeeBuilder(3445,"Ricardo")
                             .createEmployee();
        System.out.println(miEmpleado.toString());


    }
}
