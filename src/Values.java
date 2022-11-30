import java.util.Random;
import java.util.Set;

public class Values {

    private final Set<Integer> value;

    public Values(Set<Integer> value) {
        this.value = value;
    }

    public boolean addNewValue(Set<Integer> value, int val) {
        if(!value.contains(val)){
            value.add(val);
            return true;
        }
        else {
            Random rd = new Random();
            return rd.nextBoolean();
        }

    }

    public boolean checkValues(Set<Integer> value, int val) {

        return value.contains(val);

    }
}
