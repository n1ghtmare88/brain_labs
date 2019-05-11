package ua.zp.brain.labs.oop.basics.inheritance_and_polymorphism;

public final class Shop {
    private String nameShop;
    private String addressShop;
    private Manager manager;
    private Security security;
    private Client client;
    private Cashier cashier;

    public Shop(String nameShop, String addressShop) {
        this.nameShop = nameShop;
        this.addressShop = addressShop;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getAddressShop() {
        return addressShop;
    }

    public void setAddressShop(String addressShop) {
        this.addressShop = addressShop;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    @Override
    public String toString() {
        return
                "shop " + nameShop +
                "\naddressShop " + addressShop +
                "\nmanager " + manager +
                "\nsecurity " + security +
                "\nclient " + client +
                "\ncashier " + cashier;
    }
    public void open(){
        System.out.println("Shop is OPEN");
        manager.comeToWork();
        cashier.comeToWork();
        security.comeToWork();

    }
    public void lunch(){
        System.out.println("Shop closes for lunch");
        manager.dinner();
        cashier.dinner();
        security.dinner();
        client.sayGoodbye();
    }
    public void sell(){
        client.sayHello();
        manager.sayHello();
        client.aboutProduct();
        manager.makeWork();
        client.buy();
        cashier.makeWork();
        security.makeWork();
    }
}
