package Cwiczenia.EscapeRoom;

public class ERLauncher {
    public static void main(String[] args) {

        //Controller controller = new ControllerConsole();
        Controller controller = new ControllerWindow();
        controller.startGame();

    }
}
