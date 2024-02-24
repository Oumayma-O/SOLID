package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkIOReader implements NetworkReader {
    private String url;

    public NetworkIOReader(String url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        URL url = new URL(this.url);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder data = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            data.append(line);
        }
        reader.close();
        return data.toString();
    }
}
