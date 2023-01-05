package com.masai;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello hell= new B();
		hell.sayHello("Ram");
		
		
		
		
		Hello hell1= new Hello() {
			@Override
			public void sayHello(String name) {
				System.out.println("This is anamous Class Name"+ name);	
			}
			
		
		};
		hell1.sayHello(" Ram");
		
		
		Hello he = a ->System.out.println("Lamba function "+ a);
		he.sayHello("Shaym");
	}
	

	
	
	
	
	
}
