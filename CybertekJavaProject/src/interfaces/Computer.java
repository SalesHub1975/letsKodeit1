package interfaces;

public class Computer {

    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.goToUrl("google.com");
        chrome.closerBrowser();
        chrome.addUrlBookmark();
        chrome.defMethod();
        Bookmark.statMethod();
        System.out.println(Bookmark.i);

    }

}
