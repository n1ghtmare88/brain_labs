/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.nested_classes;

public class GameConsole implements Powered {
    private final Brand brand;
    private final String model;
    private final String serialNumber;
    private boolean consoleIsON;
    private Gamepad firstGamepad;
    private Gamepad secondGamepad;
    private Game activeGame;
    private int waitingCounter;

    public GameConsole(Brand brand, String model, String serialNumber) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        consoleIsON = false;
        firstGamepad = new Gamepad(this.brand, 1);
        secondGamepad = new Gamepad(this.brand, 2);
        waitingCounter = 0;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isConsoleIsON() {
        return consoleIsON;
    }

    public void setConsoleIsON(boolean ON) {
        consoleIsON = ON;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public void setFirstGamepad(Gamepad firstGamepad) {
        this.firstGamepad = firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public void setSecondGamepad(Gamepad secondGamepad) {
        this.secondGamepad = secondGamepad;
    }

    public Game getActiveGame() {
        return activeGame;
    }

    public void setActiveGame(Game activeGame) {
        this.activeGame = activeGame;
    }

    @Override
    public void powerON() {
        if (firstGamepad.gamepadIsOn || secondGamepad.gamepadIsOn) {
            consoleIsON = true;
        } else {
            throw new GameConsoleException("please stand by gamepad");
            //System.out.println("please stand by gamepad");
        }
    }

    @Override
    public void powerOff() {
        consoleIsON = false;
    }

    public void cableSelect() {
        if (!firstGamepad.gamepadIsOn && secondGamepad.gamepadIsOn) {
            firstGamepad.setConnectedNumber(2);
            secondGamepad.setConnectedNumber(1);
        }
    }

    public void loadGame(Game game) {
        powerON();
        activeGame = game;
        System.out.println("Игра \"" + game.getName() + "\" загружается");
    }

    public void playGame() {
        checkStatus();
        System.out.println("Играем в " + activeGame.getName() + " " + chargeStatus());
    }

    private StringBuilder chargeStatus(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        if (firstGamepad.gamepadIsOn) {
            firstGamepad.changeLevel -= 10.0;
            if (firstGamepad.changeLevel == 0) {
                System.out.println(firstGamepad.connectedNumber+"й геймпад разрядился");
                firstGamepad.powerOff();
            } else {
                stringBuilder.append(firstGamepad.connectedNumber+"й геймпад имеет заряд " + firstGamepad.changeLevel + "%");
            }
        }
        if (secondGamepad.gamepadIsOn) {
            secondGamepad.changeLevel -= 10.0;
            if (secondGamepad.changeLevel == 0) {
                System.out.println(secondGamepad.connectedNumber+"й геймпад разрядился");
                secondGamepad.powerOff();
            } else {
                stringBuilder.append(" "+secondGamepad.connectedNumber+"й геймпад имеет заряд " + secondGamepad.changeLevel + "%");
            }
        }
        return stringBuilder;
    }
    private void checkStatus() {
        if (waitingCounter == 5) {
            consoleIsON = false;
            throw new GameConsoleException("Приставка завершает работу из-за отсутствия активности");
        }
        if (!firstGamepad.gamepadIsOn && !secondGamepad.gamepadIsOn) {
            System.out.println("Подключите джойстик!!!");
            waitingCounter++;
        }
        if (firstGamepad.gamepadIsOn || secondGamepad.gamepadIsOn) {
            waitingCounter = 0;
        }
    }

    public class Gamepad implements Powered {
        private final Brand brand;
        private final String consoleSerial;
        private int connectedNumber;
        private Color color;
        private double changeLevel;
        private boolean gamepadIsOn;

        public Gamepad(Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            consoleSerial = serialNumber;
            color = Color.BLACK;
            changeLevel = 100.0;
            gamepadIsOn = false;
        }

        public Brand getBrand() {
            return brand;
        }

        public String getConsoleSerial() {
            return consoleSerial;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public void setConnectedNumber(int connectedNumber) {
            this.connectedNumber = connectedNumber;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public double getChangeLevel() {
            return changeLevel;
        }

        public void setChangeLevel(double changeLevel) {
            this.changeLevel = changeLevel;
        }

        public boolean isGamepadIsOn() {
            return gamepadIsOn;
        }

        public void setGamepadIsOn(boolean on) {
            gamepadIsOn = on;
        }

        @Override
        public void powerON() {
            gamepadIsOn = true;
            changeLevel = 100.0;
            consoleIsON = true;
            cableSelect();
        }

        @Override
        public void powerOff() {
            gamepadIsOn = false;
            cableSelect();
        }
    }
}
