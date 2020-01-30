package infrastructure.security.searchalgorithm;

public enum SearchAlgorithm {
    NATIVE("Native", "Native"),
    BOYER_MOORE("BoyerMoore", "BoyerMoore"),
    KNUTH_MORRIS_PRATT("KnuthMorrisPratt", "KnuthMorrisPratt");

    private String path;
    private String name;

    SearchAlgorithm(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return path + name + ".jar";
    }
}
