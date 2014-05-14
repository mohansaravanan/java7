import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by mohan.saravanan on 14/05/2014.
 */
public class StringInSwitchStatementTest {

    public static final String LONDON = "London";
    public static final String DELHI = "Delhi";

    @Test
    public void shouldGetCountryCapital() throws Exception {
        //given
        String countryName = "England";

        //when
        String countryCapital = getCountryCapital(countryName);

        //then
        assertThat(countryCapital, is(LONDON));

    }

    private String getCountryCapital(String countryName) {

        String capital;

        switch (countryName) {
            case "England":
                capital = LONDON;
                break;
            case "India":
                capital = DELHI;
                break;
            default:
                throw new IllegalArgumentException("Sorry, no capital found: " + countryName);
        }
        return capital;
    }

}
