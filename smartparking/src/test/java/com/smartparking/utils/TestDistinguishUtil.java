package com.smartparking.utils;

import okhttp3.*;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestDistinguishUtil {

    @Test
    public void testPostPic(){
        OkHttpClient client;
        System.out.println(getClass());
        String url = "https://api-cn.faceplusplus.com/imagepp/beta/licenseplate";
        File file = new File("car_1.jpg");
        RequestBody file_body = RequestBody.create(MediaType.parse("image/*"), file);
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("api_key", "qSoGwiJ8h7N4kje4Vzx2yap1FNPuVXZ7")
                .addFormDataPart("api_secret", "VFGDaid2O3uOTr0cgYHXMUF_rnJ7PPuK")
                .addFormDataPart("image_file", "car", file_body)
                .build();

        final Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        client = new OkHttpClient.Builder()
                .readTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS)
                .build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            public void onFailure(Call call, IOException e) {
                System.out.println("failed");
            }

            public void onResponse(Call call, Response response) throws IOException {
                System.out.println(request.body().toString());
            }
        });
    }

}
