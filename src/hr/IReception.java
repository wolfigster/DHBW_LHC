package hr;

import hr.person.Person;

import java.util.Date;

public interface IReception {

    void createIDCard(Person person, Date validFrom, Date validUntil, Permission... permissions);
}
