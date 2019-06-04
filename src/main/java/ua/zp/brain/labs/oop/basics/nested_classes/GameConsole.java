package ua.zp.brain.labs.oop.basics.nested_classes;

public class GameConsole implements Powered{
    private final Brand brand;
    private final String model;
    private final String serialNumber;
    private boolean isON;
    private Gamepad firstGamepad;
    private Gamepad secondGamepad;
    private Game activeGame;

    public GameConsole(Brand brand,String model, String serialNumber) {
        this.brand = brand;
        this.model=model;
        this.serialNumber = serialNumber;
        isON=false;
        firstGamepad=new Gamepad(this.brand,1);
        secondGamepad=new Gamepad(this.brand,2);
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

    public boolean isON() {
        return isON;
    }

    public void setON(boolean ON) {
        isON = ON;
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
        if(firstGamepad.isOn || secondGamepad.isOn){
            cableSelect();
            isON=true;
        }
        else {
            System.out.println("please stand by gamepad");
        }
    }

    @Override
    public void powerOff() {
        isON=false;
    }

    public void cableSelect(){
        if(!firstGamepad.isOn){
            firstGamepad.setConnectedNumber(2);
            secondGamepad.setConnectedNumber(1);
        }
    }

    public void loadGame(Game game){
        System.out.println("Игра \""+game.getName()+"\" загружается");
    }

    public void playGame(){
        //String charge;
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("");
        if(firstGamepad.isOn){
            firstGamepad.changeLevel-=10.0;
            if(firstGamepad.changeLevel==0){
                System.out.println("1й геймпад разрядился");
            }
            else {
                stringBuilder.append("1й геймпад имеет заряд "+firstGamepad.changeLevel+"%");
            }
            //charge="1й геймпад имеет заряд "+firstGamepad.changeLevel+"%";
        }
        if(secondGamepad.isOn){
            secondGamepad.changeLevel-=10.0;
            if(secondGamepad.changeLevel==0){
                System.out.println("2й геймпад разрядился");
            }
            else {
                stringBuilder.append(" 2й геймпад имеет заряд "+firstGamepad.changeLevel+"%");
            }
            //charge+=" 2й геймпад имеет заряд "+firstGamepad.changeLevel+"%";

        }
        System.out.println("Играем в "+activeGame.getName()+" "+stringBuilder);
    }
    public class Gamepad implements Powered{
        private final Brand brand;
        private final String consoleSerial;
        private int connectedNumber;
        private Color color;
        private double changeLevel;
        private boolean isOn;

        public Gamepad(Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            consoleSerial=serialNumber;
            color=Color.BLACK;
            changeLevel=100.0;
            isOn=false;
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

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        @Override
        public void powerON() {
            isOn=true;
        }

        @Override
        public void powerOff() {
            isOn=false;
        }
    }
}
