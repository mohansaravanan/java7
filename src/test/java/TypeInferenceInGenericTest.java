import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mohan.saravanan on 14/05/2014.
 */
public class TypeInferenceInGenericTest {

    @Test
    public void shouldGetListOfPeople() throws Exception {

        //given
        List<String> list = new ArrayList<>();

        //when
        list.add("Mohan");
        list.add("John");
        list.add("boyall");

        //then
        assertThat(list.size(), is(3));
    }


}
