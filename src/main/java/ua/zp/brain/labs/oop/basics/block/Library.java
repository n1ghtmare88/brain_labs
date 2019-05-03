package ua.zp.brain.labs.oop.basics.block;
public class Library {
    private final String NAME_LIBRARY;
    private Film[] arrays;

    {
        arrays = new Film[5];
        arrays[0] = new Film("Terminator", 55, Film.FANTASY);
        arrays[1] = new Film("Mask", 75, Film.COMEDY);
        System.out.println("Added favorite movies");
    }

    public Library(String nameLibrary) {
        NAME_LIBRARY = nameLibrary;
        System.out.println("A Library \"" + NAME_LIBRARY + "\" successfully created");

    }

    public Film[] getArrays() {
        return arrays;
    }

    public String getNameLibrary() {
        return NAME_LIBRARY;
    }

    public static int retIndex(Library library) {
        for (int i = 0; i < library.getArrays().length; i++) {
            if (library.getArrays()[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
