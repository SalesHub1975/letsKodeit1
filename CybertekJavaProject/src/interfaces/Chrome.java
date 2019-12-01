package interfaces;

public class Chrome extends Browser implements Bookmark{



    @Override
    public void defMethod() {
        System.out.println("Overriden default method in the chrome");
    }

    @Override
    public void addUrlBookmark() {
        System.out.println("Adding current URL to the Bookmark in Chrome");
    }

    @Override
    public void removeUrlBookmark() {
        System.out.println("Removing current URL from Bookmark in Chrome");
    }

    @Override
    public void openBrowser() {
        System.out.println("Chrome is opening");
    }

    @Override
    public void closerBrowser() {
        System.out.println("Chrome is closing");
    }

    @Override
    public void goToUrl(String url) {
        System.out.println("Chrome is going to: " + url);
    }

    @Override
    public void openNewTab(String url) {
        System.out.println("Chrome is opening new tab: " + url);
    }
}
