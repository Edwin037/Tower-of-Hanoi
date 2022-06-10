/*
Edwin Gomez
COM 370

 */

package hanoitower;
import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an int n:");
    int n= input.nextInt();
    Hanoi(n,'S','T','A');
       
    }
    
    public static void Hanoi(int n, char source, char target, char a){
        if(n==1){
            System.out.println(source+ "->"+ target + "  disc " + n);
            return;
        }
        Hanoi(n-1,source, a, target);
        System.out.println(source+ "->"+ target + "  disc " + n);
        Hanoi(n-1,a,target,source);
    }
    
}