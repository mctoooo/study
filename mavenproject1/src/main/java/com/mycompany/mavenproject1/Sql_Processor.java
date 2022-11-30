/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Student
 */
public interface Sql_Processor extends AutoCloseble{
Connection connect(String url,String username,String password);
boolean creatTable(String t;ableName,String[] params);
int insertCount(String[][] values);
// 0-> nothing inserted
// 1-> 1 row inserted
// 2-> 2 rows insertid
// etc.
boolean[] insertCountBool(string[][] values);
String[] select(String values);
}
