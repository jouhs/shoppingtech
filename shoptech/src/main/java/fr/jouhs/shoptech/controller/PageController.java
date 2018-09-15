package fr.jouhs.shoptech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.jouhs.shoptechbackend.dao.CategoryDAO;
import fr.jouhs.shoptechbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO ;
	
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		
		//recuperer la liste de categories
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","A propos");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contactez nous");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/**
	 * 
	 * @return all products
	 */
	@RequestMapping(value= {"/show/all/products"})
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Tous les produits");
		
		//recuperer la liste de categories
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	/**
	 * 
	 * @return all products
	 */
	@RequestMapping(value= {"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		// categoryDAO to fetch a single category
		Category category = null;
		
		category = categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		
		// recuperer la liste de categories
		mv.addObject("categories", categoryDAO.list());
		
		// passing the single category object
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
	
/*	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value = "greeting", required = false) String greeting) {
		if(greeting == null)
			greeting = "hello there";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		
		return mv;
	}*/
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting") String greeting) {
		if(greeting == null)
			greeting = "hello there";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		
		return mv;
	}

}
