package kmitl.singleton;

/**
 * Superclass for the company inh. tree
 */
public abstract class Company implements ICompany {

    private String taxId;

    /**
     * factory method for subclasses
     * @param companyType type of the company
     * @return return an object of the company type
     */
    public static Company create(CompanyType companyType) {
        Company company = null;
        switch(companyType) {
            case LOCAL:
                // code block
                company = new LocalCompany();
                break;
            case FOREIGN:
                // code block
                company = new ForeignCompany();
                break;
        }
        return company;
    }

    // fields
    protected long id;
    protected String name;

    // Constructor
    public Company() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return this.taxId;
    }
}
