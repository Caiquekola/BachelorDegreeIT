class PhraseController {
    constructor(model, view) {
      this.model = model;
      this.view = view;
      this.view.bindGeneratePhrase(this.handleGeneratePhrase);
    }
    handleGeneratePhrase = () => {
      const randomPhrase = this.model.getRandomPhrase();
      this.view.updatePhrase(randomPhrase);
    };
  }
  // Inicialização
  const app = new PhraseController(new PhraseModel(), new PhraseView());