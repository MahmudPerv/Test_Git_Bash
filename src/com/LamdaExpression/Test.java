package com.LamdaExpression;
//1.NO Method Name
//2.NO retrun type
//3.No Access Modifire
//4.-> use Arrow Sign After method.
//5.Use Functional Interface>>>Functional Interface contains only one AbstractMethod....and Use @FunctionalInterface
// ()->{System.out.println("This is Cab Interface ");

//}

@FunctionalInterface
interface Cab{
	
	public void uber();
	
	
}



public class Test{
	public static void main(String[] args) {
		
		Cab obj = ()->System.out.println("This is Cab Interface ");
		obj.uber();
	}
	
}
 
	
	

