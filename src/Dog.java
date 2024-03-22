public class Dog extends Animal {
    private String breed;
    private boolean isWalked;
    public Dog(String name, int age, boolean vaccinated, String gender, String breed) {
        super(name, age, vaccinated, gender);
        this.breed = breed;
        isWalked = false;
    }

    public String getBreed() {
        return breed;
    }

    public void walk() {
        isWalked = true;
    }

    public boolean hasBeenWalked() {
        return isWalked;
    }
}
