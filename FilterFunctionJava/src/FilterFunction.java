import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterFunction {
    static void main (String[] args){
        List<String> items = new ArrayList<String>();
        items.add("one");
        items.add("two");
        items.add("three");

        Stream<String> stream = items.stream();
        stream.filter( item ->  item.startsWith("o") );
    }
}
