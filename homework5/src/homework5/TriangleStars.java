package homework5;

import java.util.Scanner;

public class TriangleStars {
         int left;
         int height;
	   
	   void input(){
		  Scanner s=new Scanner(System.in);
  		System.out.print("직각삼각형의 왼쪽여백과 높이입력:");
  		this.left=s.nextInt();
        this.height=s.nextInt();
  		print();
      	
      }
      void print(){
      	
    	  for (int i = 0; i < this.height; i++) {
    		  for (int j = i; j < this.left; j++) {
    		   System.out.print(" ");
    		  }
    		  for (int j = 0; j <= i; j++) {
    		   System.out.print("*");
    		  }
    		  System.out.println();
    		 }
    		 
      }
}
