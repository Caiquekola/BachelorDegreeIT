export class CounterView {
    constructor() {
        this.counterValue = document.getElementById("counter-value");
        this.incrementButton = document.getElementById("increment");
        this.decrementButton = document.getElementById("decrement");
        this.resetButton = document.getElementById("reset");
    }

    updateCounter(value) {
        this.counterValue.textContent = value;
    }

    bindEvents(controller) {
        this.incrementButton.addEventListener('click', controller.handleIncrement);
        this.decrementButton.addEventListener("click", controller.handleDecrement);
        this.resetButton.addEventListener("click", controller.handleReset);
    }
}