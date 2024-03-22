public class Cat extends Animal {
    private boolean hasPlayed;
    private boolean likesCatnip;

    public Cat(String name, int age, boolean vaccinated,String gender, boolean likesCatnip) {
        super(name, age, vaccinated, gender);
        this.likesCatnip = likesCatnip;
        hasPlayed = false;
    }

    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void play() {
        hasPlayed = true;
    }

    public boolean hasPlayedWith() {
        return hasPlayed;
    }
}
