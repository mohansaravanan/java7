import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mohan.saravanan on 14/05/2014.
 */
public class UnderscoresNumericLiteralsTest {

    @Test
    public void shouldDisplayCorrectNumberIfNumberHasUnderscore() throws Exception {
        //given
        int amount = 1_00_000_000;
        //when
        amount = amount + 1;
        //then
        assertThat(amount, is(100000001));
    }
}
