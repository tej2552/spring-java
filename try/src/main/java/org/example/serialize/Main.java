package org.example.serialize;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serialization s = new Serialization();
        Deserialization ds = new Deserialization();

        s.serialise();
        ds.deserialize();
    }
}
