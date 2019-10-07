import { Recipe } from './Recipe'

export class Bread {
    constructor(builder?: BreadBuilder){
        if(builder){
            this.breadType = builder.getBreadType()
            this.recipe = builder.getRecipe()
        }
    }

    private _breadType: string
    get breadType() {return this._breadType}
    set breadType(_breadType: string) {this._breadType = _breadType}

    private _recipe = new Recipe()
    get recipe() {return this._recipe}
    set recipe(_recipe: Recipe) {this._recipe = _recipe}
    
    public toString() {
        return "breadType: "+ this.breadType + "\r\n" +"recipe"+"\r\n"+this.recipe.toString();
    }
}

export class BreadBuilder {
    constructor(){}

    private _breadType: string
    public getBreadType() {
        return this._breadType
    }
    public setBreadType(_breadType: string) {
        this._breadType = _breadType
        return this
    }

    private _recipe = new Recipe()
    public getRecipe() {
        return this._recipe
    }
    public setRecipe(_recipe: Recipe) {
        this._recipe = _recipe
        return this
    }

    public build(): Bread {
        return new Bread(this)
    }
}