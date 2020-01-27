package infrastructure.security;

public class EmployeeIDCard extends IDCard {

    private Chip[] chip;

    public EmployeeIDCard() {
        super();
        this.chip = new Chip[] {new Chip(), new Chip()};
    }

    public Chip[] getChip() {
        return this.chip;
    }

    public void setChip(Chip[] chip) {
        this.chip = chip;
    }
}
