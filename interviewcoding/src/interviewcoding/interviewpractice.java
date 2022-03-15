package interviewcoding;

public class interviewpractice {

	public static void main(String[] args) {
		
		//swapp 2 number using third variable
		int avenger=25;
		int avenger2=16;
		
		System.out.println(".....before swap......");
		
         System.out.println("avenger="+avenger);
         System.out.println("avenger="+avenger2);
         
         int civilwar=avenger;
        avenger=avenger2;
        avenger2=civilwar;
         
         System.out.println(".....after swap.....");
         
         System.out.println("avenger="+avenger);
         System.out.println("avenger2="+avenger2);
         
         //swap number without using third variable
         int a=23;
         
         int b=17;
         
         System.out.println("....before swap...........");
         System.out.println("a="+a);
         System.out.println("b="+b);
   
        
        System.out.println("....after swap....");
        a=a+b; //a=23+17=40;
        b=a-b; //b=a-b=40-17=23 i.e b=23;
        a=a-b; //a=a-b=40-23=17;
        System.out.println("a="+a);
        System.out.println("b="+b);
        

      
        
     
      
        }
	}


