package Q2;

public abstract class GUIFactory{ //Abstract factory also considered as the "Factory for factories", This interacts with the client at high level.
    public abstract AbstractTextField createTextField();
    public abstract AbstractPushButton createPushButton();
    public abstract AbstractListBox createListBox();
}