package do_not_process_annotations;


import myAnnotations.PrintMe;
import myAnnotations.Property;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/22/2015.
 * Project: annotationProcessorsTest1
 * *******************************
 */
@PrintMe
public class B2 {

    @PrintMe
    int myB2IntProperty;
    String myB2StringProperty;
    String myB2FooProperty;

    @Property()
    public String getB2String() {
        return myB2StringProperty;
    }

    @Property()
    public int getB2Int() {
        return myB2IntProperty;
    }

    @Property()
    public String readB2Foo() {
        return myB2FooProperty;
    }

    public void setB2Int(int b2IntArg) {

        myB2IntProperty = b2IntArg;
    }

    public void setB2String(String b2StringArg) {
        myB2StringProperty = b2StringArg;
    }
}
