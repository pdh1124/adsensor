package prac03;

public class Shift {

	public static void main(String[] args) {
		 int temp;
	        
	        System.out.println(-8);
	        System.out.println(Integer.toBinaryString(-8));
	        
	        temp = -8 <<2;
	        System.out.println("-8 << 2 = " + temp);
	        System.out.println(Integer.toBinaryString(temp));
	        
	        System.out.println(-8);
	        System.out.println(Integer.toBinaryString(-8));
	        
	        temp = -8 >> 2; 
	        System.out.println( "-8 >> 2 = " + temp); 
	        System.out.println(Integer.toBinaryString(temp)); 
	 
	        System.out.println(-8); 
	        System.out.println(Integer.toBinaryString(-8)); 
	 
	        temp = -8 >>> 2; 
	        System.out.println( "-8 >>> 2 = " + temp); 
	        System.out.println(Integer.toBinaryString(temp)); 
	}

}
