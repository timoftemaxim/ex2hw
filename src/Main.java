import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<String>();
        inputList.add("red");
        inputList.add("yellow");
        inputList.add("pink");
        inputList.add("red");
        inputList.add("yellow");

        Set<String> uniqueValues = getUniqueValues(inputList);
        System.out.println(uniqueValues);
    }

    public static Set<String> getUniqueValues(List<String> inputList) {
        Set<String> uniqueValues = new HashSet<String>();
        for (String value : inputList) {
            uniqueValues.add(value);
        }
        return uniqueValues;
    }
}
