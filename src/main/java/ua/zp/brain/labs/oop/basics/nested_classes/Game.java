package ua.zp.brain.labs.oop.basics.nested_classes;

public class Game {
    private final String name;
    private final Ganre ganre;
    private final Type type;

    private enum Type{
        VIRTUAL,PHYSICAL;
    }

    private Game(String name, Ganre ganre, Type type) {
        this.name = name;
        this.ganre = ganre;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Ganre getGanre() {
        return ganre;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", ganre=" + ganre +
                ", type=" + type +
                '}';
    }

    public static class GameDisk extends Game{
        private final String description;
        private final Game data;

        private GameDisk(String name,Ganre ganre,String description) {
            super(name,ganre,Type.PHYSICAL);
            data=new Game(name,ganre,Type.PHYSICAL);
            this.description=description;
        }

        public String getDescription() {
            return description;
        }

        public Game getData() {
            return data;
        }


    }

    public static class VirtualGame extends Game{
        private int rating;
        private final Game data;

        private VirtualGame(String name,Ganre ganre,int rating) {
            super(name,ganre,Type.VIRTUAL);
            data=new Game(name,ganre,Type.VIRTUAL);
            this.rating=rating;
        }

        public Game getData() {
            return data;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "VirtualGame{" +
                    "rating=" + rating +
                    ", data=" + data +
                    '}';
        }
    }

    public static GameDisk getDisk(String name,Ganre ganre,String description){
        return new GameDisk(name,ganre,description);
    }

    public static VirtualGame getVirtualGame(String name,Ganre ganre,int rating){
        return new VirtualGame(name,ganre,rating);
    }
}
