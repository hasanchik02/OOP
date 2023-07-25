package ui.commands;

import ui.ConsoleUI;

public class GetGeoInfo {
     public getGeoInfo(ConsoleUI consoleUI) {
        super(consoleUI,"Получить список людей в древе" );
    }

    public void execute() {
        consoleUI.getGeoInfo();
    }
}
