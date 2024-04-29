const valorSalario = parse.Float(gets());
const valorBeneficio = parse.Float(gets());

const valorImposto = calcularImposto(valorSalario);
const saida = valorSalario-valorImposto+valorBeneficio;

print(saida.toFixed(2));

function calcularImposto(salario){
    let aliquota;
    if(salario>0&salario<=1100){
        aliquota=0.05;
    }else if(salario>1100&salario<=2500){
        aliquota=0.10;
    }else if(salario>2500){
        aliquota=0.15;
    }
    return salario*aliquota;
}
