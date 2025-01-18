class TaskModel {
    constructor() {
        this.tasks = [];
    }
    addTask(task) {
        this.tasks.push(task);
    }
    removeTask(index) {
        this.tasks.splice(index, 1);
    }
    getTasks() {
        return this.tasks;
    }
}
const model = new TaskModel();