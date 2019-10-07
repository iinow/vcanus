export class Recipe {
    constructor(builder?: RecipeBuilder){
        if(builder){
            this.flour = builder.getFlour()
            this.water = builder.getWater()
            this.cream = builder.getCream()
            this.sugar = builder.getSugar()
            this.butter = builder.getButter()
        }
    }

    private _flour: number
    get flour() {return this._flour}
    set flour(_flour: number) {this._flour = _flour} 

    private _water: number
    get water() {return this._water}
    set water(_water: number) {this._water = _water} 

    private _cream: number
    get cream() {return this._cream}
    set cream(_cream: number) {this._cream = _cream} 

    private _sugar: number
    get sugar() {return this._sugar}
    set sugar(_sugar: number) {this._sugar = _sugar} 

    private _butter: number
    get butter() {return this._butter}
    set butter(_butter: number) {this._butter = _butter} 

    public toString(){
        let res = "flour: "+this.flour + "\r\n" +
        "water: "+this.water + "\r\n";
        if(this.cream){
            res += "cream: "+this.cream + "\r\n";
        }
        if(this.sugar){
            res += "sugar: "+this.sugar + "\r\n";
        }
        if(this.butter){
            res += "butter: "+this.butter + "\r\n";
        }
        return res
    }
}

export class RecipeBuilder {
    constructor(){}
    private _flour: number
    public getFlour() {
        return this._flour
    }
    public setFlour(_flour: number) {
        this._flour = _flour
        return this
    } 

    private _water: number
    public getWater() {
        return this._water
    }
    public setWater(_water: number) {
        this._water = _water
        return this
    } 

    private _cream: number
    public getCream() {
        return this._cream
    }
    public setCream(_cream: number) {
        this._cream = _cream
        return this
    } 

    private _sugar: number
    public getSugar() {
        return this._sugar
    }
    public setSugar(_sugar: number) {
        this._sugar = _sugar
        return this
    } 

    private _butter: number
    public getButter() {
        return this._butter
    }
    public setButter(_butter: number) {
        this._butter = _butter
        return this
    } 

    public build(){
        return new Recipe(this)
    }
}