package homework5;

import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
	    do{
	    	System.out.println("1. ���簢�������");
	    	System.out.println("2. �����ﰢ �����");
	    	System.out.println("3. �̵�ﰢ�� �����");
	    	System.out.println("4. ���̾Ƹ�� �����  ");
	    	System.out.println("5. �����ϱ�");
	    	System.out.println("���ϴ� �޴���>>");
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
	    System.out.print("�����ϼ̽��ϴ�.");
	   

	}

}