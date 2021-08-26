package com.goit.homework.task2;

public class StartMaxUserComments {

  public static void main(String[] args) throws Exception {

  /*
    Задание 2

    Дополните программу методом, который будет выводить все комментарии к последнему посту
    определенного пользователя и записывать их в файл. https://jsonplaceholder.typicode.com/users/1/posts
    Последним будем считать пост с наибольшим id. https://jsonplaceholder.typicode.com/posts/10/comments
    Файл должен называться "user-X-post-Y-comments.json", где Х - номер пользователя, Y - номер поста.
  */
    MaxUserComments apiWrite = new MaxUserComments();
    apiWrite.getUserComment(7);
  }
}