import devFlix.Filme;
import devFlix.Serie;

public class App {
    public static void main(String[] args) throws Exception {

    Serie serie = new Serie("La casa de papel", 4, 8);
    
    serie.assistido();
    serie.assistido();
    serie.assistido();
    serie.assistido();
    serie.assistido();
    serie.assistido();
    serie.assistido();

    serie.setLegenda("Off");
    System.out.println(serie);
    


    }
}
