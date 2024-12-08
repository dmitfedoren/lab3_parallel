package com.company;

public class Main {
    public static void main(String[] args) {
        int storageSize = 5;
        int totalItems = 20;
        int producersCount = 3;
        int consumersCount = 2;
        Manager manager = new Manager(storageSize);
        int itemsPerProducer = totalItems / producersCount;
        int itemsPerConsumer = totalItems / consumersCount;
        for (int i = 0; i < producersCount; i++) {
            new Producer(itemsPerProducer, manager);
        }
        for (int i = 0; i < consumersCount; i++) {
            new Consumer(itemsPerConsumer, manager);
        }
    }
}