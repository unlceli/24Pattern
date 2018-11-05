package com.example.li.lll.a24patternproject.chain;

import java.io.IOException;

public class BridgeInterceptor implements Interceptor{
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request =chain.request();
        //继续操作。
        Response networkResponse =chain.proced(request);
        System.out.println("BridgeInterceptor");

        return networkResponse;
    }
}
