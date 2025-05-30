//CRIAR UMA FILA
let carro = []

//ADICIONANDO VEÍCULOS: FIFO
carro.push("Uno")
carro.push("Gol")
carro.push("Santana")

//Visualizar a Fila
console.log(carro)

//Remover da Fila
carro.shift()

console.log(carro)


//fila de prioridade 

// Seria uma classe
// Objeto anônimo, pois não pertence a nenhuma classe -> Cresce de maneira dinâmica


//Exemplo de objeto anônimo
let obj1= {modelo: "Uno", prioridade: 2}; 


//lista ou fila de objetos
let fila_priori = [
    {modelo: "Uno", prioridade: 3}, //obj
    {modelo: "Gol", prioridade: 3}, //obj
    {modelo: "Ambulancia", prioridade: 2}, //obj
    {modelo: "Policia", prioridade: 2}, //obj -> com atributos
]

// fila de prioridade
fila_priori.sort((carro_a,carro_b)=> carro_a.prioridade - carro_b.prioridade )

console.log(fila_priori)
//carro a vem antes do carro b
// carro b vem antes do carro a
// se estão na mesma prioridade