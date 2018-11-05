package com.example.li.lll.a24patternproject.chain;

import java.io.IOException;

public class ConnectInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        //终止继续。
        Response proced = new Response();
        System.out.println("ConnectInterceptor");
        return proced;
    }
}
