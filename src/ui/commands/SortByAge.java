package ui.commands;

import ui.ConsoleUI;

public class SortByAge {
    public sortByAge(ConsoleUI consoleUI) {
        super(consoleUI, "Отсортировать список по возрасту");
    }

    public void execute() { 
        consoleUI.SortByAge();
    }
}
