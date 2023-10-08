package Rules;

public class Rules extends Pessoa {
    
    public void PessoaFisica(){
        Double result;
        if(getAnualIncome() < 200000){
            result = getAnualIncome() + (getAnualIncome() * 100) / 15;
        } else if(getAnualIncome() )
    }
}
