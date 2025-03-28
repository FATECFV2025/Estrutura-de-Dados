let pilha_pratos = []

//adicionar  elementos
pilha_pratos.push("Prato Azul")
pilha_pratos.push("Prato Laranja")
pilha_pratos.push("Prato Vermelho")

console.log(pilha_pratos)

//topo da pilha
console.log(pilha_pratos[pilha_pratos.length-1])

//tamanho da pilha
console.log(pilha_pratos.length)

//verificar pilha vazia
console.log(pilha_pratos.length == 0)
livros = []
console.log(livros.length == 0)

//remover elementos
let removido = pilha_pratos.pop();

console.log(removido)
console.log(pilha_pratos)

// DEFINIÇÃO DE VARIAVEIS

function teste_var() {
    var x = 5;
    if (x > 0) {
        // console.log(x)
        var y = 10;
    }
    // console.log(y)
    // console.log(x) //era esperado o valor 5
}

function teste_let() {
    let x = 5;
    if (x > 0) {
        let x = 10;
        let y = 10;
        console.log(x)
    }
    // console.log(y)
    console.log(x)
}

function teste_const() {
    const x = 5;
    if (x > 0) {
        const x = 10;
        const y = 10;
        y = 5;
        console.log(x)
        console.log(y)
    }
    // console.log(y)
    console.log(x)
}

// teste_var()
// teste_let()
// teste_const()