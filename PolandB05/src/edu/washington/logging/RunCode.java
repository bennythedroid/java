package edu.washington.logging;

import java.io.File;
import java.util.logging.Logger;

public class RunCode {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	File test = new File(".");
    	System.out.println(test.getAbsolutePath());


        System.out.println("Starting RunCode Logging 1.4");

        Logger log = Logger.getLogger("global");
        log.finest("I'm a lumberjack and I'm okay,");
        log.finer("I sleep all night and I work all day.");
        log.fine("He's a lumberjack and he's okay,");
        log.config("He sleeps all night and he works all day.");

        log.info("I cut down trees," + "I eat my lunch,"
                + "I go to the lavatory.");
        log.warning("On Wednesdays I go shopping,");
        log.severe("And have buttered scones for tea");

    }
}
