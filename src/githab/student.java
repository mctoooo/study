/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githab;

/**
 *
 * @author Student
 */
public class student {
    
    String name;
   String secondname;
   String lastname;
    int age;
    int salary;
    student()
    {
       name="";
   secondname="";
   lastname="";
   age=0;
   salary=-1; 
    }
    
    student(String nmA,String nmB,String nmC,int ageP,int salaryP)
    {
    name= nmA;
    secondname= nmB;
    lastname= nmC;
    age= ageP;
     salary= salaryP;
        
    }
    String ToFormatString()
    {   
    
    return"Student "+name+" "+secondname+" "+lastname+" "+age+" "+salary;
}
    
    
    
    
    void SetSalary(int newsalary) // int []marka
    {
        salary = newsalary;
    }
}
