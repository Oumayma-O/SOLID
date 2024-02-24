package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModule {
    private IFileReader fileReader;
    private IFileWriter fileWriter;
    private NetworkReader networkReader;
    private DatabaseWriter databaseWriter;

    public EncodingModule(IFileReader fileReader, IFileWriter fileWriter, NetworkReader networkReader, DatabaseWriter databaseWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
        this.networkReader = networkReader;
        this.databaseWriter = databaseWriter;
    }

    public void encodeWithFiles() throws IOException {
        String data = fileReader.read();
        String encodedData = encode(data);
        fileWriter.write(encodedData);
    }

    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        String data = networkReader.read();
        String encodedData = encode(data);
        databaseWriter.write(encodedData);
    }

    private String encode(String data) {
        return Base64Encoder.encode(data);
    }
}
