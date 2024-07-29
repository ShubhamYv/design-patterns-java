package CreationalDesignPattern._5_BuilderDesignPattern.DesktopExample;

public class DellDesktopBuilder extends DesktopBuilder {

    @Override
    public void buildMotherboard() {
        desktop.setMotherboard("Dell:: Motherboard");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("Dell:: Intel core i5");
    }

    @Override
    public void buildMemory() {
        desktop.setMemory("Dell:: 16GB DDR4 RAM");
    }

    @Override
    public void buildStorage() {
        desktop.setStorage("Dell:: 512GB SSD");
    }

    @Override
    public void buildGraphicCard() {
        desktop.setGraphicCard("Dell:: Intel Integrated Graphics");
    }
}
