package factory;

import factory.components.button.Button;
import factory.components.button.MACButton;
import factory.components.menu.MACMenu;
import factory.components.menu.Menu;

public class MACUiFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public Menu creteMenu() {
        return new MACMenu();
    }
}
