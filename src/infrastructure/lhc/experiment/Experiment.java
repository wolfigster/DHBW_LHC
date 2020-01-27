package infrastructure.lhc.experiment;

import java.util.UUID;

public class Experiment {

    private UUID uuid;
    private String dateTimeStamp;
    private boolean isHiggsBosonFound;
    private Block[] blocks; // = new Block[200000];

    public Experiment(UUID uuid, String dateTimeStamp, boolean isHiggsBosonFound, Block[] blocks) {
        this.uuid = uuid;
        this.dateTimeStamp = dateTimeStamp;
        this.isHiggsBosonFound = isHiggsBosonFound;
        this.blocks = blocks;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public String getDateTimeStamp() {
        return this.dateTimeStamp;
    }

    public boolean isHiggsBosonFound() {
        return this.isHiggsBosonFound;
    }

    public Block[] getBlocks() {
        return this.blocks;
    }
}
