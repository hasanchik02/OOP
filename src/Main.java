import java.io.Console;

import model.FamilyTree;
import model.Human;
import model.serializable.FileHandeler;
import presenter.Presenter;
import ui.ConsoleUI;
import ui.View;

public class Main {
    FamilyTree<Human> familyTree = new FamilyTree<>();

    familyTree.addFamilyTree(new Human("Петр", "муж", 27));
    familyTree.addFamilyTree(new Human("Роман Андреевич Аносов", "муж", 56));

    View view = new Console();
    view.start();

    FileHandeler fileHandeler = new FileHandeler();
    fileHandeler.save(familyTree, "src/tree.out")
}
