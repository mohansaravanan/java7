import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mohan.saravanan on 15/05/2014.
 */
public class NonReifiableVarargsWarningTest {

    @Test(expected = ClassCastException.class)
    public void should() throws Exception {
        //given
        List<String> stringListA = new ArrayList<String>();
        List<String> stringListB = new ArrayList<String>();
        //when
        addToList(stringListA, "Seven", "Eight", "Nine");
        addToList(stringListA, "Ten", "Eleven", "Twelve");
        List<List<String>> listOfStringLists = new ArrayList<List<String>>();
        addToList(listOfStringLists, stringListA, stringListB);

        //you will see Warning:(34, 25) Possible heap pollution from parameterized vararg type
        faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));

        //then
    }

    private static <T> void addToList(List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    private static void faultyMethod(List<String>... l) {
        Object[] objectArray = l;  // Valid
        objectArray[0] = Arrays.asList(new Integer(42));
        String s = l[0].get(0);    // ClassCastException thrown here
    }


}


