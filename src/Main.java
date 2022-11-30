import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 23, 3, 4, 5, 65, 6, 7, 78, 89, 9, 0));

        Values value = new Values(set);

        System.out.println(value.addNewValue(set,1));

        System.out.println(value.checkValues(set,3));


    }
}
