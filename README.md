# Tetris Music implemented in Java
Tetris music programmed within Java code that you can use in any project in a very simple way.
### Installation
Clone repo and import the files to the project.
To start the music use:
```java
Music m = new Music(); // To create the music Object
m.start(); // To start the music
```
To stop the music use:
```java
m.end(); // To start the music
```
Example
----
This code plays the music for 60 seconds:
```java
public static void main(String[] args) {
Music m = new Music();
m.start();
try {
Thread.sleep(60000);
} catch (InterruptedException e) {
}
m.end();
}
```
License
----
GPL v3
