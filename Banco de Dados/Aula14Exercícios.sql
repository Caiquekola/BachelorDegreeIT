-- Aula 14 
SELECT nacionalidade FROM aluno;
select distinct(nacionalidade) as "Nacionalidades distintas" from aluno;
select count(id) from aluno;
select count(idcurso) as "Qtd cursos carga maior que 30" from curso where carga > 30;
select max(peso) from aluno;
select min(peso) from aluno;
select format(avg(peso),2) from aluno;
select sum(carga) from curso;
select min(totaulas) from curso where ano = "2018";
select sum(peso)
from aluno
where nacionalidade = "Irlanda";
select nome from curso where carga > (select avg(carga) from curso);

SELECT nome, DAY(nascimento) as "Dia", MONTH(nascimento) AS "Mês", year(nascimento) as "Ano"
FROM aluno order by NOME;

SELECT nome, nascimento, (YEAR(CURRENT_DATE())-
YEAR(nascimento)) AS idade
FROM aluno
ORDER BY nome;

-- Exercícios
-- 1. Criar uma lista em ordem alfabética com o nome de todas as alunas
SELECT nome
FROM aluno
ORDER BY nome ASC;

-- 2. Criar uma lista com os dados de todos os alunos que nasceram entre 01/01/2000 e 31/12/2015;
SELECT * FROM aluno WHERE nascimento BETWEEN "2000/01/01" and "2015/12/31";

-- 3. Listar todos os alunos (homens) que trabalham como programador;
SELECT * FROM aluno;
SELECT * FROM aluno WHERE sexo = 'M' AND profissao = "Programador";

-- 4. LISTAR TODOS OS DADOS DAS ALUNAS (MULHERES) QUE NASCERAM NO BRASIL E QUE TEM SEU NOME INICIADO COM A LETRA J
SELECT * FROM aluno WHERE sexo = 'F' AND nacionalidade = "Brasil" and nome like "A%";

-- 5. CRIAR UMA LISTA COM O NOME E NACIONALIDADE DE TODOS OS ALUNOS (HOMENS) QUE TÊM SILVA NO NOME
--    NÃO NASCERAM NO BRASIL E PESAM MENOS DE 100KG

SELECT nome, nacionalidade FROM aluno
WHERE sexo = "M" AND NOME LIKE "%Silva%" and nacionalidade != "Brasil" and peso < 100;

-- 6. Qual é a maior altura entre os aluno (homens) que moram no Brasil

SELECT max(altura) FROM aluno
WHERE sexo = "M"  and nacionalidade = "Brasil";

-- 7. Qual o menor peso cadastrado entre as alunas que nasceram fora do Brasil
--  e entre 01/01/1990 e 31/12/2000
	SELECT min(peso) from aluno
    where sexo = "F" and nacionalidade != "Brasil" and nascimento between "1990-01-01" and "2000/12/31";
    
-- 8. Quantas alunas têm mais de 1.90 de altura

	SELECT COUNT(*) FROM aluno WHERE altura > 1.90;
    
-- 9. Quantas nacionallidades diferentes há cadastradas na base?

	SELECT COUNT(DISTINCT(nacionalidade)) AS NACIONALIDADES FROM aluno;
    

-- Agrupamento e agregando - Exercícios

select carga, count(carga) as "Quantidades de Cargas" from curso group by carga;

-- 1. LISTA COM AS PROFISSÕES DOS ALUNOS E SEUS RESPECTIVOS QUANTITATIVOS

SELECT profissao, count(profissao) FROM aluno 
group by profissao order by count(profissao);

-- 2. Quantos alunos homens e mulheres que nasceram após 01/01/2005;

SELECT sexo, count(sexo) from aluno group by sexo having nascimento > "2005-01-01";

-- 3. Montar uma lista dos alunos que nasceram fora do Brasil, mostrando país
de origem e total de pessoas nascidas la. Só nos interessa os países que
tiverem mais de 3 alunos com essa nacionalidade





 








