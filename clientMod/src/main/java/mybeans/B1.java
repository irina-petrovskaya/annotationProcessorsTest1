package mybeans;


import sourceAnnotations.Property;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/22/2015.
 * Project: annotationProcessorsTest1
 * *******************************
 */
public class B1 {
    @Property()
    public String getString() {
        return myStringProperty;
    }

    public void setString(String stringArg) {
        myStringProperty = stringArg;
    }


    String myStringProperty;
}
