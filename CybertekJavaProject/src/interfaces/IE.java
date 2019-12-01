package interfaces;

public class IE extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("IE is opening");
    }

    @Override
    public void closerBrowser() {
        System.out.println("IE is closing");
    }

    @Override
    public void goToUrl(String url) {
        System.out.println("IE is going to: " + url);
    }

    @Override
    public void openNewTab(String url) {
        System.out.println("IE is opening new tab: " + url);
    }
}
