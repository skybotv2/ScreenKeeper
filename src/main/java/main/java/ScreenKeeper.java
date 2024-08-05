package main.java;

import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ScreenKeeper {
    private static final Log log = LogFactory.getLog(ScreenKeeper.class);

    public static void main(String[] args) {
         try {
          
            createScreen(args);
           
        } catch (Exception e) {
            log.error("Fatal error will terminate: " + e);
        }
    } 

    private static void createScreen(String[] args) {
        String timer = parseArguments(args,0);
        log.info("Timer: " + timer);
        if (timer.length() <= 0 ){
            log.info("Please enter how long to keep the screen active in minutes:");
            DefaultParser parser =  new DefaultParser();
            Options option = new Options();
            option.addOption("t", "timer", true, "Set the timer for the screen to stay active");

        }
        log.info("Timer: " + timer);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void setTimer(){

    }

    private static String parseArguments(String[] args, int number) {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        if (args.length < number) {
            throw new IllegalArgumentException("Invalid number of arguments");
        }
       return args[number];
    }
}