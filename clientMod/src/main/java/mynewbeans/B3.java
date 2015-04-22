package mynewbeans;


import myAnnotations.PrintMe;
import myAnnotations.Property;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/22/2015.
 * Project: annotationProcessorsTest1
 * *******************************
 */
@PrintMe
public class B3 {
    @PrintMe
    int myB3AgeProperty;
    String myB3NameProperty;
    String myB3FooProperty;

    @Property()
    public String getB3Name() {
        return myB3NameProperty;
    }

    @Property()
    public int getB3Age() {
        return myB3AgeProperty;
    }

    @Property()
    public String readB3Foo() {
        return myB3FooProperty;
    }

    public void setB3Age(int b3AgeArg) {

        myB3AgeProperty = b3AgeArg;
    }

    public void setB3Name(String b3NameArg) {
        myB3NameProperty = b3NameArg;
    }
}
