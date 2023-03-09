
public class Main {
    // Перегрузка методов, это два или более методов с одинаковым названием, но разным набором параметров
    // В перегруженных методах должны отличаться количество параметров, либо их тип
    // Мы можем не создавать объект, а обращаться напрямую к классу, если методы не используют переменных экземпляра если он static Math.method()
    // public defaul method - доступен в области выбранного пакета, если не указан модификатор public, по умолчанию он defaul private.
    // static значит члены класса относятся к какому-то конкретному классу, но не к объету
    // final запрещаем изменять переменную
    // аргументы переменной длинны, это когда мы не знаем количество длинны int... num
    public static void main(String[] args) {

//        System.out.println(MyMath.multiple(10,5));
//        System.out.println(MyMath.multiple(10.5,5));
//        System.out.println(MyMath.multiple(10,3,5));
//        System.out.println(Math.sqrt(36));
//        Box box = new Box(10);
//        box.showVolume();
//        Monster monster = new Monster();
//        monster.voice(5,"KEK");

//        Box current = new Box(30);
//        Box another = current.incres();
//        current.showVolume();
//        another.showVolume();
////
//
//        Person person = new Person(33,"John");
//        System.out.println(person.getName() + "  " + person.getAge());
        System.out.println(MyMath.length(10));
        System.out.println(MyMath.area(10));


    }
}
