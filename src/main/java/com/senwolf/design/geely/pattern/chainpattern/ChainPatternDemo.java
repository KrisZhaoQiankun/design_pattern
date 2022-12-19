package com.senwolf.design.geely.pattern.chainpattern;

public class ChainPatternDemo {
   
   private static AbstractLogger getChainOfLoggers(){
 
      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
 
      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);
 
      return errorLogger;  
   }


   /**
    * 责任链模式优缺点：
    * 优点：1. 请求和处理分开，请求者不需要知道是谁去处理，不需要知道系统的全貌
    * 2. 提升系统灵活性
    * 缺点：1. 链比较长的时候性能下降
    * 2. 脸部不能剩余
    *
    * @description
    * @param String args
    * @return void
    * @throws
    * @author 赵乾坤
    * @time 2022/12/19 23:45
    */
   public static void main(String[] args) {

      AbstractLogger loggerChain = getChainOfLoggers();
 
      loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
 
      loggerChain.logMessage(AbstractLogger.DEBUG, 
         "This is a debug level information.");
 
      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
   }
}