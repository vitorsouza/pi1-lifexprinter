package br.ufes.inf.labes;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class LifexService {
  public List<LifexData> retrieveLifexData(String fileName, int yearOfInterest, boolean male) throws IOException {
    List<LifexData> list = new ArrayList<>();

    Reader in = new FileReader(fileName);
    Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
    for (CSVRecord record : records) {
      int year = Integer.parseInt(record.get(2));

      if (year == yearOfInterest) {
        String country = record.get(0);
        double lifexMale = Double.parseDouble(record.get(3));
        double lifexFemale = Double.parseDouble(record.get(4));

        LifexData data = new LifexData(country, year, lifexMale, lifexFemale);
        list.add(data);
      }
    }

    Collections.sort(list, new LifexData.LifexDataComparatorByMaleDesc());
    return list;
  }
}
