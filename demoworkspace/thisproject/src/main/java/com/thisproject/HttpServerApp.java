package com.thisproject;




import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;


public class HttpServerApp {
    public static void main(String[] args) throws Exception {
        int port = 8001;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        server.createContext("/", new StaticHandler("/static/index.html"));
        server.createContext("/static", new ClasspathStaticHandler("/static"));

        server.setExecutor(null);
        server.start();
        System.out.println("Server started at http://localhost:" + port);
    }

    static class StaticHandler implements HttpHandler {
        private final String resourcePath;
        public StaticHandler(String resourcePath) {
            this.resourcePath = resourcePath;
        }
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try (InputStream is = HttpServerApp.class.getResourceAsStream(resourcePath)) {
                if (is == null) {
                    byte[] notFound = "Not Found".getBytes();
                    exchange.sendResponseHeaders(404, notFound.length);
                    try (OutputStream os = exchange.getResponseBody()) { os.write(notFound); }
                    return;
                }
                byte[] body = is.readAllBytes();
                exchange.getResponseHeaders().add("Content-Type", "text/html; charset=utf-8");
                exchange.sendResponseHeaders(200, body.length);
                try (OutputStream os = exchange.getResponseBody()) { os.write(body); }
            }
        }
    }

    static class ClasspathStaticHandler implements HttpHandler {
        private final String basePath;
        public ClasspathStaticHandler(String basePath) { this.basePath = basePath; }
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            String rel = path.substring("/static".length());
            if (rel.isEmpty() || rel.equals("/")) rel = "/index.html";
            String resource = basePath + rel;
            try (InputStream is = HttpServerApp.class.getResourceAsStream(resource)) {
                if (is == null) {
                    byte[] notFound = "Not Found".getBytes();
                    exchange.sendResponseHeaders(404, notFound.length);
                    try (OutputStream os = exchange.getResponseBody()) { os.write(notFound); }
                    return;
                }
                byte[] body = is.readAllBytes();
                String contentType = resource.endsWith(".html") ? "text/html; charset=utf-8" : "application/octet-stream";
                exchange.getResponseHeaders().add("Content-Type", contentType);
                exchange.sendResponseHeaders(200, body.length);
                try (OutputStream os = exchange.getResponseBody()) { os.write(body); }
            }
        }
    }
}
