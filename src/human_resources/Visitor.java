package human_resources;

import infrastructure.security.idcard.VisitorIDCard;

public class Visitor extends Person {

    private VisitorIDCard visitorIDCard;

    public Visitor(int id, String name, int[][] iris) {
        super(id, name, iris);
    }

    public Visitor(String name) {
        super(name);
    }

    public Visitor() {
        super();
    }

    public VisitorIDCard getVisitorIDCard() {
        return visitorIDCard;
    }

    public void setVisitorIDCard(VisitorIDCard visitorIDCard) {
        this.visitorIDCard = visitorIDCard;
    }
}
