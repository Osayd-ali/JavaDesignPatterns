package Q2;

public class WinFactory extends GUIFactory{ //Concrete factory for windows product creation.
    public AbstractTextField createTextField(){
        return new WindowsTextField();
    }
    public AbstractPushButton createPushButton(){
        return new WindowsPushButton();
    }
    public AbstractListBox createListBox(){
        return new WindowsListBox();
    }
}


