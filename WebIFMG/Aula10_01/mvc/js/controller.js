class TaskController {
    constructor(model, view) {
        this.model = model;
        this.view = view;
        this.view.bindAddTask(this.handleAddTask);
        this.view.bindDeleteTask(this.handleDeleteTask);
        this.updateView();
    }
    handleAddTask = (task) => {
        this.model.addTask(task);
        this.updateView();
    };
    handleDeleteTask = (index) => {
        this.model.removeTask(index);
        this.updateView();
    };
    updateView() {
        this.view.renderTasks(this.model.getTasks());
    }
}
const controller = new TaskController(model, view);