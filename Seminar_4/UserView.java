package Seminar_4;

import java.util.List;

public interface UserView<T extends User> {
  public void sendOnConcole(List<T> list);  
}