package Hibernate.Dao;

import java.util.List;

public interface CRUDdao<T,ID> extends SuperDAO {

    public boolean add(T dto)throws Exception;
    public boolean update(T dto)throws Exception;
    public boolean delete(ID id)throws Exception;
    public T search(ID id) throws Exception;
    public List<T> getAll()throws Exception;

}
