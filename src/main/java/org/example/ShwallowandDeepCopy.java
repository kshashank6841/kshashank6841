package org.example;

public class ShwallowandDeepCopy {
    public static void main(String[] args) {


        Student st = new Student(1, "RAM");
        Student shwallow_copied_st = st; //shwallowed_copy
        Student deep_copied_st = st.clone();//deep_copy

        System.out.println("Original Obj = " + st.toString() + " " + " Deep Copied Obj = " + deep_copied_st.toString() + " Shwallowed Coped obj = " + shwallow_copied_st.toString());

        st.setId(2);

        System.out.println("Original Obj = " + st.toString() + " " + " Deep Copied Obj = " + deep_copied_st.toString() + " Shwallowed Coped obj = " + shwallow_copied_st.toString());
    }
}
