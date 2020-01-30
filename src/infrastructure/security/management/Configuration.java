package infrastructure.security.management;

import infrastructure.security.searchalgorithm.SearchAlgorithm;

public enum Configuration {
    instance
    ;

    private static SearchAlgorithm searchAlgorithm = SearchAlgorithm.NATIVE;

    public static SearchAlgorithm getSearchAlgorithm() {
        return searchAlgorithm;
    }

    public static void setSearchAlgorithm(SearchAlgorithm newSearchAlgorithm) {
        searchAlgorithm = newSearchAlgorithm;
    }
}
