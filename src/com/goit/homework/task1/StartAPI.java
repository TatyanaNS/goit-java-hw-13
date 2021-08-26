package com.goit.homework.task1;

public class StartAPI {

  private static final String USERS_URL = "https://jsonplaceholder.typicode.com/users";
  private static final String USERS_UPDATE_URL = "https://jsonplaceholder.typicode.com/users/7";
  private static final String USERS_DELETE_URL = "https://jsonplaceholder.typicode.com/users/4";
  private static final String GET_USER_URL = "https://jsonplaceholder.typicode.com/users/5";
  private static final String
      GET_USER_NAME_URL = "https://jsonplaceholder.typicode.com/users?username=Delphine";


  public static void main(String[] args) throws Exception {

  /*
    Задание 1

    Программа должна содержать методы для реализации следующего функционала:
    - создание нового объекта в https://jsonplaceholder.typicode.com/users.
      Возможно, вы не увидите обновлений на сайте. Метод создания работает правильно,
      если в ответ на JSON с объектом вернулся такой же JSON,
      но с полем id со значением на 1 больше, чем самый большой id на сайте.
  */

    WorkWithAPI workWithAPI = new WorkWithAPI();
    workWithAPI.addUser(USERS_URL);

  /*
      - обновление объекта в https://jsonplaceholder.typicode.com/users.
        Возможно, обновления не будут видны на сайте напрямую.
        Будем считать, что метод работает правильно,
        если в ответ на запрос придет обновленный JSON
        (он должен быть точно таким же, какой вы отправляли).
  */

    workWithAPI.updateUser(USERS_UPDATE_URL);

  /*
      - удаление объекта из https://jsonplaceholder.typicode.com/users.
        Здесь будем считать корректным результат - статус из группы 2хх в ответ на запрос.
  */

    workWithAPI.deleteUser(USERS_DELETE_URL);

  /*
     - получение информации обо всех пользователях https://jsonplaceholder.typicode.com/users
  */

    workWithAPI.getUsers(USERS_URL);

  /*
     - получение информации  о пользователе с определенным
       id https://jsonplaceholder.typicode.com/users/{id}
  */

    workWithAPI.getUsers(GET_USER_URL);

  /*
     - получение информации о пользователе с опредленным username
       - https://jsonplaceholder.typicode.com/users?username={username}
  */

    workWithAPI.getUsers(GET_USER_NAME_URL);

  }
}