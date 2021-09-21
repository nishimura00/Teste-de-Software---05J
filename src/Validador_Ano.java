public class Validador_Ano {
    public String classificadorAno(int ano) {
        if (ano >= 1900 && ano <= 2020){
            return "válida";
        }
        else{
            return "inválida";
        }
    }

    public String classificadorNota(int nota) {
        if (nota >= 0 && nota <= 10){
            return "válida";
        }
        return "inválida";
    }


    public int classificadorIdade(int idade) {
        if (idade<50){
            return 10;
        }
        else if (idade>=50 && idade <= 70){
            return 5;
        }
        else if (idade>=70){
            return 3;
        }
        return -1;
    }
}
