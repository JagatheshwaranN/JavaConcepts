package java10.feature.var;

/**
 * It is one of the cool features in Java10. But it has its limitations. It is
 * allows us to define a variable using var and without specifying the type of
 * it. The Compiler infer / identify the type of the variable using the value
 * provided.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_VarDemo1 {

	public static void main(String[] args) {

		var a = "Java10 Var Feature";
		System.out.println(a);
		var b = 123;
		System.out.println(b);
		var c = 12.3f;
		System.out.println(c);
		var d = 12.3;
		System.out.println(d);
		var e = 'v';
		System.out.println(e);
	}
}
