/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16474
 */
import java.util.Scanner;
public class TestUserprofile {
    public static void main(String[] args)
    {
       String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
       System.out.println("Available genres: ");
       for(int i=0;i<genres.length;i++)
       {
           System.out.println("    "+genres[i]);
       }
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=obj.nextLine();
       
        Scanner obj1=new Scanner(System.in);
        System.out.print("Genre: ");
        String gen=obj.nextLine();
       
        System.out.println("Profile created!");
       
    }
    
}
        
