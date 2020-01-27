package infrastructure.security;

public class VisitorIDCard extends IDCard {

    private Chip chip;

    public VisitorIDCard() {
        super();
        this.chip = new Chip();
    }

    public Chip getChip() {
        return this.chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }
}
