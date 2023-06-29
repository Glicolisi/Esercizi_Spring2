package com.eserzizi2.esercizi2.service;

import com.eserzizi2.esercizi2.dao.MealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MealService {
    private MealDao mealDao;

    @Autowired
    public MealService(MealDao mealDao){
        this.mealDao=mealDao;
    }
public void addMeal (Meal meal) {
    mealDao.addMeal(meal);
        }

public void updateMeal (Meal meal) {
    mealDao.updateMeal(meal);
        }


public void deleteMeal (String mealname) {
    mealDao.deleteMeal(mealname);
        }

public List<Meal> getMeals(){
    return mealDao.getMeals();
        }

}
