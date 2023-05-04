package wackyrace;

public class Runner {
    private String name;
    private int age;
    private String specie;
    private String characteristic;

    public Runner(String name, int age, String specie, String characteristic) {
        this.name = name;
        this.age = age;
        this.specie = specie;
        this.characteristic = characteristic;
    }

    // Accessor and mutator methods for the private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
}