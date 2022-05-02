public class Cat {

    private String name;
    private String voice;

    public Cat() {
    }

    public Cat(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}
