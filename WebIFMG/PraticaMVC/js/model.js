class VotingModel {
    constructor() {
      this.candidates = [
        { name: "Candidato 1", votes: 0 },
        { name: "Candidato 2", votes: 0 },
        { name: "Candidato 3", votes: 0 },
      ];
      this.incremento =4;

    }
    addCandidate(newCandidate){
        if(newCandidate===""){
            newCandidate= ""+this.incremento;
            this.incremento++;
        }
        this.candidates.push({name:"Candidato "+ newCandidate,votes:0});
    }

    addVote(index) {
      this.candidates[index].votes++;
    }
    
    removeVote(index){
        let candidate = this.candidates[index]
        if(candidate.votes>0){
            candidate.votes--;
        }

    }

    removeCandidate(index) {
      this.candidates.splice(index, 1);
    }
  
    getCandidates() {
      return this.candidates;
    }
  }