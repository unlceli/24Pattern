package com.example.li.lll.a24patternproject.chain;

import java.io.IOException;

public interface Interceptor {
    Response intercept(Chain chain) throws IOException;

    interface Chain {
        Request request();

        Response proced(Request request) throws IOException;
    }
}
