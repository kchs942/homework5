package homework5;

import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
	    do{
	    	System.out.println("1. 정사각형별찍기");
	    	System.out.println("2. 직각삼각 별찍기");
	    	System.out.println("3. 이등변삼각형 별찍기");
	    	System.out.println("4. 다이아몬드 별찍기  ");
	    	System.out.println("5. 종료하기");
	    	System.out.println("원하는 메뉴는>>");
	    	number=s.nextInt();
	    	
	    		if(number==1)
	    			new RectagleStars().input();
	    		
	    		else if(number==2)
	    			new TriangleStars().input();
	    		
	    		else if(number==3)
	    			new IsoscelesTriangleStars().input();
	    		
	    		else if(number==4)
	    			new DiamondStars().input();
	    		
	   	    	
	    }
	    while(number!=5); 
	    System.out.print("종료하셨습니다.");
	   

	}

}