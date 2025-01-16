class AgeModel{
    constructor(){
        this.currentYear = new Date().getFullYear;
    }

    calculateAge(birthYear){
        return this.currentYear - birthYear;
    }
}