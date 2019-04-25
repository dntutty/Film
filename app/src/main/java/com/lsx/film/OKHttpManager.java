package com.lsx.film;

import java.io.IOError;
import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OKHttpManager {
    private static OKHttpManager instance;
    private static OkHttpClient client;
    public static OKHttpManager getInstance() {
        if(null==instance) {
            instance = new OKHttpManager();
        }
        return instance;
    }

    public OKHttpManager() {
        client = new OkHttpClient();
    }

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        try(Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
