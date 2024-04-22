package BBIT_OOP2.CATII.Abstract;

// Interface IManageable
public interface IManageable {
    void add(Person person);
    void remove(String ID);
    void update(String ID, Person updatedPerson);
}
