package x.snowroller.plugin;

import x.snowroller.spi.Page;

public class EnglishPage implements Page {

    @Override
    public void execute() {
        System.out.println("This is in English");
    }
}
