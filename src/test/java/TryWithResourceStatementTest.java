import org.junit.Test;

import java.io.*;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by mohan.saravanan on 15/05/2014.
 */
public class TryWithResourceStatementTest {


    @Test
    public void shouldCloseResourceAutomatically() throws Exception {
        //given

        //when
        try (FileOutputStream fos = new FileOutputStream("movies.txt"); DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeUTF("Java 7 Block Buster");

        }
        //you do not have to close fos and dos because it is sub class of Closeable interface
        //then
        assertTrue(true);
    }





}
