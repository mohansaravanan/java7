import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by mohan.saravanan on 15/05/2014.
 */
public class CatchingMultipleExceptionTest {

    @Test
    public void shouldCatchMultipleExceptionInOneCatchBlock() {
        //given

        //when
        try {
            Thread.sleep(100);
            FileInputStream fileInputStream = new FileInputStream(new File("test"));
        } catch (InterruptedException | FileNotFoundException e) {
            e.printStackTrace();
        }
        //then
        assertTrue(true);
    }

}
