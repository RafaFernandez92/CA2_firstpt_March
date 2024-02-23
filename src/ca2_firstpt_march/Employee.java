/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_firstpt_march;

/**
 *
 * @author User
 */
public class Employee{
    String email;
    String name;
    int Empno;
//Default values    
public Default{
    email = "example123@domain.com";
    name = "Rafael";
    Empno = 1234567890;
}
// 1st constructor for Name and Email.
public EmailandName(String name, String email) {
    this.name = name;
    this.email = email;
}
//2nd Constructor with Empno on it
public EmployeeNo(int Empno){
    this.Empno = Empno;
}
}

