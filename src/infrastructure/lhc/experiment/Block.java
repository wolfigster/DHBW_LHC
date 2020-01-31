package infrastructure.lhc.experiment;

import java.util.UUID;

public class Block {

    private UUID uuid;
    private String structure;

    public Block(UUID uuid, String structure) {
        this.uuid = uuid;
        this.structure = structure;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public String getStructure() {
        return this.structure;
    }
}
