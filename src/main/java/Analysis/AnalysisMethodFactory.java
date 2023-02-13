package Analysis;

import ViewerFactory.Chart;

public class AnalysisMethodFactory {
    public AnalysisStrategy getAnalysisStrategy(String methodType, Chart chart,String countryName, int startYear, int endYear) {
        if (methodType == null) {
            return null;
        }
        if (methodType.equalsIgnoreCase("CO2 Energy PM25 Method")) {
            return new CO2_Energy_PM25_Method(chart, countryName, startYear, endYear);
                   }
        else if (methodType.equalsIgnoreCase("PM25 Forest Method")){
            return new PM25_Forest_Method(chart,countryName,startYear,endYear);
        } else if (methodType.equalsIgnoreCase("CO2 GDP Method")) {
            return new CO2_GDP_Method(chart, countryName, startYear, endYear);
        }
        else if (methodType.equalsIgnoreCase("Education Percent GDP Method")){
            return new Education_Percent_GDP_Method(chart,countryName,startYear,endYear);
        }
        else if(methodType.equalsIgnoreCase("Health Expenditure Hospital Bed Method")){
            return new Health_Expenditure_Hospital_Bed_Method(chart,countryName,startYear,endYear);
        }
        else if (methodType.equalsIgnoreCase("Problem Access Health Women Mortality Method")){
            return new Problem_Access_Health_Women_Mortality_Method(chart,countryName,startYear,endYear);
        }
        else if (methodType.equalsIgnoreCase("Education Percent GDP And Health Method")){
            return new Education_Percent_GDP_And_Health_Method(chart,countryName,startYear,endYear);
        }else if (methodType.equalsIgnoreCase("Forest Method"))
        {
            return new Forest_Method(chart,countryName,startYear,endYear);
        }
            return null;
        }


}

