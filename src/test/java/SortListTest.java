import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/*
 * Created by asivolella <Andressa Sivolella> on 2016-01-29.
 */
public class SortListTest {
    SortList sort;
    private int userNumber;

    @Before
    public void setUp(){
        this.sort = new SortList();
    }

    @Test
    public void shouldSetUserNumber(){
        int expectedUserNumber = this.userNumber;
        this.sort.setUserNumber(this.userNumber);
        int actualUserNumber = this.sort.getUserNumber();

        assertEquals("SortList.setUserNumber is not setting userNumber correctly", expectedUserNumber, actualUserNumber);
    }

    @Test
    public void shouldAddNnumberInAList(){
        List<Integer> expectedList = Arrays.asList(12, 1);

        this.sort.addRawListElement(12);
        this.sort.addRawListElement(1);

        List<Integer> actualList = this.sort.getRawList();

        assertThat(actualList, is(expectedList));
    }

    @Test
    public void userNumberShouldBeEqualToRawListSize(){
        int expectedSize = 3;
        this.sort.setUserNumber(3);

        this.sort.addRawListElement(12);
        this.sort.addRawListElement(1);
        this.sort.addRawListElement(25);

        int actualSize = this.sort.rawListSize();

        assertEquals("SortList.addRawListElement is not adding numbers correctly", expectedSize, actualSize);
    }

    @Test
    public void shouldSortList(){
        List<Integer> expectedList = Arrays.asList(1, 2, 12, 40);

        this.sort.setUserNumber(4);

        this.sort.addRawListElement(12);
        this.sort.addRawListElement(1);
        this.sort.addRawListElement(40);
        this.sort.addRawListElement(2);

        this.sort.bubbleSort();

        List<Integer> actualList = this.sort.getSortList();

        assertThat(actualList, is(expectedList));
    }
}
