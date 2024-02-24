package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        IFileReader fileReader = new FileIOReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IFileWriter fileWriter = new FileIOWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        NetworkReader networkReader = new NetworkIOReader("http://myfirstappwith.appspot.com/index.html");
        DatabaseWriter databaseWriter = new MyDatabase();

        EncodingModule encodingModule = new EncodingModule(fileReader, fileWriter, networkReader, databaseWriter);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
