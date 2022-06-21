class Employee
{
static String companyName ="Accenture";
int employeeId;
String eName;
 String cLocation;
String eBloodGroup;

public Employee(int employeeId , String eName ,String cLocation ,String eBloodGroup)
{
System.out.println("Employee Object Created");
this.employeeId=employeeId;
this.eName=eName;
this.cLocation=cLocation;
this.eBloodGroup=eBloodGroup;
}
public static void main(String a[])
{
Employee employee = new Employee(51,"Shanmukh","Kormangla","B+");
System.out.println("the companyName is "+Employee.companyName);
System.out.println(employee.employeeId+"   "+employee.eName+"    "+employee.cLocation+"    "+employee.eBloodGroup);
/*employee.employeeId=51;
employee.eName="Shanmukh";
employee.cLocation="Kormangla";
employee.eBloodGroup="B+";
System.out.println("the employee Id is "+employee.employeeId);
System.out.println("the employee Id is "+employee.eName);
System.out.println("the employee Id is "+employee.cLocation);
System.out.println("the employee Id is "+employee.eBloodGroup);*/
System.out.println("---------------------");

Employee employee1 = new Employee(52,"Arya","Btm Layout","AB+");
System.out.println("the companyName is "+Employee.companyName);
System.out.println(employee1.employeeId+"   "+employee1.eName+"    "+employee1.cLocation+"    "+employee1.eBloodGroup);
/*System.out.println("the companyName is "+Employee.companyName);
employee1.employeeId=52;
employee1.eName="Arya";
employee1.cLocation="Btm Layout";
employee1.eBloodGroup="AB+";
System.out.println("the employee Id is "+employee1.employeeId);
System.out.println("the employee Id is "+employee1.eName);
System.out.println("the employee Id is "+employee1.cLocation);
System.out.println("the employee Id is "+employee1.eBloodGroup);*/
}
}