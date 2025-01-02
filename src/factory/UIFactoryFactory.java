package factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(Platform platform){

        if(platform.equals(Platform.ANDROID)){
            return new AndroidUiFactory();
        }else if(platform.equals(Platform.MAC)){
            return  new MACUiFactory();
        } else if (platform.equals(Platform.ISO)) {
            return  new IOSUiFactory();
        } else if (platform.equals(Platform.WINDOWS)) {
            return  new WindowsUiFactory();
        }
        return null;
    }
}
