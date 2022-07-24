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
    }
}