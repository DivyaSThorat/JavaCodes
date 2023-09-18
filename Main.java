package com.java;

//Example of a Car class composed of an Engine and Wheels

//Engine class
class Engine {
 private String type;
 
 public Engine(String type) {
     this.type = type;
 }
 
 public void start() {
     System.out.println("Engine started");
 }
 
 // Other engine methods
}

//Wheels class
class Wheels {
 private int count;
 
 public Wheels(int count) {
     this.count = count;
 }
 
 public void rotate() {
     System.out.println("Wheels rotating");
 }
 
 // Other wheels methods
}

//Car class composed of Engine and Wheels
class Car {
 private Engine engine;
 private Wheels[] wheels; // A car typically has four wheels
 
 public Car(String engineType) {
     this.engine = new Engine(engineType);
     this.wheels = new Wheels[4]; // Create an array of four wheels
     for (int i = 0; i < 4; i++) {
         this.wheels[i] = new Wheels(18); // 18-inch wheels for this example
     }
 }
 
 public void startCar() {
     engine.start();
 }
 
 public void drive() {
     for (Wheels wheel : wheels) {
         wheel.rotate();
     }
     System.out.println("Car is moving");
 }
 
 // Other car methods
}

public class Main {
 public static void main(String[] args) {
     // Create a car with a specific engine type
     Car myCar = new Car("V8");
     
     // Start the car and make it move
     myCar.startCar();
     myCar.drive();
 }
}
