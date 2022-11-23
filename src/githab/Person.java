/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githab;

/**
 *
 * @author Администратор
 */
public class Person {
    
public class Account{
//private String password;
protected String password;
Account(String pass){
this.password = pass;
}
String getAccount()
{
   return password;

}

void displayAccount(){
System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
}
}
protected String name;
//String name;
Account account;
Person(String name)
{
 this.name = name;
 account = new Account("");
}
Person(String name, String password)
{
 this.name = name;
 account = new Account(password);
}
public void displayPerson(){
    
System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
}
String getName()
{
return name;
}
}