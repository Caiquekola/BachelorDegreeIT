class GerenciadorTarefasController {
    constructor(view, model) {
        this.view = view;
        this.model = model;

        this.view.listaTarefas.addEventListener('click', (evento) => {
            const index = evento.target.dataset.index;
            if (evento.target.type === 'checkbox' ) {
                this.model.marcaComoConcluida(index);
                this.updateView();
            }
        });

        this.view.novaTarefa.addEventListener('click', () => {
            const tarefa = { descricao: this.view.inputTarefa.value, status: 'pendente' };
            this.model.adicionar(tarefa);
            this.updateView();
            this.view.inputTarefa.value = '';
        });

        this.view.novaTarefa.addEventListener('keydown', (event) => {
            if (event.keyCode === 13) {
                const tarefa = { descricao: this.view.inputTarefa.value, status: 'pendente' };
                this.model.adicionar(tarefa);
                this.updateView();
                this.view.inputTarefa.value = '';
            }
        });
    }

    updateView() {
        this.view.mostrarTarefas(this.model.getTarefas());
    }
}

const model = new GerenciadorTarefas();
const view = new GerenciadorTarefasView();
const controller = new GerenciadorTarefasController(view, model);