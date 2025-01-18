class VotingController {
    constructor(model, view) {
      this.model = model;
      this.view = view;
  
      this.view.candidateList.addEventListener("click", (e) => {
        const index = e.target.dataset.index;
        if (e.target.textContent === "Votar") {
          this.model.addVote(index);
        } else if (e.target.textContent === "Remover") {
          this.model.removeCandidate(index);
        }else if (e.target.textContent === "Retirar Voto"){
        this.model.removeVote(index);
        }
        this.updateView();
      });
      
      this.view.newCandidateButton.addEventListener("click",(e)=>{
        const name = this.view.candidateName.value;
        this.model.addCandidate(name);
        console.log(name);
        this.updateView();
        });

      this.updateView();
    }
    
    

    updateView() {
      this.view.displayCandidates(this.model.getCandidates());
    }
  }