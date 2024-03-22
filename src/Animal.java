public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private String gender;

    public Animal(String name, int age, boolean vaccinated, String gender) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public String getGender() {
        return gender;
    }

    public void adopt() {
        System.out.println(name + " has been adopted");
    }

    public void feed() {
        System.out.println(name + " has been fed");
    }
}
