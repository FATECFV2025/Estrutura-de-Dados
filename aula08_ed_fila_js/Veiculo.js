
//Criand uma classe
class Veiculo {
   
    //Criando um construtor -> definir as variaveis/atributos da classe
    constructor(marca, modelo, ano){
        this.marca=marca
        this.modelo=modelo
        this.ano=ano
    }
    //é um método
    get exibirDados() {
        return  `${this.marca}- ${this.modelo}/${this.ano}`;
        // retornando um Texto
    }

   

    //é método público para obter dados da classe
  

}
export {Veiculo}




