import { Bread, BreadBuilder } from './Bread'
import { Recipe, RecipeBuilder } from './Recipe'
import data from '../data.json'

let list = data.map(bread => {
    let recipe = new RecipeBuilder()
        .setFlour(bread.recipe.flour)
        .setWater(bread.recipe.water)
        .setSugar(bread.recipe.sugar)
        .setCream(bread.recipe.cream)
        .setButter(bread.recipe.butter)
        .build()

    let b = new BreadBuilder()
        .setBreadType(bread.breadType)
        .setRecipe(recipe)
        .build()
    return b
})

list.forEach(v => {
    console.log(v.toString())
})