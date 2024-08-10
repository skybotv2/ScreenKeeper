package main.java;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ScreenKeeper {
    private static final Log log = LogFactory.getLog(ScreenKeeper.class);

    public static void main(String[] args) {
        while(true){
            System.out.println("Hello World");
            System.out.flush();
    
            
                try {
                    createScreen(args);
                } catch (Exception e) {
                    log.error("Fatal error will terminate:", e);
                    log.error(e.getStackTrace(), e);
                }
        }
        
        
    } 

    private static void createScreen(String[] args)throws Exception {
        // String timer = parseArguments(args,0);
        String timer = "0";
        if (args.length > 0){
            log.info("Timer: " + args[0]);
            timer = args[0];
        }
        log.info("Timer: " + timer);
        if ("0".equals(timer)){
            log.info("Please enter an integer in minutes to keep the screen active:");
            System.out.println("test");
            try (
                Scanner in = new Scanner(System.in)){
                int minutes = 0;
                if (StringUtils.isNumeric(in.toString())){
                    minutes = in.nextInt();
                    in.nextLine();
                }   log.info("You entered string " + minutes);
                /*  DefaultParser parser =  new DefaultParser();
                Options option = new Options();
                option.addOption("t", "timer", true, "Set the timer for the screen to stay active");
                 */
                in.close();
                timer = Integer.toString(minutes);
            }
        }
        log.info("Timer: " + timer);
    }
}