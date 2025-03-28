let matriz = [
    [1, 2],
    [3, 4],
    [5, 6]
]

console.log(matriz)



console.log(matriz)

// acesso percorrido 
for(let linha=0; linha<matriz.length;linha++){
    for(let col=0; col<matriz[linha].length;col++){
        console.log(matriz[linha][col]) 
    
    }
}

//acesso direto (ou posicional)
//exibir um valor
console.log(matriz[2][0])

//adicionar uma nova linhas com colunas
matriz.push(['Ana','Pedro'])

// alterar o conteúdo de uma determinada linha e coluna (existente)
matriz[2][0] = 'Bruno'
// matriz[4][0] = 'Vinicius'  esta com erro, pois a linha não existe ainda
console.log(matriz)




