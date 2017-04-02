/**
 * Created by hitoshi-ma on 2017/04/02.
 */
public class Test {
    public static void main(String[] args) {
        SuffixArray suffixArray;
        String testString = "manabe";

        suffixArray = new SuffixArray(testString);
        suffixArray.showAll();
    }
}
