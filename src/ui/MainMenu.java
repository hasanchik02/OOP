package ui;

import java.util.ArrayList;
import java.util.List;

import ui.commands.AddHuman;
import ui.commands.Command;
import ui.commands.Finish;
import ui.commands.GetGeoInfo;
import ui.commands.SortByAge;
import ui.commands.SortByName;

public class MainMenu {
    private List<Command> commandsList;

    public MainMenu(ConsoleUI consoleUI) {
        commandsList = new ArrayList<>();
        commandsList.add(new AddHuman(consoleUI));
        commandsList.add(new GetGeoInfo(consoleUI));
        commandsList.add(new SortByName(consoleUI));
        commandsList.add(new SortByAge(consoleUI));
        commandsList.add(new Finish(consoleUI));
    }

    public int getSize() {
        return commandsList.size();
    }

    public String menu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandsList.size(); i++){
            stringBuilder.append(i + 1);
            stringBuilder.append(command.getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) {
        Command command = commandsList.get(choice - 1);
        command.execute();
    }
}
