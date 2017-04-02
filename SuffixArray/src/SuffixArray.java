import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hitoshi-ma on 2017/04/02.
 * TODO: dealing with uppercase
 */

public class SuffixArray {
    public String str;
    public List<SuffixArrayItem> items;
    public SuffixArray(String str) {

        SuffixArrayItem item;
        this.str = str;
        this.items = new ArrayList<>();

        for (int i=0; i<str.length(); i++) {
            item = new SuffixArrayItem(i, str.substring(str.length()-i-1, str.length()));
            items.add(item);
        }
        // sort items
        items.sort(Comparator.comparing(SuffixArrayItem::getString));
    }

    public void showAll() {
        for (int i=0; i<items.size(); i++){
            System.out.print(String.valueOf(i)+"th item | ");
            items.get(i).show();
        }
    }
}

class SuffixArrayItem {
    public int position;
    public String str;

    public SuffixArrayItem(int position, String str) {
        this.position = position;
        this.str = str;
    }

    public void show() {
        System.out.print(position);
        System.out.print(" | ");
        System.out.println(str);
    }

    public String getString() {
        return this.str;
    }
}