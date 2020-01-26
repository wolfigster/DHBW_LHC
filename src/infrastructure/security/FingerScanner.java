package infrastructure.security;

import human_resources.Person;

public class FingerScanner implements IScanner {

    @Override
    public int[][] scan(Person person) {
        return person.getIris();
    }
}
