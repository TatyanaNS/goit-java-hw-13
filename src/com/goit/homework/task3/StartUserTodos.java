package com.goit.homework.task3;

public class StartUserTodos {

  private static final String
      USER_TODOS_URL = "https://jsonplaceholder.typicode.com/users/1/todos?completed=false";

  public static void main(String[] args) throws Exception {

  /*
    Задание 3

    Дополните программу методом, который будет выводить все открытые задачи для пользователя Х.
    https://jsonplaceholder.typicode.com/users/1/todos. Открытыми считаются все задачи,
    у которых completed = false.
  */

    UserTodos userTodos = new UserTodos();
    userTodos.getUsersTodos(USER_TODOS_URL);
  }
}