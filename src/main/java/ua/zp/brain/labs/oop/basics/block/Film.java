package ua.zp.brain.labs.oop.basics.block;

public class Film {
    public static final String COMEDY="comedy";
    public static final String FANTASY="fantasy";
    public static final String HORRORS="horrors";
    private String name;
    private int duration;
    private String genre;

    {
        System.out.println("Create new film");
    }

    public Film(String name, int duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("A film \""+name+"\" successfully created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
