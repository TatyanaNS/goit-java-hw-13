package com.goit.homework.task2;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MaxUserComments {

  public Long getUserMaxComments(Integer userID) throws Exception {
    String uri = "https://jsonplaceholder.typicode.com/users/" + userID + "/posts";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .GET()
        .build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    String userPosts = response.body();
//    System.out.println("GET response code: " + response.statusCode());

  Gson gson = new Gson();

  PostsObject postsObject = gson.fromJson(userPosts, PostsObject.class);
  List<Posts> posts = new ArrayList<>(postsObject);
  List<Long> id = posts.stream()
      .max(Comparator.comparing(Posts::getId))
      .stream()
      .map(Posts::getId)
      .collect(Collectors.toList());

    return id.get(0);
  }

  public void getUserComment(Integer userID) throws Exception {
    String uri = "https://jsonplaceholder.typicode.com/posts/" +
        getUserMaxComments(userID) + "/comments";
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .GET()
        .build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    client.send(request, BodyHandlers.ofFile(Path.of("user-" + userID + "-post-" + getUserMaxComments(userID) + "-comments.json")));
    System.out.println("GET response code: " + response.statusCode());
    System.out.println(response.body());
  }
}