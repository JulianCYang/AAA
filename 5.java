class timer {
   public static long calcRunTime(){

      long startTime = System.currentTimeMillis();

      //function that we are testing 

      long stopTime = System.currentTimeMillis();
      long elapsedTime = stopTime - startTime;

      return elapsedTime;
   }
}
