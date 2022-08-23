package com.itheima.service.Impl;

import com.itheima.controller.Code;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    public boolean update(Book book) {
       return bookDao.update(book)>0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
        /*
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"�벻Ҫʹ����ļ�����ս�ҵ�����");
        }
        try{
            int i =1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"���������ʳ�ʱ�������ԣ�",e);
        }
        */
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Book getByName(String name) {
        return bookDao.getByName(name);
    }
}
