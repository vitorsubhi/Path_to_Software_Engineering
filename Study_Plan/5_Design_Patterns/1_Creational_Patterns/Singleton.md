# Singleton
**Singleton** is a creational design pattern that lets you ensure that a class has only one instance and provides a global point of access to that instance.
### Java
This is a thread-safe Singleton class implementation using the Double-Checked Locking (DCL) pattern.
```java
    public final class Singleton {
        // Volatile keyword ensures visibility of changes to instance across threads
        private static volatile Singleton instance;

        /**
If instance is still not initialized, create a new instancets instantiation from outside the class.
         * This ensures that the Singleton class cannot be instantiated from other classes.
         */
        private Singleton(){
            // Initialize shared values or perform setup operations here
            // This constructor is called only once, when the instance is created
        }

        /**
         * Provides access to the single instance of the Singleton class.
         * This method is synchronized to ensure thread safety and to prevent multiple threads from creating multiple instances.
         * The double-checked locking pattern is used to minimize the overhead of acquiring the lock.
         * 
         * @return The single instance of the Singleton class.
         */
        public static Singleton getInstance(){
            // First check (without synchronization) to see if the instance is already initialized
            Singleton result = instance;
            if (result != null){ 
                // If already initialized, return the existing instance
                return result;
            }

            // Synchronize on the class object to ensure only one thread can initialize the instance
            synchronized(Singleton.class){
                // Second check (inside synchronization block) to ensure that only one instance is created.
                if (instance == null){
                    // If instance is still not initialized, create a new instance.
                    instance = new Singleton();
                }
                // Return the single instance
                return instance;
            }
        }
    }

```