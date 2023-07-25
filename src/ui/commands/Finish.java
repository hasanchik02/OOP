package ui.commands;

import ui.ConsoleUI;

public class Finish {
     public Finish(ConsoleUI consoleUI) {
        super(consoleUI, "Закончить работу ");
    }

    public void execute() { 
        consoleUI.finish();
    }
}
