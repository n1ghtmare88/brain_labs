package ua.zp.brain.labs.oop.basics.block;

public class Main {

    public static void main(String[] args) {

        Film film = new Film("Independence Day", 50, Film.FANTASY);
        Library library = new Library("favorite");
        int index=Library.retIndex(library);
        while (index<library.getArrays().length)
        {
            library.getArrays()[index]=new Film("test"+(index-1),55,Film.FANTASY);
            index++;
        }
        System.out.println("Library is full!!!");
        //

    }
}
