package ua.zp.brain.labs.oop.basics.nested_classes;

import java.util.Arrays;
import java.util.Comparator;

public class PlayRoom {
    public static void main(String[] args) {
        Game.GameDisk [] gameDisks=new Game.GameDisk[4];
        gameDisks[0]=Game.getDisk("Warcraft 3",Ganre.STRATEGY,"+18");
        gameDisks[1]=Game.getDisk("Need for Speed",Ganre.RACE,"+18");
        gameDisks[2]=Game.getDisk("Stalker",Ganre.ACTION,"+18");
        gameDisks[3]=Game.getDisk("FIFA 2019",Ganre.SPORT,"+18");

        Game.VirtualGame [] virtualGames=new Game.VirtualGame[4];
        virtualGames[0]=Game.getVirtualGame("Dota 2",Ganre.STRATEGY,4);
        virtualGames[1]=Game.getVirtualGame("Counter Strike",Ganre.ACTION,1);
        virtualGames[2]=Game.getVirtualGame("Left 4 Dead",Ganre.ACTION,2);
        virtualGames[3]=Game.getVirtualGame("Portal 2",Ganre.STRATEGY,3);

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
                return Integer.compare(o1.getRating(),o2.getRating());
            }
        });

        //System.out.println(Arrays.toString(virtualGames));
        //System.out.println(Arrays.toString(gameDisks));

        gameConsole.getSecondGamepad().powerON();

        //gameConsole.powerON();


        gameConsole.loadGame(virtualGames[0]);
        gameConsole.playGame();
        gameConsole.playGame();
        System.out.println(gameConsole.getFirstGamepad().getConnectedNumber());
        System.out.println(gameConsole.getSecondGamepad().getConnectedNumber());
        gameConsole.getFirstGamepad().powerOff();
        gameConsole.playGame();
        gameConsole.getSecondGamepad().powerON();
        gameConsole.playGame();
        gameConsole.playGame();
        gameConsole.playGame();
        System.out.println(gameConsole.getFirstGamepad().getConnectedNumber());
        System.out.println(gameConsole.getSecondGamepad().getConnectedNumber());



/*


             gameConsole.loadGame(gameDisks[0]);
             gameConsole.getFirstGamepad().powerON();

        for (int i = 0; i <20 ; i++) {
            gameConsole.playGame();
        }
        System.out.println(gameConsole.getFirstGamepad().getChangeLevel());
            gameConsole.getFirstGamepad().powerON();
        System.out.println(gameConsole.getFirstGamepad().getChangeLevel());
        for (int i = 0; i <20 ; i++) {
            gameConsole.playGame();
        }
        gameConsole.getSecondGamepad().powerON();
        for (int i = 0; i <20 ; i++) {
            gameConsole.playGame();
        }*/
    }
}
