package factory.components;

import factory.UIFactory;
import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;

public class AndroidUiFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu creteMenu() {
        return new AndroidMenu();
    }
}
