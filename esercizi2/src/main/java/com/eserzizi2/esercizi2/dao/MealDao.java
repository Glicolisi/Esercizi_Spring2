package com.eserzizi2.esercizi2.dao;

import com.eserzizi2.esercizi2.service.Meal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MealDao {
    private List<Meal> meals = new ArrayList<>();

    public Meal addMeal (Meal meal) {
        this.meals.add(meal);
        return meal;
    }

    public void updateMeal (Meal meal) {
       this.meals.removeIf(m->m.getName().equals(meal.getName()));
       this.meals.add(meal);
        }


    public void deleteMeal (String mealName) {
        this.meals.removeIf(m->m.getName().equals(mealName));
    }

    public  List<Meal> getMeals(){
        return this.meals;
    }
}
