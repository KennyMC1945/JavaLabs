public class Lab3 {
    public static void main(String[] args){
        ArrayCollection<Integer> arr = new ArrayCollection<>();
        // Проверка коллекции на основе словаря
        System.out.println("----- Коллекция на основе массива -----");
        testCollection(arr);
        // Проверка коллекции на основе связного списка
        System.out.println("----- Связный список -----");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        testCollection(list);
    }

    public static void testCollection(IMyCollection<Integer> arr) {
        Integer[] testArr = new Integer[] { 2, 3 , 1 ,7 , 10 };
        System.out.println("---Проверка добавления---");
        arr.addAll(testArr);
        System.out.println("Ожидаем: 2 3 1 7 10");
        System.out.print("Получаем: "); arr.print();
        System.out.println("---Проверка получения---");
        System.out.println("Ожидаем - 1, Результат - " + arr.get(2));
        try {
            System.out.println(arr.get(5)); // макс индекс 4
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выпало исключение при индексе в 5");
        }
        arr.remove(1);
        System.out.println("---Проверка удаления---");
        System.out.println("Ожидаем: 2 1 7 10");
        System.out.print("Получили: "); arr.print();
    }
}
