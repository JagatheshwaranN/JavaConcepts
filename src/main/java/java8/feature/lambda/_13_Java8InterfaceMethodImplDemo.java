package java8.feature.lambda;

public class _13_Java8InterfaceMethodImplDemo implements Interface7 {

	@Override
	public void m1() {
		System.out.println("_13_Java8InterfaceMethodImplDemo abstract method override");
	}
	
	public static void main (String[] args) {
		
		Interface7 reference = new _13_Java8InterfaceMethodImplDemo();
		reference.m1();
		reference.m2();
		Interface7.m3();
	}

}
