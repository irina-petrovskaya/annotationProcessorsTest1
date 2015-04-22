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
    public String getName() {
        return myNameProperty;
    }



    int myAgeProperty;
    @Property()
    public int getAge() {
        return myAgeProperty;
    }

    String myNameProperty;
}
