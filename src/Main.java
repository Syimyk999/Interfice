//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RemoteController controller = new RemoteController();
        Fen fen = new Fen();
        TV tv = new TV();
        Lamp lamp = new Lamp();

        controller.powerOff(fen);
        controller.powerOff(lamp);

        Mover mover = new Mover();
        mover.moveObject(fen);
        mover.moveObject(lamp);


    }
}