/**
 int compareTo(E o)
 比较此枚举与指定对象的顺序。

 Class<E> getDeclaringClass()
 返回与此枚举常量的枚举类型相对应的 Class 对象。

 String name()
 返回此枚举常量的名称，在其枚举声明中对其进行声明。

 int ordinal()
 返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。

 String toString()

 返回枚举常量的名称，它包含在声明中。

 static <T extends Enum<T>> T valueOf(Class<T> enumType, String name)
 返回带指定名称的指定枚举类型的枚举常量。
 */
public enum Color {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private Color(String name, int index) {
        this.name = name;
        this.index = index;
    }


    // 普通方法
    public static String getName(int index) {
        for (Color c : Color.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public static int getIndex(String name) {
        for (Color c : Color.values()) {
            if (c.getName().equals(name)) {
                return c.index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Color.RED.name);
        System.out.println(Color.RED.index);
        System.out.println(Color.valueOf("RED"));

        System.out.println(getName(2));
        System.out.println(getIndex("白色"));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}