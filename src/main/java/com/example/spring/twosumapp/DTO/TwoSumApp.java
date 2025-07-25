package com.example.spring.twosumapp.DTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
public class TwoSumApp {
    //modelling data from getting user json>java dto
    //Kullanıcıdan gelen veriyi almak veya
    // kullanıcıya veri göndermek için bir kapsayıcı (model) oluşturmaktır.
    private int[] nums;
    private int target;

    public int getTarget() {
        return target;
    }
    public void setTarget(int target) {
        this.target = target;
    }
    public int[] getNums() {
        return nums;
    }
    public void setNums(int[] nums) {
        this.nums = nums;
    }

}
