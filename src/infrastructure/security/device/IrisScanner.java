package infrastructure.security.device;

import human_resources.Person;

import java.util.Arrays;

public class IrisScanner implements IScanner {

    private String iris;

    @Override
    public void scan(Person person) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Arrays.deepToString(person.getIris()));
        iris = stringBuilder.toString();
    }

    public String getIris() {
        return iris;
    }
}
