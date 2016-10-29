package homework5;

import java.util.Scanner;

public class DiamondStars {
	  int size;
	  void input(){
      	
		  Scanner s=new Scanner(System.in);
  		System.out.print("다이아몬드의 크기입력 :");
  		this.size=s.nextInt();
       
  		print();
      }
      void print(){
      	
    	  for(int i=1 ; i<=this.size ; i++) 
    	  {  
    		  for(int j=1; j <= this.size-i ; j++) 
    		  {  
    		 
    			  System.out.print(" ");   
    		  }  
    		  for(int k=1; k <=2*i-1; k++)
    		  {  
    	    	  System.out.print("*");    
    		  }  
    	    	  System.out.println("");  
    		           
    	  }  
    		 
    		  for(int i=this.size-1 ; i>0 ; i--) 
    		  {   
    		 
    			  for(int j=1; j <= this.size-i ; j++) 
    			  {   
    		         System.out.print(" ");   
    		      }  
    		
    			  for(int k=1; k <=2*i-1; k++) 
    			  {  
    		         System.out.print("*");    
    		      }  
    		 
    			  System.out.println(" ");  
    		  }  
   	  }  
      
}
