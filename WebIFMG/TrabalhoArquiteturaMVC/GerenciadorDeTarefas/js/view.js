class GerenciadorTarefasView {
    constructor() {
        this.inputTarefa = document.getElementById("desc");
        this.listaTarefas = document.getElementById("lista");
        this.novaTarefa = document.getElementById("btn");
    }

    mostrarTarefas(tarefas) {
        this.listaTarefas.innerHTML = '';
        tarefas.forEach((tarefa, index) => {
            let li = document.createElement('li');
            li.textContent = tarefa.descricao;
            if (tarefa.status === 'concluida') {
                li.classList.add('concluida');
            }
            const checkboxConcluir = document.createElement('input');
            checkboxConcluir.type = 'checkbox';
            checkboxConcluir.dataset.index = index;
            checkboxConcluir.checked = tarefa.status === 'concluida';

            li.appendChild(checkboxConcluir);
            this.listaTarefas.appendChild(li);
        });
    }
}