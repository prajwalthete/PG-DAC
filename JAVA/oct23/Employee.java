package oct23;

class Employee
{
  int empId;
  String empName;
  
  public Employee(int empId, String empName)
  {
    this.empId = empId;
    this.empName = empName;
  }
  
  public String toString()
  {
    return empId + " " + empName;
  }
}