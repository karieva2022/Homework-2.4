@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        byte day = 25;
        System.out.println("Значение переменной day с типом byte равно " + day);
        short hour = 214;
        System.out.println("Значение переменной hour с типом short равно " + hour);
        int second = 310;
        System.out.println("Значение переменной second с типом int равно " + second);
        long lightYears = 150000000L;
        System.out.println("Значение переменной d с типом long равно " + lightYears);
        float i = 1.3f;
        System.out.println("Значение переменной i с типом float равно " + i);
        double f = 2.3;
        System.out.println("Значение переменной f с типом double равно " + f);

        // Задача 2
        System.out.println("Задача 2");

        float v1 = 27.12f;
        long v2 = 987678965549L;
        double v3 = 2.786;
        boolean v4 = false;
        char v5 = 569;
        short v6 = -159;
        int v7 = 27897;
        byte v8 = 67;

        // Задача 3
        System.out.println("Задача 3");

        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short sheetsOfPaper = 480;
        int totalStudents = ekaterinaAndreevna + lyudmilaPavlovna + annaSergeevna;
        System.out.println("На каждого ученика рассчитано " + (sheetsOfPaper/totalStudents) + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");

        byte machinePerformance = 16;
        int oneMinute = machinePerformance/2;
        System.out.println("oneMinute");
        int twentyMinutes = oneMinute*20;
        System.out.println("За 20 минут машина произвела бутылок " + twentyMinutes + " штук" );
        int perDay = oneMinute*1440;
        System.out.println("За сутки машина произвела бутылок " + perDay + " штук" );
        int inThreeDays = oneMinute*4320;
        System.out.println("За 3 дня машина произвела бутылок " + inThreeDays + " штук" );
        int oneMonth = oneMinute*44640;
        System.out.println("За один месяц машина произвела бутылок " + oneMonth + " штук" );

        // Задача 5
        System.out.println("Задача 5");

        byte whitePaint = 2;
        byte brownPaint = 4;
        int oneClass = whitePaint+brownPaint;
        int totalClasses = 120/oneClass;
        int totalWhitePaint = totalClasses*whitePaint;
        int totalBrownPaint = totalClasses*brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски. ");

        // Задача 6
        System.out.println("Задача 6");

        short bananas = 5*80;
        short milk = 200/100*105;
        short iceCreamSundae = 2*100;
        short eggs = 4*70;
        float weightGr = bananas+milk+iceCreamSundae+eggs;
        int grPerKg = 1000;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println(weightKg);

        // Задача 7
        System.out.println("Задача 7");

        byte needToReset = 7;
        int grPerKg1 = 1000;
        short losingWeight1 = 250;
        short losingWeight2 = 500;
        int weightKg1 = needToReset*grPerKg1;
        int weightLoss1 = weightKg1/losingWeight1;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, нужно " + weightLoss1 + " дней чтобы похудеть на 7 кг");
        int weightLoss2 = weightKg1/losingWeight2;
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, нужно " + weightLoss2 + " дней чтобы похудеть на 7 кг");
        int averageNumberOfDays = (weightLoss1+weightLoss2)/2;
        System.out.println("В среднем спортсмену понадобится " + averageNumberOfDays + " дней чтобы похудеть на 7 кг");

        // Задача 8
        System.out.println("Задача 8");

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int beforePromotionMasha = Masha*12;
        System.out.println(beforePromotionMasha);
        int beforePromotionDenis = Denis*12;
        System.out.println(beforePromotionDenis);
        int beforePromotionKristina = Kristina*12;
        System.out.println(beforePromotionKristina);
        int salaryDisclosureMasha = (Masha/100*10) + Masha;
        System.out.println(salaryDisclosureMasha);
        int salaryDisclosureDenis = (Denis/100*10) + Denis ;
        System.out.println(salaryDisclosureDenis);
        int salaryDisclosureKristina = (Kristina/100*10) + Kristina;
        System.out.println(salaryDisclosureKristina);
        int annualSalaryDeductionMasha = salaryDisclosureMasha*12;
        int annualSalaryDeductionDenis = salaryDisclosureDenis*12;
        int annualSalaryDeductionKristina = salaryDisclosureKristina*12;
        int differenceMasha = annualSalaryDeductionMasha-beforePromotionMasha;
        int differenceDenis = annualSalaryDeductionDenis-beforePromotionDenis;
        int differenceKristina = annualSalaryDeductionKristina-beforePromotionKristina;
        System.out.println("Маша теперь получает " + salaryDisclosureMasha + "рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDisclosureDenis + "рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryDisclosureKristina + "рублей. Годовой доход вырос на " + differenceKristina + " рублей");


































    }
}