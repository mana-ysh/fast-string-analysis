/**
 * Created by hitoshi-ma on 2017/04/02.
 */
public class Test {
    public static void main(String[] args) {
        SuffixArray suffixArray;
        String testString = "abracadabra$";

        suffixArray = new SuffixArray(testString);

        System.out.println("suffix array is ...");
        suffixArray.showAll();

        System.out.println();

        System.out.println("result of Burrows Wheeler Transform is ...");
        System.out.println(suffixArray.getBWT());

    }
}
