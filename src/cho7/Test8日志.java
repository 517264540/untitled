package cho7;


import java.util.logging.*;

public class Test8日志 {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler(); //FileHandler();
        handler.setLevel(Level.FINER);

        //（上面如果换成File那个）ls ~ 能看到java0.log的文件,里面就是日志

        logger.addHandler(handler);
        logger.setLevel(Level.FINER);







        logger.setLevel(Level.ALL);
        Filter filter = new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
//                if (record.getMessage().length() < 6)
//                    return false;
//                else
//                    return true;
                return record.getMessage().length() < 6 ? false : true;
            }
        };
        logger.setFilter(filter);










        Logger.getGlobal().severe("severe");
        Logger.getGlobal().warning("warning");
        Logger.getGlobal().info("info");
        Logger.getGlobal().fine("fine");
        Logger.getGlobal().config("config");
        Logger.getGlobal().finer("finer");
        Logger.getGlobal().finest("finest");

    }
}
