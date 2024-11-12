package Q2;

public class MacFactory extends GUIFactory{ //Concrete factory for Mac product creation.
    public AbstractTextField createTextField(){
        return new MacosTextField();
    }
    public AbstractPushButton createPushButton(){
        return new MacosPushButton();
    }
    public AbstractListBox createListBox(){
        return new MacosListBox();
    }
}