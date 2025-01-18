class GerenciadorTarefas {
    constructor() {
        this.tarefas = [{ descricao: 'Estudar JS', status: 'pendente' }];
    }

    adicionar(tarefa) {
        this.tarefas.push(tarefa);
    }

    marcaComoConcluida(index) {
        const tarefa = this.tarefas[index];
        tarefa.status = tarefa.status === 'pendente' ? 'concluida' : 'pendente';
    }

    excluir(index) {
        this.tarefas.splice(index, 1);
    }

    getTarefas() {
        return this.tarefas;
    }
}