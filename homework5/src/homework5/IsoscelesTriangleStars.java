package homework5;

import java.util.*;

public class IsoscelesTriangleStars {
		int size;
	  void input(){
			Scanner s=new Scanner(System.in);
    		System.out.print("이등변삼각형 높이입력:");
    		this.size=s.nextInt();
         
    		print();
      	
      }
      void print(){
      	
      	for(int i=1;i<=this.size;i++){
      		for(int j=this.size-1;j>i;j--){
      			System.out.print(" ");
      		}
      		for(int j=0;j<i*2-1;j++){
      			System.out.print("*");
      		}
      		System.out.println();
      	}
      }
}
