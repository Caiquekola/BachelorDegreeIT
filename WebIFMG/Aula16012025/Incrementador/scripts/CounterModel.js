export class CounterModel {
    constructor() {
      this.value = 0;
    }
    increment() {
      this.value++;
    }
    decrement() {
      this.value--;
    }
    reset() {
      this.value = 0;
    }
}