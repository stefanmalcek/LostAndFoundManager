/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pa165.services;

import cz.muni.fi.pa165.entities.Category;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Stefan Malcek
 */
@Service
public interface CategoryService {
	Category findById(Long id);
	List<Category> findAll();
	void create(Category category);
	void remove(Category c);
	Category findByName(String categoryName);
}
