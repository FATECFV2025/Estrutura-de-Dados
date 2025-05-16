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

let fila_priori = [
    {modelo: "Uno", prioridade: 2},
    {modelo: "Gol", prioridade: 2},
    {modelo: "Ambulancia", prioridade: 1},
    {modelo: "Policia", prioridade: 1},
]

fila_priori.sort((carro_a,carro_b)=> carro_a.prioridade - carro_b.prioridade )

console.log(fila_priori)
//carro a vem antes do carro b
// carro b vem antes do carro a
// se estão na mesma prioridade