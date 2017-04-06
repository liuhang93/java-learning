package com.liuhang.serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by liuhang on 2017/3/28.
 */
public class SerializeTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Tom");
        person.setAge(11);
        person.setSex("male");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream
                    (new File("/Users/liuhang/Git/person.txt")));
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
