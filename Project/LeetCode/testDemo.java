package Project.LeetCode;

public class testDemo {
    public static void main(String[] args) { 
        
        int[] test = {5, 0, 3, 8, 6};           //测试数据
        Solution objTest = new Solution();      //创建对象

        System.out.println("left数组长度为: " + objTest.partitionDisjoint(test));
    }
}
