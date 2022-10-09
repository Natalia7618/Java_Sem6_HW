import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        //1. Объявить и инициализировать множества HashSet hs, LinkedHashSet lhs и TreeSet ts
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        System.out.println("Задание #1: Множества HashSet hs, LinkedHashSet lhs и TreeSet ts объявлены и инициализированы");
        System.out.println("----");

        //2. Добавить в множества по 10 случайных целочисленных ключей.
        System.out.println("Задание #2: Ключи добавлены:");
        for (int i = 0; i < 10; i++) {
            int n = new Random().nextInt(100);
            hs.add(n);
            n = new Random().nextInt(100);
            lhs.add(n);
            n = new Random().nextInt(100);
            ts.add(n);
        }

        hs.forEach(n -> System.out.println("Ключ множества hs: " + n));
        System.out.println("----");
        lhs.forEach(n -> System.out.println("Ключ множества lhs: " + n));
        System.out.println("----");
        ts.forEach(n -> System.out.println("Ключ множества ts: " + n));

        //3. Пройти по множеству hs и, при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs
        Iterator<Integer> iterator = hs.iterator();    
        List<Integer> removed = new ArrayList<>();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (lhs.contains(element)) {
                removed.add(element);
                iterator.remove();
            }
        }
        System.out.println("----");
        System.out.println("Задание #3: ");
        hs.forEach(n -> System.out.println("Ключ множества hs после обработки: " + n));
        System.out.println("Удалённые элеметы:");
        removed.forEach(r -> System.out.println(r));


        //4. Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в множестве ts, добавит ключ в ts
        Iterator<Integer> iterator1 = lhs.iterator();    
        List<Integer> added = new ArrayList<>();
        while (iterator1.hasNext()) {
            int element = iterator1.next();
            if (!ts.contains(element)) {
                added.add(element);
                ts.add(element);
            }
        }

        System.out.println("----");
        System.out.println("Задание #4: ");
        ts.forEach(n -> System.out.println("Ключ множества ts после обработки: " + n));
        System.out.println("Добавленные элеметы:");
        added.forEach(r -> System.out.println(r));
                
        //5. Объявить и инициализировать множество TreeSet ts1 с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить ts1 15 случайными числами и вывести на печать.
        TreeSet<Integer> ts1 = new TreeSet<>();
        for (int i = 0; i < 15; i++){
            int n = compare(new Random().nextInt(100));
            ts1.add(n);
        }
        System.out.println("Задание #5: " + ts1);

        //6. *Объявить и инициализировать множество TreeMap tm с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить tm 15 случайными числами и вывести на печать.
        TreeMap<Integer, Integer> tm = new TreeMap();
        for (int i = 0; i < 15; i++){
            int n = compare(new Random().nextInt(100));
            tm.put(i, n);
        }
        System.out.println("Задание #6: " + tm);
    }

    public static int compare(int s) {
        if (s % 2 == 0) {
            return -1;
        } else if (s == 0) {
            return 0;
        } else return 1;
    }
}