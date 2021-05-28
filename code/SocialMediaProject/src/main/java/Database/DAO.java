package Database;

public interface DAO<T> {
    void add(T t);
    void edit(T t);
    void delete(T t);


}
