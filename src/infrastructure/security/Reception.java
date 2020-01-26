package infrastructure.security;

import human_resources.ReceptionStaff;

public enum Reception {
    instance
    ;

    private ReceptionStaff receptionStaff;
    private Touchpad touchpad;
    private Writer writer;

    public void initialize(ReceptionStaff receptionStaff, Touchpad touchpad, Writer writer) {
        this.receptionStaff = receptionStaff;
        this.touchpad = touchpad;
        this.writer = writer;
    }

    public ReceptionStaff getReceptionStaff() {
        return this.receptionStaff;
    }

    public void setReceptionStaff(ReceptionStaff receptionStaff) {
        this.receptionStaff = receptionStaff;
    }

    public Touchpad getTouchpad() {
        return this.touchpad;
    }

    public void setTouchpad(Touchpad touchpad) {
        this.touchpad = touchpad;
    }

    public Writer getWriter() {
        return this.writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}
