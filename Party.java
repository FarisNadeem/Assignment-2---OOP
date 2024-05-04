package assignment2.organizations.party;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;

import java.util.ArrayList;
import java.util.List;

public class Party extends Organization implements Contactable {
String mission;
String email, address, phoneNumber;
List<Election> elections = new ArrayList<>();

public Party(String name, String mission) {
super(name);
this.mission = mission;
}

public void addElection(Election e) {
elections.add(e);
}

public boolean removeElection(Election e) {
return elections.remove(e);
}

public List<Election> getFairElections() {
List<Election> fairElections = new ArrayList<>();
for (Election election : elections) {
if (election.isFair()) {
fairElections.add(election);
}
}
return fairElections;
}

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }

    // ... Getters, Setters, and Contactable methods (See below)
}