package ua.zp.brain.labs.oop.basics.nested_classes;

public class GameConsole {
    private Brand brand;
    private String model;
    private String serialNumber;
    private boolean isON;
    private Gamepad firstGamepad;
    private Gamepad secondGamepad;

    public GameConsole(Brand brand, String serialNumber) {
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public class Gamepad{
        private Brand brand;
        private String serialNumber;
        private String serialNumberConsole;
        private byte connectedNumber;
        private Color color;
        private double changeLevel;
        private boolean isOn;

        public Gamepad(Brand brand, byte connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            serialNumberConsole=GameConsole.this.serialNumber;
            GameConsole.this.firstGamepad=new Gamepad(brand,(byte) 1);
            GameConsole.this.secondGamepad=new Gamepad(brand,(byte)2);
        }
    }
}
