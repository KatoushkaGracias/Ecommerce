package com.test.ecommerce.ecommerce.service;


import com.test.ecommerce.ecommerce.model.Category;
import com.test.ecommerce.ecommerce.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;
    public void createCategory(Category category){
        categoryRepo.save(category);
    }
}
