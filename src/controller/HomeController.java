package controller;

import view.View;

public class HomeController {

  public void edit() {

    try {
      View.deleteItem();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
