package Demo01;
/**
 * java.lang.String类代表字符串。
 * API当中说：Java程序中的所有字符串字面值（如“abc”）都作为此类的实例实现。
 * 其实就是说：程序当中所有双引号字符串，都是String类对象。（就算没有new,也照样是。）
 *
 * 字符串的特点:
 * 1.字符串的内容用不可变。【重点】
 * 2.正是因为字符串不可改变，所以字符串是可以共享使用的。
 * 3.字符串效果上相当于是char【】字符数组，但是底层原理是byte【】字节数组。
 *
 * 创建字符串的常见3+1种方式。
 * 三种构造方法：
 * public String()：创建一个空白字符串，不含有任何内容。
 * public String(char[] array)：根据字符数组的内容，来创建对应的字符串。
 * public String()：根据字节数组的内容来创建字符串。
 * 一种直接创建：
 * String str="直接创建";
 *
 * 注意：直接写上字符串，就是字符串对象。
 */
public class Demo01 {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();//小括号留空，说明字符串什么内容都没有。
        System.out.println("第一个字符串："+str1);

        //根据字符数组创建字符串
        char[] charArray={'A','B','C'};
        String str2=new String(charArray);
        System.out.println(str2);

        //根据字节数组创建字符串
        byte[] byteArray={96,98,99};
        String str3=new String(byteArray);
        System.out.println("第三个字符串："+str3);

        //直接创建
        String str4="小明";
        System.out.println(str4);
    }
}
