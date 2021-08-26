package com.goit.homework.task2;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

class Posts implements Serializable {

  @SerializedName("userId")
  private Long userId;

  @SerializedName("id")
  private Long id;

  @SerializedName("title")
  private String title;

  @SerializedName("body")
  private String body;


  public Long getId() {
    return id;
  }

}