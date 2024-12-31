package factory;

import factory.components.button.Button;
import factory.components.button.IOSButton;
import factory.components.menu.ISOMenu;
import factory.components.menu.Menu;

public class IOSUiFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu creteMenu() {
        return new ISOMenu();
    }
}
