package ui.commands;

import ui.ConsoleUI;

public class SortByName {
      public sortByName(ConsoleUI consoleUI) {
        super(consoleUI, "Отсортировать список по имени");
    }

    public void execute() { 
        consoleUI.sortByName();
    }
}
