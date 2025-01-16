class AgeView {
    constructor() {
      this.birthYearInput = document.getElementById("birth-year");
      this.calculateButton = document.getElementById("calculate-age");
      this.ageResult = document.getElementById("age-result");
    }
  
    updateAgeResult(age) {
      this.ageResult.textContent = `Sua idade é: ${age} anos.`;
    }
  
    bindCalculateAge(handler) {
      this.calculateButton.addEventListener("click", () => {
        const birthYear = parseInt(this.birthYearInput.value, 10);
        handler(birthYear);
      });
    }
  }
  