import { CounterController } from "./CounterController.js";
import { CounterModel } from "./CounterModel.js";
import { CounterView } from "./CounterView.js";

const modelInstance = new CounterModel();
const modelView = new CounterView();
const app = new CounterController(modelInstance,modelView);