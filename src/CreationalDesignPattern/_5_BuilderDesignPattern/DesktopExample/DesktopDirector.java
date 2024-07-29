package CreationalDesignPattern._5_BuilderDesignPattern.DesktopExample;

public class DesktopDirector {

    public Desktop buildDesktop(DesktopBuilder builder) {
        builder.buildMotherboard();
        builder.buildMemory();
        builder.buildGraphicCard();
        builder.buildProcessor();
        builder.buildMemory();
        return builder.getDesktop();
    }
}
