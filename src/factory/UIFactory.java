package factory;

import factory.components.button.Button;
import factory.components.menu.Menu;

public interface UIFactory {

    //Factory Method

    Button createButton();

    Menu creteMenu();

}
