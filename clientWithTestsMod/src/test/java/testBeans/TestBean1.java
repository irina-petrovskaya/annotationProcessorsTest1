package testBeans;

import myAnnotations.PrintMe;
import myAnnotations.Property;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/23/2015.
 * Project: annotationProcessorsTest1
 * *******************************
 */
@PrintMe
public class TestBean1 {

    int testProp1;

    @PrintMe @Property
    public int writeTestProp1() {
        return testProp1;
    }
    @Property @PrintMe
    public void setTestProp1(int testProp1Arg) {
        testProp1 = testProp1Arg;
    }
}
