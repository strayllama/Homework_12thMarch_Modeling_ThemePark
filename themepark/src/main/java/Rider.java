public abstract class Rider {
    private String name;
    private PersonType personType;
    private int height;

    public Rider(String name, PersonType personType, int height) {
        this.name = name;
        this.personType = personType;
        this.height = height;
    }

    //GETTERS
    public String getName() {
        return this.name;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public int getHeight() {
        return this.height;
    }
}
