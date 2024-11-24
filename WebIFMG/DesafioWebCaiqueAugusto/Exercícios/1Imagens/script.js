// Seleciona todas as imagens dentro da galeria
const images = document.querySelectorAll('.imgs');

// Seleciona o infobox e o texto dentro dele
const infobox = document.getElementById('infobox');
const infoboxText = document.getElementById('infobox-text');
const closeInfoboxButton = document.getElementById('close-infobox');

// Adiciona o evento de clique para cada imagem
images.forEach(image => {
    image.addEventListener('click', () => {
        // Obtém a descrição da imagem a partir do atributo 'data-description'
        const description = image.getAttribute('data-description');

        // Exibe o infobox com a descrição
        infoboxText.textContent = description;
        infobox.style.display = 'block';
    });
});

// Fecha o infobox quando o botão de fechar for clicado
closeInfoboxButton.addEventListener('click', () => {
    infobox.style.display = 'none';
});