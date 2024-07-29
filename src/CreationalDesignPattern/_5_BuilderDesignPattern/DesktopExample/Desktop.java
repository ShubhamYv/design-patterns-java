package CreationalDesignPattern._5_BuilderDesignPattern.DesktopExample;

public class Desktop {

    private String motherboard;
    private String processor;
    private String memory;
    private String storage;
    private String graphicCard;

    public void display() {
        System.out.println("Desktop specs");
        System.out.println("motherboard::" + motherboard);
        System.out.println("processor::" + processor);
        System.out.println("memory::" + memory);
        System.out.println("storage::" + storage);
        System.out.println("graphicCard::" + graphicCard);
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }
}
