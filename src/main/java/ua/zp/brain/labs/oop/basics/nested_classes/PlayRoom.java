package ua.zp.brain.labs.oop.basics.nested_classes;

import java.util.Arrays;
import java.util.Comparator;

public class PlayRoom {
    public static void main(String[] args) {
        Game.GameDisk [] gameDisks=new Game.GameDisk[4];
        gameDisks[0]=Game.getDisk("Сталкер",Ganre.ACTION,"+18");
        gameDisks[1]=Game.getDisk("Сталкер",Ganre.ACTION,"+18");
        gameDisks[2]=Game.getDisk("Сталкер",Ganre.ACTION,"+18");
        gameDisks[3]=Game.getDisk("Сталкер",Ganre.ACTION,"+18");

        Game.VirtualGame [] virtualGames=new Game.VirtualGame[4];
        virtualGames[0]=Game.getVirtualGame("DOTA2",Ganre.STRATEGY,4);
        virtualGames[1]=Game.getVirtualGame("DOTA2",Ganre.STRATEGY,4);
        virtualGames[2]=Game.getVirtualGame("DOTA2",Ganre.STRATEGY,4);
        virtualGames[3]=Game.getVirtualGame("DOTA2",Ganre.STRATEGY,4);

        GameConsole gameConsole=new GameConsole(Brand.SONY,"PS4","123");

        Arrays.sort(gameDisks, new Comparator<Game.GameDisk>() {
            @Override
            public int compare(Game.GameDisk o1, Game.GameDisk o2) {
                Ganre ganre1=o1.getData().getGanre();
                Ganre ganre2=o2.getData().getGanre();
                return ganre1.compareTo(ganre2);
            }
        });
        Arrays.sort(virtualGames, new Comparator<Game.VirtualGame>() {
            @Override
            public int compare(Game.VirtualGame o1, Game.VirtualGame o2) {
                /*Integer rating1=o1.getRating();
                Integer rating2=o2.getRating();
                return rating1.compareTo(rating2);*/
                return Integer.compare(o1.getRating(),o2.getRating());
            }
        });
        //gameConsole.getFirstGamepad().powerON();
        gameConsole.loadGame(virtualGames[0]);
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
    }
}
