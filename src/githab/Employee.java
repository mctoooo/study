/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githab;

/**
 *
 * @author Администратор
 */

public class Employee extends Person 
{
    String company;
    
    Employee(String nm, String cmp)
    {
        super(nm);
        company = cmp;
    }
    @Override
    public void displayPerson(){
    
System.out.printf
        ("Person \t Name: %s \t Company: %s\t Password: %s \n", this.name,company, this.account.getAccount());
}
}
