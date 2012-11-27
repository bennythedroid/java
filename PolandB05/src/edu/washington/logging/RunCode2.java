/**
 *
 */
package edu.washington.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author appleman
 * 
 */
public class RunCode2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Logger log = Logger.getLogger("abc.def");
        log.setLevel(Level.FINEST);
        ConsoleHandler c1 = new ConsoleHandler();
        c1.setLevel(Level.FINEST);
        log.addHandler(c1);

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
