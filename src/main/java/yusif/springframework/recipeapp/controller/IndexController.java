package yusif.springframework.recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import yusif.springframework.recipeapp.model.Category;
import yusif.springframework.recipeapp.model.UnitOfMeasure;
import yusif.springframework.recipeapp.repositories.CategoryRepository;
import yusif.springframework.recipeapp.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;


    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional =  unitOfMeasureRepository.findByDescription("Teadpoon");

        System.out.println("Category Id is : " + categoryOptional.get().getId());
        System.out.println("UDM Id is : " + unitOfMeasureOptional.get().getId());

        return "index";
    }

}
