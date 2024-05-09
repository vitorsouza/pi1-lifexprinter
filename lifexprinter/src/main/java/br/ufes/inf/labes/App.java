package br.ufes.inf.labes;

import java.util.List;

/**
 * Para executar: mvn compile exec:java -Dexec.mainClass="br.ufes.inf.pi1.App"
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        int yearOfInterest = 2020;
        LifexService service = new LifexService();
        List<LifexData> list = service.retrieveLifexData("../female-and-male-life-expectancy-at-birth-in-years.csv", yearOfInterest, true);
        for (LifexData data : list) System.out.println(data);
    }
}
