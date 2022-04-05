package help;

       public class RandomDate {

       public static int randomDate(int start, int end)                   // метод рандомной даты календаря, числа подставлены в тесте
       {
                  return start + (int) (Math.random() * (end - start));
       }
}
