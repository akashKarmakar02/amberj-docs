package com.amberj;

import com.amberj.net.httpserver.Server;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var server = new Server(8000);

        server.get("/", ((httpRequest, httpResponse) -> {
            httpResponse.render("index");
        }));

        server.run();
    }
}