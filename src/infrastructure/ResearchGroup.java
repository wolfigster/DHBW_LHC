package infrastructure;

import human_resources.Researcher;
import human_resources.ScientificAssistant;

public class ResearchGroup {

    private Researcher[] researchers; // = new Researcher[1-3];
    private ScientificAssistant[] scientificAssistants; // = new ScientificAssistant[0-2];

    public ResearchGroup(Researcher[] researchers, ScientificAssistant[] scientificAssistants) {
        this.researchers = researchers;
        this.scientificAssistants = scientificAssistants;
    }

    public Researcher[] getResearchers() {
        return this.researchers;
    }

    public ScientificAssistant[] getScientificAssistants() {
        return this.scientificAssistants;
    }
}
