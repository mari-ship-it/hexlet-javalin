package org.example.hexlet;

import io.javalin.Javalin;

public class HTTP_Session {

    public static void main(String[] args) {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        app.get("/hello", ctx -> {
            String name = ctx.queryParam("name");
            if (name != null && !name.isEmpty()) {
                ctx.result("Hello " + name + "!");
            } else {
                ctx.result("Hello, World!");
            }
        });
        app.start(7070);
    }
}
