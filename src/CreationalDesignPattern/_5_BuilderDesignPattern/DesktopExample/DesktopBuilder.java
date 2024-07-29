package CreationalDesignPattern._5_BuilderDesignPattern.DesktopExample;

public abstract class DesktopBuilder {

    protected Desktop desktop = new Desktop();

    public abstract void buildMotherboard();

    public abstract void buildProcessor();

    public abstract void buildMemory();

    public abstract void buildStorage();

    public abstract void buildGraphicCard();

    public Desktop getDesktop() {
        return desktop;
    }
}
