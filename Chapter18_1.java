import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Chapter18_1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<Integer> list2= new ArrayList<Integer>();

        list1.add("���");
        list1.add("�݂���");

        list1.add(1, "�o�i�i");

        System.out.println(list1.get(0)); 
        System.out.println("�o�i�i:" + list1.contains("�o�i�i"));
        System.out.println("�Ȃ�:" + list1.contains("�Ȃ�"));  
        System.out.println(list1.size());

        list1.remove("�o�i�i");

        System.out.println("�o�i�i:" + list1.contains("�o�i�i"));
    }
}
