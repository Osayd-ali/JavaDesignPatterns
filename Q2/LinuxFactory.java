package Q2;

public class LinuxFactory extends GUIFactory{ //Concrete factory for Linux product creation.
    public AbstractTextField createTextField(){
        return new LinuxTextField();
    }
    public AbstractPushButton createPushButton(){
        return new LinuxPushButton();
    }
    public AbstractListBox createListBox(){
        return new LinuxListBox();
    }
}