package factory.components;

import factory.Flutter;
import factory.UIFactory;
import factory.components.button.Button;
import factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        //From flutter, we should be able to get the object of corresponding factory based on the platform.
        UIFactory  uiFactory = flutter.getUIFactory(Platform.WINDOWS);

        Button button =  uiFactory.createButton();
        button.displayButton();

        Menu menu = uiFactory.creteMenu();
        menu.display();

    }
}
