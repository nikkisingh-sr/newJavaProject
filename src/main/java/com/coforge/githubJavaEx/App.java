package com.coforge.githubJavaEx;

import java.util.Scanner;

import com.coforge.githubJavaEx.GithubJavaProject.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeServiceImpl e=new EmployeeServiceImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1for addemp and 2 2 for Display");
        switch(sc.nextInt()) {
        case 1:e.addEmp();
        case 2:e.displayEmp();
             break;
        default: System.out.println("Requesting");
        }
    }
}
