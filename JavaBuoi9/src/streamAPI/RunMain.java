package streamAPI;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(4);
        list.add(10);


//        //filter : lọc: lọc ra các phần tử thỏa mãn các điều kiện
//        ArrayList res1 = (ArrayList) list.stream().filter((item) -> {
//
//        }
//        ).collect(Collectors.toList());

        //map : trả về 1 mảng giữ nguyên số lượng phần tử trong mảng và có thể thay đổi giá trị của phần tử trong mảng đó
        System.out.println(list.stream().map(item -> {
            if(item % 2 == 0){
                return item;
            }
            return 0;
        }).collect(Collectors.toList()));

        System.out.println(list.stream().skip(5).map(item -> {
            if(item % 2 == 0 ){
                return item;
            }
            return 0;
        }).collect(Collectors.toList()));
    }
}
