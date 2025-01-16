class PhraseView {
    constructor() {
      this.phraseDisplay = document.getElementById("phrase-display");
      this.generateButton = document.getElementById("generate-phrase");
    }
    updatePhrase(phrase) {
      this.phraseDisplay.textContent = phrase;
    }
    bindGeneratePhrase(handler) {
      this.generateButton.addEventListener("click", handler);
    }
  }