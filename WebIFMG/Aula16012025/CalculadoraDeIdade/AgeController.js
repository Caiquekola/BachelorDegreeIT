class AgeController{
    constructor(model,view){
        this.model = model;
        this.view = view;
        this.view.bindCalculateAge(this.handleCalculateAge);
    }
    handleCalculateAge = (birthYear) =>{
        if(!isNaN(birthYear)){
            const age  = this.model.bindCalculateAge(birthYear);
            this.view.updateAgeResult(age);
        }else{
            this.view.updateAgeResult("Por favor, insira um ano válido!")
        }
    };
}

const app = new AgeController(new AgeModel(), new AgeView());