package CreationalDesignPattern._5_BuilderDesignPattern.DesktopExample;

public class HpDesktopBuilder extends DesktopBuilder {

    @Override
    public void buildMotherboard() {
        desktop.setMotherboard("HP:: Motherboard");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("HP:: Intel core i5");
    }

    @Override
    public void buildMemory() {
        desktop.setMemory("HP:: 16GB DDR4 RAM");
    }

    @Override
    public void buildStorage() {
        desktop.setStorage("HP:: 512GB SSD");
    }

    @Override
    public void buildGraphicCard() {
        desktop.setGraphicCard("HP:: Intel Integrated Graphics");
    }
}
