package practice.hospital;

import java.util.Random;

import static java.lang.Math.*;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperatureData = new float[patientsCount];
        final float MAX_TEMP = 40.0F;
        final float MIN_TEMP = 32.0F;
        Random r = new Random();
        float value;
        for (int i = 0; i < temperatureData.length; i++) {
            value = r.nextFloat();
            temperatureData[i] = MIN_TEMP + value * (MAX_TEMP - MIN_TEMP);
        }
        return temperatureData;
    }

    public static String getReport(float[] temperatureData) {

        String patientTemp = "";
        float summary = 0F;
        int count = 0;
        float avgTemp;

        var builder = new StringBuilder();

        for (int i = 0; i < temperatureData.length; i++) {
            float temp = temperatureData[i];
            summary += temp;
            temp = (float) round(temp * 10) / 10;
            if (temp >= 36.2F && temp <= 36.9F) {
                count++;
            }
            if (i != temperatureData.length - 1){
                patientTemp = String.valueOf(builder.append(temp).append(" "));
            } else{
                patientTemp = String.valueOf(builder.append(temp));
            }
        }

        avgTemp = (float) (round ((summary / temperatureData.length) * 100)) / 100;


        return "Температуры пациентов: " + patientTemp +
                "\nСредняя температура: " + avgTemp +
                "\nКоличество здоровых: " + count;
    }
}
