public class Main {
    public static void main(String[] args) {

        //Task 1
        int one = 1;
        System.out.println(one);
        byte two = 2;
        System.out.println(two);
        short three = 3;
        System.out.println(three);
        long four = 4;
        System.out.println(four);
        float five = 5.3F;
        System.out.println(five);
        double six = 6.3223;
        System.out.println(six);

        //Task 2
        float oneOne = 27.12F;
        System.out.println(oneOne);
        long twoTwo = 987678965549L;
        System.out.println(twoTwo);
        float threeThree = 2.786f;
        System.out.println(threeThree);
        boolean threeThreeThree = false;
        System.out.println(threeThreeThree);
        short fourFour = 569;
        System.out.println(fourFour);
        short fiveFive = -159;
        System.out.println(fiveFive);
        short sixSix = 27897;
        System.out.println(sixSix);
        byte sixSixSix = 67;
        System.out.println(sixSixSix);

        //Task 3
        byte clasPav = 23;
        byte clasSer = 27;
        byte clasAnd = 30;
        short allPaper = 480;
        int studentPaper = allPaper / (clasAnd + clasSer + clasPav);
        System.out.println("На каждого ученика расчитанно " + studentPaper + " листов бумаги");

        //Task 4
        byte twoMinWork = 16;
        int oneMinWork = twoMinWork / 2;
        byte twentyMin = 20;
        int twentyMinWork = oneMinWork * twentyMin;
        System.out.println("За " + twentyMin + " минунт работы машины произвела бутылок " + twentyMinWork + " штук");

        byte allDay = 1;
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        int allDayWork = oneMinWork * minutesInHour * hoursInDay;
        System.out.println("За " + allDay + " сутки работы машины произвела бутылок " + allDayWork + " штук");

        int threeDays = allDay * 3;
        int threeDaysWork = threeDays * allDayWork;
        System.out.println("За " + threeDays + " сутки работы машины произвела бутылок " + threeDaysWork + " штук");

        int allMonth = 1;
        int daysAtMonth = allDay * 30;
        int allMonthWork = allDayWork * daysAtMonth;
        System.out.println("За " + allMonth + " месяц работы машины произвела бутылок " + allMonthWork + " штук");

        //Task 5
        byte allJars = 120;
        byte oneClassWhiteJar = 2;
        byte oneClassBrownJar = 4;
        int oneClassAllJar = oneClassBrownJar + oneClassWhiteJar;
        int amountOfClasses = allJars / oneClassAllJar;
        int allClassesWhiteJars = oneClassWhiteJar * amountOfClasses;
        int allClassesBrownJars = oneClassBrownJar * amountOfClasses;
        System.out.println("В школе, где " +amountOfClasses + " классов нужно банок " + allClassesWhiteJars +
                " белой краски " + allClassesBrownJars + " и банок коричневой краски");

        //Task 6
        byte banana = 80;
        byte amountBananas = 5;
        byte milk = 105;
        byte amountOfMilk = 2;
        byte iceCream = 100;
        byte amountOfIceCream = 2;
        byte egg = 70;
        byte amountOfEggs = 4;
        int cocktail = banana * amountBananas + milk * amountOfMilk + iceCream * amountOfIceCream +
                egg * amountOfEggs;
        cocktail = cocktail / 1000;
        System.out.println("Вес коктейля " + cocktail + " кг");

        //Task 7
        short firstLostWeight = 250;
        short secondLostWeight = 500;
        int finalResult = 7;
        finalResult = finalResult * 1000;
        int daysFirstLostWeight = finalResult / firstLostWeight;
        finalResult = finalResult / 1000;
        System.out.println("Что бы похудеть на " + finalResult + " кг скидывая по " + firstLostWeight +
                " потребуется " + daysFirstLostWeight + " дней");
        finalResult = finalResult * 1000;
        int daysSecondLostWeight = finalResult / secondLostWeight;
        finalResult = finalResult / 1000;
        System.out.println("Что бы похудеть на " + finalResult + " кг скидывая по " + secondLostWeight +
                " потребуется " + daysSecondLostWeight + " дней");
        int mediumDays = (daysFirstLostWeight + daysSecondLostWeight) / 2;
        System.out.println("В среднем что бы похудеть на " + finalResult + " кг, потреубется " +
                mediumDays + " дней");

        //Task 8
        int mashaCash = 67760;
        int denisCash = 83690;
        int cristinaCash = 76230;
        float plusCash = 1.1f;
        short salaryInTheYear = 12;
        float newMashaCash = mashaCash * plusCash;
        float newMashaCashYear = (newMashaCash * salaryInTheYear) - (mashaCash * salaryInTheYear);
        System.out.println("Маша теперь получает " + newMashaCash + " рублей. Годовой доход вырос на " +
                newMashaCashYear + " рублей");
        float newDenisCash = denisCash * plusCash;
        float newDenisCashYear = (newDenisCash * salaryInTheYear) - (denisCash * salaryInTheYear);
        System.out.println("Денис теперь получает " + newDenisCash + " рублей. Годовой доход вырос на " +
                newDenisCashYear + " рублей");
        float newCristinaCash = cristinaCash * plusCash;
        float newCristinaCashYear = (newCristinaCash * salaryInTheYear) - (cristinaCash * salaryInTheYear);
        System.out.println("Кристина теперь получает " + newCristinaCash + " рублей. Годовой доход вырос на " +
                newCristinaCashYear + " рублей");
    }
}