-- 1. Exiba a placa e o nome dos donos de todos os veículos.

select v.placa as "Placa", c.nome as "Nome completo" from veiculo as v inner join cliente as c on v.cliente_cpf = c.cpf;

-- 2. Exiba o CPF e o nome do cliente que possui o veículo de placa “JJJ-2020”

select c.cpf as "CPF" , c.nome "Nome" from cliente as c inner join veiculo as v on c.cpf = v.cliente_cpf;

-- 3. Exiba a placa e a cor dos veículos que estão estacionados no patio de número 1.

select v.placa as "Placa do veículo" , v.cor "Cor do veículo"
from veiculo as v
inner join estaciona as e
on v.placa = e.veiculo_placa;

-- 4. Exiba o endereço, a data de entrada e de saída dos estacionamentos do veículo de placa
-- “JEG-1010”.

select patio.ender, estaciona.dtEntrada, estaciona.dtSaida 
from estaciona 
inner join patio
on patio_num = estaciona.patio_num
where estaciona.veiculo_placa = 'JEG-1010';

-- 5. Exiba a quantidade de vezes que os veículos de cor branco estacionaram.

select count(veiculo.cor) 
from veiculo
group by veiculo.cor 
having veiculo.cor = 'Branco';

-- 6. Liste todos os clientes que possuem carro de modelo 1.

select * 
from cliente 
inner join veiculo 
on veiculo.cliente_cpf = cliente.cpf
where veiculo.modelo_codMod = '1';

-- 7. Exiba o nome dos clientes que estacionaram veículos no pátio 2.

select distinct(nome)
from cliente
inner join veiculo
on veiculo.cliente_cpf = cliente.cpf
inner join estaciona
on estaciona.veiculo_placa = veiculo.placa
where estaciona.patio_num = '2';

-- 8. Exiba a placa, o nome dos donos e a descrição dos os modelos de todos os veículos.

select veiculo.placa, cliente.nome, modelo.desc_2 
from veiculo
inner join cliente
on cliente.cpf = veiculo.cliente_cpf
inner join modelo
on modelo.codMod = veiculo.modelo_codMod order by desc_2;

-- 9. Sobre os carros de modelo corola ou HB20 deseja saber: Nome do cliente/proprietário,
-- placa, data de entrada e data de saída, o número do pátio e seu endereço.

select cliente.nome, estaciona.veiculo_placa, estaciona.dtEntrada, estaciona.dtSaida, modelo.desc_2
from modelo
inner join veiculo
on modelo.codMod = veiculo.modelo_codMod
inner join cliente
on cliente.cpf = veiculo.cliente_cpf
inner join estaciona
on estaciona.veiculo_placa = veiculo.placa
where modelo.desc_2 = 'HB20';

-- 10. Exiba o CPF, nome do cliente que possui o veículo cujo código do
-- estacionamento(estaciona) é 3

-- Aprendi uma nova forma de escrever os comandos e ficar mais legível

select 
	cliente.cpf, cliente.nome
from cliente
inner join
	veiculo on cliente.cpf = veiculo.cliente_cpf
inner join 
	estaciona on veiculo.placa = estaciona.veiculo_placa
where estaciona.cod = '3';