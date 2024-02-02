package Seminar_4;

public interface UserControler<T extends User> {
   
    public void  create(String firstName, String secondName, String lastName);
    
}