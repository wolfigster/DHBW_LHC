package infrastructure.security;

import human_resources.ReceptionStaff;
import infrastructure.security.device.Reader;
import infrastructure.security.device.Writer;

public enum Reception {
    instance
    ;

    private ReceptionStaff receptionStaff;
    private Reader reader;
    private Writer writer;

    public void initialize(ReceptionStaff receptionStaff, Reader reader, Writer writer) {
        this.receptionStaff = receptionStaff;
        this.reader = reader;
        this.writer = writer;
    }

    public void initialize(ReceptionStaff receptionStaff) {
        this.receptionStaff = receptionStaff;
        this.reader = new Reader();
        this.writer = new Writer();
    }

    public ReceptionStaff getReceptionStaff() {
        return receptionStaff;
    }

    public void setReceptionStaff(ReceptionStaff receptionStaff) {
        this.receptionStaff = receptionStaff;
    }

    public Reader getReader() {
        return reader;
    }

    public Writer getWriter() {
        return writer;
    }
}
