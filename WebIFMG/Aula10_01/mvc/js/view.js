class TaskView {
    constructor() {
        this.taskList = document.getElementById('task-list');
        this.taskForm = document.getElementById('task-form');
        this.taskInput = document.getElementById('task-input');
    }
    renderTasks(tasks) {
        this.taskList.innerHTML = '';
        tasks.forEach((task, index) => {
            const li = document.createElement('li');
            const span = document.createElement('span');
            span.textContent = task;
            const button = document.createElement('button');
            button.textContent = 'Delete';
            button.addEventListener('click', () => this.onDelete(index));
            li.appendChild(span);
            li.appendChild(button);
            this.taskList.appendChild(li);
        });
    }
    bindAddTask(handler) {
        this.taskForm.addEventListener('submit', (e) => {
            e.preventDefault();
            if (this.taskInput.value) {
                handler(this.taskInput.value);
                this.taskInput.value = '';
            }
        });
    }
    bindDeleteTask(handler) {
        this.onDelete = handler;
    }
}
const view = new TaskView();