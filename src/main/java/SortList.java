import java.util.ArrayList;
import java.util.List;

/*
 * Created by asivolella <Andressa Sivolella> on 2016-01-29.
 */
public class SortList {
    private int userNumber;
    private List<Integer> rawList = new ArrayList<>();

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public int getUserNumber() {
        return this.userNumber;
    }

    public List<Integer> getRawList() {
        return this.rawList;
    }

    public void addRawListElement(int number) {
        this.rawList.add(number);
    }

    public int rawListSize() {
        return this.rawList.size();
    }
}
