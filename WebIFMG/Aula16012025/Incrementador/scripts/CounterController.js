export class CounterController {
    constructor(model, view) {
      this.model = model;
      this.view = view;
      this.view.bindEvents(this);
      this.view.updateCounter(this.model.value);
    }
  
    handleIncrement = () => {
      this.model.increment();
      this.view.updateCounter(this.model.value);
    };
    handleDecrement = () => {
      this.model.decrement();
      this.view.updateCounter(this.model.value);
    };
  
    handleReset = () => {
      this.model.reset();
      this.view.updateCounter(this.model.value);
    };
  }