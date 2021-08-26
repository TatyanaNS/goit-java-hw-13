package com.goit.homework.task1;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;

class WorkWithAPI {


  public void addUser(String uri) throws Exception {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .header("Content-Type", "application/json")
        .POST(BodyPublishers.ofFile(Path.of("user.json")))
        .build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    System.out.println("POST response code: " + response.statusCode());
    System.out.println(response.body());
  }

  public void updateUser(String uri) throws Exception {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .header("Content-Type", "application/json")
        .PUT(BodyPublishers.ofFile(Path.of("update_user.json")))
        .build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    System.out.println("PUT response code: " + response.statusCode());
    System.out.println(response.body());
  }

  public void deleteUser(String uri) throws Exception {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .DELETE()
        .build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    System.out.println("DELETE response code: " + response.statusCode());
    System.out.println(response.body());
  }

  public void getUsers(String uri) throws Exception {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .GET()
        .build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    System.out.println("GET response code: " + response.statusCode());
    System.out.println(response.body());
  }

}