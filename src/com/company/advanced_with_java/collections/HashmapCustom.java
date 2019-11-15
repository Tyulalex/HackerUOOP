package com.company.advanced_with_java.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class HashmapCustom<T> {

    HashMap<String, String> hashMap = new HashMap<>();

    //TODO когда доходим до заполнения  .75 от текущего размера массива - увеличиваем в 2 раза
    // конструктор с

    public static final int M = 9_999_999;
    static final float DEFAULT_LOAD_FACTOR = 0.75F;
    private int capacity;
    private int threshold;

    public Object[] massiv = new Object[M];

    public HashmapCustom(int capacity) {
        this.massiv = new Object[capacity];
        this.capacity = capacity;
        this.threshold = (int) (capacity * DEFAULT_LOAD_FACTOR);
    }

    public HashmapCustom() {
        this(M);
    }

    private class Entry {

        // Сущность, которая хранится в нашей корзине (buckets). Как было сказано, в корзине может быть несколько сущностей из-за коллизии
        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        Object key;
        Object value;
    }


    public void put(Object key, String value) {
        int size = (int) Arrays.stream(massiv).filter(Objects::nonNull).count();
        if (size >= this.threshold) {
            this.capacity = this.capacity * 2;
            this.threshold = (int) (capacity * DEFAULT_LOAD_FACTOR);
            resize(this.capacity);
        }

        int index = hash(key);
        LinkedList<Entry> entries = (LinkedList<Entry>) massiv[index];
        if (entries == null) {
            entries = new LinkedList<>();
            Entry entry = new Entry(key, value);
            entries.add(entry);
            massiv[index] = entries;
        } else {
            Entry entry = new Entry(key, value);
            entries.add(entry);
        }
    }

    private void resize(int newCapacity) {
        Object[] oldArray = new Object[this.massiv.length];
        System.arraycopy(this.massiv, 0, oldArray, 0, this.massiv.length);

        // Object[] oldArray = Arrays.stream(this.massiv).toArray(String[]::new);
        this.massiv = new Object[newCapacity];
        for (int i = 0; i < oldArray.length; i++) {
            LinkedList<Entry> entries = (LinkedList<Entry>) oldArray[i];
            if (entries != null) {
                for (Entry entry : entries) {
                    this.put(entry.key, (String) entry.value);
                }
            }
        }
    }

    /**
     * Поскольку нам нужен индекс массива, а не 32-битное число, мы в наших реализациях
     * объединяем вызов hashCode() с модульным хешированием, которые нам дает целые числа от 0 до М-1.
     * В идеале, пользовательская функция hashCode() должна равномерно распределять ключи на все 32-битные значения
     * результата.
     * То есть для любого объекта можно записать x.hashCode() и в принципе ожидать, что с одинаковой вероятностью  будет
     * возвращено одно из 2^32 значений.
     * РЕАЛИЗАЦИЯ в Java для типов String, Integer, Double, File, URL придерживается этого соглашения. Но для собственного
     * типа стоит делать это самостоятельно.
     *
     * @param key
     * @return index массива
     */
    private int hash(Object key) {//вся магия хеширования по сути здесь, получить индекс в массиве и все, счастье близко. Если бы не было коллизий полностью, было бы идеально.
        int h = Objects.hashCode(key);
        int index = (h & 0x7fff_ffff)
                % this.capacity;// это маскирование знакового бита (чтобы превратить 32-битное число в неотрицательное 31-битное), а затем как в модульном хешировании, вычисляем остаток от деления;
        //при таком подходе в качестве размера хеш-таблицы берут ПРОСТОЕ число, тогда задействуются все биты хеш-кода и мы как-то минимизируем коллизию
        return index;
    }

    /**
     * Получить объект по ключу
     *
     * @param key
     * @return
     */
    public Object get(Object key) {
        int index = hash(key);
        LinkedList<Entry> entries = (LinkedList<Entry>) massiv[index];
        if (entries != null && entries.size() == 1) {//идеальная ситуация, коллизий нет, в корзине один элемент - просто берем его из связанного списка и все.
            return entries.get(0).value;
        } else if (entries != null) {//не очень хорошо, у нас коллизия, нужно что-то делать
            for (int i = 0; i < entries.size(); i++) {
                Entry entry = entries.get(i);
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
            // TODO: подумайте как здесь сделать поиск нужного ключа, если в процессе добавления у нас возникли коллизии и в одной корзине более одного ключа со своим собственным значением
            // вспомните про контракт поиска по хешу - сначала использует hashCode, потом equals!

        }
        return null;
    }
}