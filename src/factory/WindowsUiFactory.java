package factory;

import factory.components.button.Button;
import factory.components.button.WindowsButton;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;

public class WindowsUiFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }


    @Override
    public Menu creteMenu() {
        return new AndroidMenu();
    }
}
