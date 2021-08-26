package com.goit.homework.task3;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;

class UserTodos {

  public void getUsersTodos(String uri) throws Exception {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .GET()
        .build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    client.send(request, BodyHandlers.ofFile(Path.of("users_todos.json")));
    System.out.println("GET response code: " + response.statusCode());
    System.out.println(response.body());
  }
}