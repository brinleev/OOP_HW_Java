package Seminar_4;

import java.util.List;

public interface UserService<T extends User> {

    public List<T> getAll();
    public void initData(List<T> list);
    public void create(String firstName, String secondname, String lastName);
}