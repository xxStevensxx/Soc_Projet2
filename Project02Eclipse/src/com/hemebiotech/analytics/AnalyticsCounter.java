package com.hemebiotech.analytics;

import java.io.FileWriter;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		OutSymptoms sortiEcran = new OutSymptoms();
			 sortiEcran.countSymptoms();
			 sortiEcran.triMap();

			// next generate output
			FileWriter writer = new FileWriter ("result.out");

				writer.write(String.valueOf(sortiEcran.listSymptoms));
				writer.close();
		}

}