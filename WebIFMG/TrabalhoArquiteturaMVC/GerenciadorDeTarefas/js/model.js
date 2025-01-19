class GerenciadorTarefas {
    constructor() {
        this.tarefas = [];
    }

    adicionar(tarefa) {
        if(tarefa.descricao != ''){
            this.tarefas.unshift(tarefa);
        }
    }

    marcaComoConcluida(index) {
        const tarefa = this.tarefas[index];
        tarefa.status = tarefa.status === 'pendente' ? 'concluida' : 'pendente';
        if(tarefa.status === 'concluida'){
            this.excluir(index);
            this.tarefas.push(tarefa);
        }
    }

    excluir(index) {
        this.tarefas.splice(index, 1);
    }

    getTarefas() {
        return this.tarefas;
    }
}
