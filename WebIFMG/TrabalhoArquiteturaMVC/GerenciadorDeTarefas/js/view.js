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

            const btn_excluir = document.createElement('button');
            const icon = document.createElement('i');
            icon.classList.add('fas', 'fa-trash-alt');
            btn_excluir.appendChild(icon);
            btn_excluir.dataset.index = index;

            li.appendChild(checkboxConcluir);
            li.appendChild(btn_excluir);
            this.listaTarefas.appendChild(li);
        });
    }
}
