import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
 * Created by asivolella <Andressa Sivolella> on 2016-01-29.
 */
public class SortListTest {
    SortList sort;

    @Before
    public void setUp(){
        this.sort = new SortList();
    }

    @Test
    public void shouldSetUserNumber(){
        int expectedUserNumber = 5;
        this.sort.setUserNumber(5);
        int actualUserNumber = this.sort.getUserNumber();

        assertEquals("SortList.setUserNumber is not setting userNumber correctly", expectedUserNumber, actualUserNumber);
    }
}
