package RulesAndData;

public class Rules extends Data{

    public double individual(){
        double result = 0.0;
        if(getAnualIncome() <= 20000 && getHealthExpenditures() > 0){
            result = getAnualIncome() + ((getAnualIncome() / 100) * 15) + getHealthExpenditures()/2;
        } else if(getAnualIncome() > 20000 && getHealthExpenditures() > 0){
            result = getAnualIncome() + ((getAnualIncome() / 100) * 25) + getHealthExpenditures()/2;
        }
        return result;
    }

    public double company(){
        double recive = 0.0;
        if(getNumberOfEmp() <= 10){
            recive = getAnualIncome() + (getAnualIncome() / 100) * 14;
        } else{
            recive = getAnualIncome() + (getAnualIncome() / 100) * 16;
        }
        return recive;
    }
    
}
