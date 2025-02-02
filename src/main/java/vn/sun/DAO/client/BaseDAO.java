package vn.sun.DAO.client;

import java.io.Serializable;

public interface BaseDAO<PK, T> {

	void delete(T entity);

	T saveOrUpdate(T entity);

	T findById(Serializable key);

}
