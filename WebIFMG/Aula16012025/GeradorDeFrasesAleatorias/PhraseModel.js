class PhraseModel {
    constructor() {
      this.phrases = [
        "A persistência é o caminho do êxito.",
        "Acredite nos seus sonhos e eles se realizarão.",
        "A vida é uma aventura ousada ou nada.",
      ];
    }
    getRandomPhrase() {
      const randomIndex = Math.floor(Math.random() * this.phrases.length);
      return this.phrases[randomIndex];
    }
  }
  
  