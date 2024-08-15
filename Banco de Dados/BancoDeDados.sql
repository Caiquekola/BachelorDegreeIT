select nome, carga from curso where carga > (select avg(carga) from curso);

select nome from aluno where cursopreferido in (select idCurso from curso where carga > (select avg(carga) from curso));

select * from curso;

select nome as NOMES from aluno where cursopreferido in (select idCurso from curso where carga = (select max(carga) from curso));


select * from curso;

select min(carga) as 'Somas das Cargas' from curso;

select carga from curso group by carga;

select carga from curso;

select distinct carga from curso;

select carga, count(nome) as 'Quantidade de Cursos' from curso group by carga order by count(nome);

select nacionalidade, count(nome) as 'qtde'
from aluno
group by nacionalidade
having count(nome) >= 4
order by nacionalidade;

select cursopreferido, count(nome)
from aluno 
where nacionalidade = 'EUA'
group by cursopreferido ;


