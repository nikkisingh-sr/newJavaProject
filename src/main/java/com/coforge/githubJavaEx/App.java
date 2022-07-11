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
    
    
     public static String arrange(String str) {
		 String [] split_str= str.split(" ");
		 
		 List<String> lst= new ArrayList<String>();
		
		
		 
		 if(split_str.length>1) {
			 for(int i=0; i<split_str.length;i++) {
				 if((i+1)%2==0 && split_str[i].length()>2) {
					 String sorted_str=sort(split_str[i]);
					 lst.add(sorted_str);
					 
				 }
				 else  if((i+1)%2!=0 && split_str[i].length()>2) {
					 
					 
					 String str1= split_str[i].substring(1, split_str[i].length()-1);
					 char a[] = str1.toCharArray();
					 Arrays.sort(a);
					 
					 String nstr="";
				        char ch;
					String n= new String(a);
					 for (int k=0; k<n.length(); k++)
				      {
				        ch= n.charAt(k); 
				        nstr= ch+nstr; 
				      }
					String data= split_str[i].charAt(0)+nstr+split_str[i].charAt(split_str[i].length()-1);
					 lst.add(data);
					 
								
					/* 
					 Character[] charArray = new Character[str1.length()];

				        for (int k = 0; k < str1.length(); k++) {
				            charArray[k] = str1.charAt(k);
				        }
				        
					 Arrays.sort(charArray, new Comparator<Character>() {

						
						@Override
						public int compare(Character o1, Character o2) {
							// TODO Auto-generated method stub
							return -1 * o1.compareTo(o2);
						}
						 
					});
					 new String().valueOf(charArray);
					
					 */
					 
				 }
				 else {
					 lst.add(split_str[i]);
				 }
			 }
		 }
}
