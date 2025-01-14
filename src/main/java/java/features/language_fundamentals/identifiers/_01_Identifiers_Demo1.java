package java.features.language_fundamentals.identifiers;

/**
 * Identifier - A name in Java program is called as Identifier which can be used for identification purpose.
 * It can be a Method name, Variable name, Class name and Label name.
 *
 * @author Jagatheshwaran N
 */
public class _01_Identifiers_Demo1 {

    public static void main(String[] args) {

        /*

            Rules for defining Java Identifiers
            =======================================
                1.	a to z
                2.	A to Z
                3.	0 to 9
                4.	$
                5.	_
                1.	If any other characters are used, then compile time error will be triggered.
                2.	Identifiers can’t start with digits (numbers).
                3.	Identifiers are case-sensitive.
                4.	Identifiers have no length limit. But, it's recommended to not use lengthy identifier.
                5.	Identifiers can’t be a reserve word.
                6.	All predefined Java Class names and Interface names can be used as Identifiers.
                    But it’s not recommended to use the same and not a good programming practice.
        */

        int number = 10;
        System.out.println(number);
        String value = "Java";
        System.out.println(value);
        int Num = 1000;
        System.out.println(Num);
        String Place = "India";
        System.out.println(Place);
        int num123 = 100000;
        System.out.println(num123);
        String person1 = "John";
        System.out.println(person1);
        int $n = 10000;
        System.out.println($n);
        String $dollar = "US Dollar";
        System.out.println($dollar);
        int _num = 100;
        System.out.println(_num);
        String _name = "Coffee";
        System.out.println(_name);
        // Not recommended approach
        int Integer = 1000000;
        System.out.println(Integer);
        // Not recommended approach
        String Date = "Java Class";
        System.out.println(Date);
        // if - Reserved word can't be used
        // int if = 10000000;
    }


}
