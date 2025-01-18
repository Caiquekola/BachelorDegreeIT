class VotingView {
    constructor() {
      this.candidateList = document.getElementById("candidateList");
      this.newCandidateButton = document.getElementById("newCandidateButton");
      this.candidateName = document.getElementById("nameCandidate"); 
      this.addVoteButtons = [];
    }
  
    displayCandidates(candidates) {
      this.candidateList.innerHTML = "";
      candidates.forEach((candidate, index) => {
        const li = document.createElement("li");
        li.textContent = `${candidate.name} - Votos: ${candidate.votes}`;
        const voteButton = document.createElement("button");
        voteButton.textContent = "Votar";
        voteButton.dataset.index = index;
  
        const removeButton = document.createElement("button");
        removeButton.textContent = "Remover";
        removeButton.dataset.index = index;

        const removeVote = document.createElement("button");
        removeVote.textContent = "Retirar Voto";
        removeVote.dataset.index = index;


        li.appendChild(voteButton);
        li.appendChild(removeVote);
        li.appendChild(removeButton);
        this.candidateList.appendChild(li);
      });
    }
  }