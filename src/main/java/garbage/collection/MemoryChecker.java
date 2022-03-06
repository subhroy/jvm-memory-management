package garbage.collection;

import java.lang.reflect.Array;

public class MemoryChecker {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();

    long availableBytes = runtime.freeMemory();
    System.out.println("Available memory initially: "+availableBytes/1024 +"k");

    for(int i=1; i<150; i++){
      Product c;
      c = new Product("Mobile");
    }

    availableBytes = runtime.freeMemory();
    System.out.println("Available memory Before GC : "+availableBytes/1024 +"k");

    System.gc();

    availableBytes = runtime.freeMemory();
    System.out.println("Available memory After GC : "+availableBytes/1024 +"k");
  }
}
