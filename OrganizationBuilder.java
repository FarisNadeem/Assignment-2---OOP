package assignment2.commons;

public class OrganizationBuilder {
    private String string;

    public OrganizationBuilder setString(String string) {
        this.string = string;
        return this;
    }

    public Organization createOrganization() {
        return new Organization(string);
    }
}