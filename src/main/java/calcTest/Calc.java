package calcTest;

import java.util.Random;

public class Calc {
	

	public int add(int a, int b){
		return a + b;
	}
	
	
	public int div (int a, int b) throws Exception{
		if(b==0){
			throw new Exception();
		}
		return a / b;
	}
	
	public Integer random(){
		Random random = new Random();
		return random.nextInt();
		
	}
	
	public Integer sqrt(double value)throws Exception{
		if(value < 0){
			throw new Exception();
		}
		
		return Integer.valueOf((int)(Math.sqrt(value)));
	}
    

}
