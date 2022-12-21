public static void company() {
    
}
class employees () {

}

class EmployeeDetails {  
    
int emp_id, salary;  
String name, address, department, email;  
  

public int getEmp_id() {  
    return emp_id;  
}  
public void setEmp_id(int emp_id) {  
    this.emp_id = emp_id;  
}  
public int getSalary() {  
    return salary;  
}  
public void setSalary(int salary) {  
    this.salary = salary;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getAddress() {  
    return address;  
}  
public void setAddress(String address) {  
    this.address = address;  
}  
public String getDepartment() {  
    return department;  
}  
public void setDepartment(String department) {  
    this.department = department;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
  

@Override  
public String toString() {  
    return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", address = " + address  
            + ", department = " + department + ", email = " + email + "]";  
    }  
      
}  

public class Employee{  

    public static void main(String args[]) {  
          

        EmployeeDetails emp = new EmployeeDetails();  

        emp.setEmp_id(101);  
        emp.setName("Emma Watson");  
        emp.setDepartment("IT");  
        emp.setSalary(15000);  
        emp.setAddress("New Delhi");  
        emp.setEmail("Emmawatson123@gmail.com");  
          
        
        System.out.println(emp);  
          
       
        int sal = emp.getSalary();  
        int increment = 0;  
       
        if ((sal >=1000) && (sal <=1500))  
        {  
            
            increment += (sal * 2)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
              
        }else if ((sal >=1500) && (sal <=20000)){  
            
            increment += (sal * 5)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
        }else {  
            System.out.println("\n Salary is not incremented \n");  
            System.out.println(emp);  
        }         
    }  
}
...................................................

import java.util.Scanner;

public class  company {
    public static void main(String args[]) {
        
        System.out.println();
        System.out.println("Welcome to the company enter number of employee");
        System.out.println();

        Scanner user_input = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            /**
             * creates 4 instances(objects) of the rectangle class.
             * each instance represents a room in a 4 bedroom house
             */
            Rectangle rect1 = new Rectangle();
            Rectangle rect2 = new Rectangle();
            Rectangle rect3 = new Rectangle();
            Rectangle rect4 = new Rectangle();

            // get input for length / width of each room from the user
            // room 1
            System.out.println("Enter length and Width of room 1: ");
            rect1.getUserInput();
            System.out.println();

            // room 2
            System.out.println("Enter length and width of room 2: ");
            rect2.getUserInput();
            System.out.println();

            // room 3
            System.out.println("Enter length and width of room 3: ");
            rect3.getUserInput();
            System.out.println();

            // room 4
            System.out.println("Enter length and width of room 4: ");
            rect4.getUserInput();
            System.out.println();

            double totalArea = rect1.getArea() * rect2.getArea() * rect3.getArea() * rect4.getArea();
            System.out.println("The total area of all rooms in the house is: " + totalArea);

           
            System.out.print("Continue? (y/n): ");
            choice = user_input.next();
            System.out.println();
        }
    }
}

.......................................
public class TakingInput {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }

        for(int i: arr){ 

            System.out.println(i);

        }


    }

}
