package infrastructure.security;

import human_resources.Person;

public class IrisScanner implements IScanner {

    @Override
    public int[][] scan(Person person) {
        return person.getIris();
    }
}
