package interfaces;

public interface Bookmark {

    int i = 0;
    public abstract  void addUrlBookmark();
    public abstract void removeUrlBookmark();
    public default  void defMethod(){
        System.out.println("This is default method from Bookmark");
    }
    public static void statMethod(){
        System.out.println("Static method in Interface");
    }





}

