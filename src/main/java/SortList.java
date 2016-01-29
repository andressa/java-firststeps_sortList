import java.util.ArrayList;
import java.util.List;

/*
 * Created by asivolella <Andressa Sivolella> on 2016-01-29.
 */
public class SortList {
    private int userNumber;
    private List<Integer> rawList = new ArrayList<>();
    private List<Integer> sortList = new ArrayList<>();

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

    public void bubbleSort(){
        this.sortList = this.rawList;
        boolean replaced = true;
        for (int index = this.rawListSize() - 1; index >= 1 && replaced; index --){
            replaced = false;
            for (int element = 0; element < index; element ++){
                if (this.sortList.get(element) > this.sortList.get(element + 1)){
                    int temp = this.rawList.get(element);
                    this.sortList.set(element, this.sortList.get(element + 1));
                    this.sortList.set(element + 1, temp);
                    replaced = true;
                }
            }
        }
    }

    public List<Integer> getSortList() {
        return this.sortList;
    }
}
