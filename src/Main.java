public class Main {
    public static  void main (String[] args){
        //Задача 1
        System.out.println("Task 1");
        byte b = 20;
        short s = 530;
        int i = 1000;
        long l = 1000000000L;

        float f =3.14f;
        double d = 5.7;

        char c  = 'e';

        boolean bl = true;

        //Задача 2
        System.out.println("Task 2");
        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float totalWeight = weight1 + weight2;
        float difWeight = Math.abs(weight1 -weight2);
        System.out.println("Общий вес: " + totalWeight+ " кг");
        System.out.println("Разница между весами бойцов: " + difWeight+ " кг");

        //Задача 3
        System.out.println("Task 3");
        short bananas = 5;
        short milk = 200;
        short iceCream = 2;
        short eggs = 4;
        double breakfast = bananas*80 + milk*1.05 + iceCream*100 +eggs*70;
        System.out.println("Общий вес завтрака: " + breakfast/1000 + " кг");

        //Задача 4
        System.out.println("Task 4");
        short need = 7000;
        short weightCase1 = 250;
        short weightCase2 = 500;
        int daysCase1 = need/weightCase1;
        int daysCase2 = need/weightCase2;
        System.out.println("Потребуется " + daysCase1 + " дней на похудение, если худеть на 250гр каждый деть");
        System.out.println("Потребуется " + daysCase2 + " дней на похудение, если худеть на 500гр каждый деть");
        System.out.println("В среднем на похудение потребуется " + (daysCase1+daysCase2)/2 + " дней");

        //Задача 5
        System.out.println("Task 5");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        short inc = 10;

        int newSalaryMasha = salaryMasha + (salaryMasha * inc/100);
        int annualIncomeMasha = newSalaryMasha*12 - salaryMasha*12;
        System.out.println("Маша теперь получает "+ newSalaryMasha + " рублей. Годовой доход вырос на " + annualIncomeMasha + " рублей");

        int newSalaryDenis = salaryDenis + (salaryDenis * inc/100);
        int annualIncomeDenis = newSalaryDenis*12 - salaryDenis*12;
        System.out.println("Денис теперь получает "+ newSalaryDenis + " рублей. Годовой доход вырос на " + annualIncomeDenis + " рублей");

        int newSalaryKristina = salaryKristina + (salaryKristina * inc/100);
        int annualIncomeKristina = newSalaryKristina*12 - salaryKristina*12;
        System.out.println("Кристина теперь получает "+ newSalaryKristina + " рублей. Годовой доход вырос на " + annualIncomeKristina + " рублей");
    }
}