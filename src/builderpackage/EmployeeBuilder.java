package builderpackage;

/**
 * @author raguiarperez
 */
public class EmployeeBuilder {
   private String lastName;
   private String middleName;
   private String firstName;
   private long id;
   private int birthYear;
   private int birthMonth;
   private int birthDate;
   private int hireYear;
   private int hireMonth;
   private int hireDate;

    //Campos Obligatorios
    public EmployeeBuilder(long id,String firstName) {
        this.firstName=firstName;
        this.id=id;
    }

    public EmployeeBuilder() {
    }
    
    //Setters

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public void setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }
    //crearEmpleado
    public Employee createEmployee() {
        return new Employee(lastName,middleName,firstName,id,birthYear,birthMonth,birthDate,hireYear,hireMonth,hireDate);
    }
    
}
