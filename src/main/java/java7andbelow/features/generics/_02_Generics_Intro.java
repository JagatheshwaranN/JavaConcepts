package java7andbelow.features.generics;

public class _02_Generics_Intro {

    public static void main(String[] args) {

        /*
            Generics Intro
            ==============
            To overcome the above problems of Collections, SUN people introduced the Generics
            concept in 1.5 version. Hence, the main objectives of Generics are,
            1.	To provide type safety
            2.	To resolve a type casting problem

            For example, to hold only string type objects, we can create a generic version of
            ArrayList object as follows.
            ArrayList<String> al = new ArrayList<String>();

            For this ArrayList, we can add only string type objects. By mistake, if you are
            trying to add any other type of object, then we will get the compile time error.
            al.add("Alex");
            al.add("Blake");
            al.add(new Integer(10)); // CompileTimeError

            Hence, through Generics, we are getting type safety. Also, at the time of retrieval,
            we are not required to perform type casting. Hence, through Generics, we can solve
            a type casting problem.

            ArrayList<String> al = new ArrayList<String>();
            al.add("Alex");
            String name1 = al.get(0);
        */
    }
}
