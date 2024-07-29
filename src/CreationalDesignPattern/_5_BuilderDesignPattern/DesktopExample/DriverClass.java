package CreationalDesignPattern._5_BuilderDesignPattern.DesktopExample;

public class DriverClass {
    public static void main(String[] args) {
        DesktopDirector director = new DesktopDirector();
        DellDesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
        Desktop dellDesktop = director.buildDesktop(dellDesktopBuilder);
        dellDesktop.display();
    }
}
