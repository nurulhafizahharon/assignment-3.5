public class Pet {

    private String name;
    private String breed;
    private String gender;
    private int age;
    private boolean isVaccinated;

    public Pet() {
    }

    public Pet(String name, String breed) {
        this(name, breed, "Unknown", 0, false);
    }

    public Pet(String name, String breed, String gender, int age, boolean isVaccinated) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public void call(String sound) {
        // for (int i = 0; i < 3; i++) {
        // System.out.println(sound);
        // }
        System.out.println(sound + " " + sound + " " + sound);

    }

    public void eat(String food) {
        System.out.println(getName() + " loves eating " + food);
        // System.out.println(this.name + " loves eating " + food);
    }

    public void sleep() {
        System.out.println(getName() + " is currently sleeping.");
        // System.out.println(this.name + " is currently sleeping.");
    }

}
