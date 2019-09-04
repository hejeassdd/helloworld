package com.company;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObj();
        readObj();
    }

    public static void writeObj () throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\obj.object");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new Person("jordan",20));
        objectOutputStream.close();
    }

    public static void readObj() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:\\obj.object");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person = (Person) objectInputStream.readObject();
        System.out.println(person.toString());

    }
}
