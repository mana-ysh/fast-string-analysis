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
        String subString;
        char bwChar;
        this.str = str;
        this.items = new ArrayList<>();

        for (int i=0; i<str.length(); i++) {
            subString = str.substring(str.length()-i-1, str.length());
            if (i == str.length() - 1){
                bwChar = str.charAt(str.length()-1);
            }
            else {
                bwChar = str.charAt(str.length()-i-2);
            }
            item = new SuffixArrayItem(str.length() - i - 1, bwChar, subString);
            items.add(item);
        }
        // sort items
        items.sort(Comparator.comparing(SuffixArrayItem::getString));
    }

    public String getBWT() {
        String strBWT = "";
        for (int i=0; i<items.size(); i++){
            strBWT += items.get(i).bwChar;
        }
        return strBWT;
    }

    public void showAll() {
        for (int i=0; i<items.size(); i++){
            System.out.printf("%3dth item | ", i);
            items.get(i).show();
        }
    }
}

class SuffixArrayItem {
    public int startIndex;
    public char bwChar;
    public String str;

    public SuffixArrayItem(int startIndex, char bwChar, String str) {
        this.startIndex = startIndex;
        this.bwChar = bwChar;
        this.str = str;
    }

    public void show() {
        System.out.printf("%3d | %c | %s\n", startIndex, bwChar, str);
    }

    public String getString() {
        return this.str;
    }
}