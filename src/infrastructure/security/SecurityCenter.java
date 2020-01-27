package infrastructure.security;

import human_resources.SecurityStaff;
import infrastructure.security.device.Reader;
import infrastructure.security.device.Writer;

public enum SecurityCenter {
    instance
    ;

    private SecurityStaff securityStaff;
    private Reader reader;
    private Writer writer;

    public void initialize(SecurityStaff securityStaff, Reader reader, Writer writer) {
        this.securityStaff = securityStaff;
        this.reader = reader;
        this.writer = writer;
    }

    public void initialize(SecurityStaff securityStaff) {
        this.securityStaff = securityStaff;
        this.reader = new Reader();
        this.writer = new Writer();
    }

    public SecurityStaff getSecurityStaff() {
        return securityStaff;
    }

    public void setSecurityStaff(SecurityStaff securityStaff) {
        this.securityStaff = securityStaff;
    }

    public Reader getReader() {
        return reader;
    }

    public Writer getWriter() {
        return writer;
    }
}
